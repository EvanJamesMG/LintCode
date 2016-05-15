/*
有一个机器人的位于一个M×N个网格左上角（下图中标记为'Start'）。

机器人每一时刻只能向下或者向右移动一步。机器人试图达到网格的右下角（下图中标记为'Finish'）。
问有多少条不同的路径？
 注意事项

n和m均不超过100
*/

public class Solution {
    /**
     * @param n, m: positive integer (1 <= n ,m <= 100)
     * @return an integer
     */
    public int uniquePaths(int m, int n) {
    	int[][] dp  = new int[m+1][n+1];
    	for(int i=1;i<=m;i++)
    		dp[i][1] = 1;
    	for(int j=1;j<=n;j++)
    		dp[1][j] = 1;
    	for(int i=2;i<=m;i++){
    		for(int j=2;j<=n;j++){
    			dp[i][j] = dp[i-1][j]+dp[i][j-1];
    		}
    	}
		
    	return dp[m][n];
    }
}
