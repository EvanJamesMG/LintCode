/*
"��ͬ��·��" �ĸ������⣺

���ڿ������������ϰ�����������ж�������ͬ��·����

�����е��ϰ��Ϳ�λ�÷ֱ��� 1 �� 0 ����ʾ��

 ע������

 m �� n ��������100

����
������ʾ��3x3����������һ���ϰ��

[
  [0,0,0],
  [0,1,0],
  [0,0,0]
]
һ����2����ͬ��·�������Ͻǵ����½ǡ�
*/

public class Solution {
    /**
     * @param obstacleGrid: A list of lists of integers
     * @return: An integer
     */
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
    	int m = obstacleGrid.length;
    	int n = obstacleGrid[0].length;
    	int[][] dp = new int[m][n];
    	
    	for(int i=0;i<m;i++){
    		if(obstacleGrid[i][0]!=1)
    			dp[i][0]=1;
    		else{
    			break;
    		}
    	}
    	
    	for(int j=0;j<n;j++){
    		if(obstacleGrid[0][j]!=1)
    			dp[0][j]=1;
    		else{
    			break;
    		}
    	}
    	
    	for(int i=1;i<m;i++){
    		for(int j=1;j<n;j++){
    			if(obstacleGrid[i][j]==1)
    				dp[i][j]=0;
    			else{
    				dp[i][j] = dp[i-1][j]+dp[i][j-1];
    			}
    		}
    	}
		return dp[m-1][n-1];
	}
}