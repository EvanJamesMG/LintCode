/*
给出 n，问由 1...n 为节点组成的不同的二叉查找树有多少种？

样例
给出n = 3，有5种不同形态的二叉查找树：

1           3    3       2      1
 \         /    /       / \      \
  3      2     1       1   3      2
 /      /       \                  \
2     1          2                  3
*/

public class Solution {
    /**
     * @paramn n: An integer
     * @return: An integer
     */
    public int numTrees(int n) {
		if(n<=0)
			return 1;
		if(n==1)
			return 1;
		if(n==2)
			return 2;
		if(n==3)
			return 5;
		int[] dp = new int[n+1];
		dp[0]=1;
		dp[1]=1;
		dp[2] = 2;
    	for(int i=3;i<=n;i++){
    		int tem = 0;
    		for(int k=0;k<=i-1;k++){
    			tem += dp[k]*dp[i-k-1];
    		}
    		dp[i] = tem;
    	}
		
    	return dp[n];
    }
}