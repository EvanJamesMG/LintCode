/*
����һ��ֻ���Ǹ�������m*n�����ҵ�һ�������Ͻǵ����½ǵĿ���ʹ���ֺ���С��·����

 ע������

����ͬһʱ��ֻ�����»��������ƶ�һ��
*/
public class Solution {
    /**
     * @param grid: a list of lists of integers.
     * @return: An integer, minimizes the sum of all numbers along its path
     */
    public int minPathSum(int[][] grid) {
		if(grid.length==0)
			return 0;
    	int m = grid.length;
		int n = grid[0].length;
		
    	int[][] dp = new int[m+1][n+1];
    	dp[1][1] = grid[0][0];
    	for(int i=1;i<=m;i++){
			dp[i][1] = dp[i-1][1] + grid[i-1][0];
		}	
    	for(int j=1;j<=n;j++){
    		dp[1][j] = dp[1][j-1] + grid[0][j-1];
    	}
    	
    	for(int i=2;i<=m;i++){
    		for(int j=2;j<=n;j++){
    			dp[i][j] = Math.min(dp[i-1][j],dp[i][j-1])+grid[i-1][j-1];
    		}
    	}
    	return dp[m][n];
    }
}
