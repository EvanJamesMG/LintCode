/*
Given a 2D binary matrix filled with 0's and 1's, find the largest square containing all 1's and return its area.

����
For example, given the following matrix:

1 0 1 0 0
1 0 1 1 1
1 1 1 1 1
1 0 0 1 0
Return 4.
*/

/*
��̬�滮��Dynamic Programming��

״̬ת�Ʒ��̣�

dp[x][y] = min(dp[x - 1][y - 1], dp[x][y - 1], dp[x - 1][y]) + 1
��ʽ�У�dp[x][y]��ʾ������(x, y)Ϊ���½�Ԫ�ص�ȫ1�����ξ������󳤶ȣ���ȣ�
*/
public class Solution {
    /**
     * @param matrix: a matrix of 0 and 1
     * @return: an integer
     */
    public int maxSquare(int[][] matrix) {
        // write your code here
    	if(matrix==null || matrix.length==0)
    		return 0;
    	int maxres = Integer.MIN_VALUE;
    	int m = matrix.length;
    	int n = matrix[0].length;
    	int[][] dp = new int[m][n];
    	for(int i=0;i<m;i++){
    		dp[i][0] = matrix[i][0];
    		maxres = Math.max(maxres, dp[i][0]);
    	}
    	
    	for(int j=0;j<n;j++){
    		dp[0][j] = matrix[0][j];
    		maxres = Math.max(maxres, dp[0][j]);
    	}
    	for(int i=1;i<m;i++){
    		for(int j=1;j<n;j++){
    			if(matrix[i][j]==1)
    				dp[i][j] = Math.min(Math.min(dp[i-1][j], dp[i][j-1]), dp[i-1][j-1])+1;
    			else{
    				dp[i][j]=0;
    			}
    			maxres = Math.max(maxres, dp[i][j]);
    		}
    	}
    	
    	return maxres*maxres;
    }
}