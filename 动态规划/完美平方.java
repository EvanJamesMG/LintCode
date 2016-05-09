/*
给一个正整数 n, 找到若干个完全平方数(比如1, 4, 9, ... )使得他们的和等于 n。你需要让平方数的个数最少。
样例
给出 n = 12, 返回 3 因为 12 = 4 + 4 + 4。
给出 n = 13, 返回 2 因为 13 = 4 + 9。
*/
public class Solution {
    /**
     * @param n a positive integer
     * @return an integer
     */
    public int numSquares(int n) {
    	int[] dp  = new int[n+1];

    	for(int i=1;i<=n;i++){
    		dp[i] = Integer.MAX_VALUE;
    		for(int j=1;j*j<=i;j++){
    			dp[i] = Math.min(dp[i], dp[i-j*j]+1);
    		}
    	}
		return dp[n];
	}
}