	/*
	在n个物品中挑选若干物品装入背包，最多能装多满？假设背包的大小为m，每个物品的大小为A[i]

      注意事项
	   你不可以将物品进行切割。

		样例
		如果有4个物品[2, 3, 5, 7]

		如果背包的大小为11，可以选择[2, 3, 5]装入背包，最多可以装满10的空间。

		如果背包的大小为12，可以选择[2, 3, 7]装入背包，最多可以装满12的空间。

		函数需要返回最多能装满的空间大小。
	*/
	
	/* http://blog.csdn.net/kangroger/article/details/38864689
	 * 动态规划先找出子问题，我们可以这样考虑：在物品比较少，背包容量比较小时怎么解决？
	 * 用一个数组f[i][j]表示，在只有i个物品，容量为j的情况下背包问题的最优解，那么当物品种类变大为i+1时，最优解是什么？
	 * 第i+1个物品可以选择放进背包或者不放进背包 (这也就是0和1)
	 * 假设放进背包（前提是放得下），那么f[i+1][j]=f[i][j-weight[i+1]+value[i+1];
	 * 如果不放进背包，那么f[i+1][j]=f[i][j].
	 * 这就得出了状态转移方程：
	 *   f[i+1][j]=max(f[i][j],f[i][j-weight[i+1]+value[i+1])。
	 */
	 
   /**
     * @param m: An integer m denotes the size of a backpack
     * @param A: Given n items with size A[i]
     * @return: The maximum size
     */
    public int backPack(int m, int[] A) {
    	// write your code here
    	int len = A.length;
    	int[][] dp = new int[len+1][m+1];
    	for(int i=1;i<=len;i++){
    		for(int j=1;j<=m;j++){
    			//包的容量允许第i个物品可以放入包中
    			if(A[i-1]<=j){
    				//第i个物品放入包中 和   第i个物品不放进包中  两者取最大值
    				dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-A[i-1]]+A[i-1]);
    			}
    			//包的容量放不下第i个物品了
    			else{
    				dp[i][j] = dp[i-1][j];
    			}
    		}
    	}
    	return dp[len][m];
    }
