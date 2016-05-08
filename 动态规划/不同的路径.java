/*
��һ�������˵�λ��һ��M��N���������Ͻǣ���ͼ�б��Ϊ'Start'����

������ÿһʱ��ֻ�����»��������ƶ�һ������������ͼ�ﵽ��������½ǣ���ͼ�б��Ϊ'Finish'����
���ж�������ͬ��·����
 ע������

n��m��������100

*/

public class Solution {
    /**
     * @param n, m: positive integer (1 <= n ,m <= 100)
     * @return an integer
     */
    public int uniquePaths(int m, int n) {
    	int[][] dp  = new int[m+1][n+1];
    	for(int i=0;i<m;i++)
    		dp[i][0] = 1;
    	for(int j=0;j<n;j++)
    		dp[0][j] = 1;
    	for(int i=1;i<m;i++){
    		for(int j=1;j<n;j++){
    			dp[i][j] = dp[i-1][j]+dp[i][j-1];
    		}
    	}
		
    	return dp[m-1][n-1];
    }
}
