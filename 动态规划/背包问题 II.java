	/*
	给出n个物品的体积A[i]和其价值V[i]，将他们装入一个大小为m的背包，最多能装入的总价值有多大？

	 注意事项

	A[i], V[i], n, m均为整数。你不能将物品进行切分。你所挑选的物品总体积需要小于等于给定的m。

	样例
	对于物品体积[2, 3, 5, 7]和对应的价值[1, 5, 2, 4], 假设背包大小为10的话，最大能够装入的价值为9。
	*/
	
	/*
	 * 动态规划先找出子问题，我们可以这样考虑：在物品比较少，背包容量比较小时怎么解决？
	 * 用一个数组f[i][j]表示，在只有i个物品，容量为j的情况下背包问题的最优解，那么当物品种类变大为i+1时，最优解是什么？
	 * 第i+1个物品可以选择放进背包或者不放进背包 (这也就是0和1)
	 * 假设放进背包（前提是放得下），那么f[i+1][j]=f[i][j-weight[i+1]+value[i+1];
	 * 如果不放进背包，那么f[i+1][j]=f[i][j].
	 * 这就得出了状态转移方程：
	 *   f[i+1][j]=max(f[i][j],f[i][j-weight[i+1]+value[i+1])。
	 */

public class Solution {
    /**
     * @param m: An integer m denotes the size of a backpack
     * @param A & V: Given n items with size A[i] and value V[i]
     * @return: The maximum value
     */
    public int backPackII(int m, int[] A, int V[]) {
    	int len = A.length;
    	int[][] dp = new int[len+1][m+1];
    	for(int i=1;i<=len;i++){
    		for(int j=1;j<=m;j++){
    			//包的容量允许第i个物品可以放入包中
    			if(A[i-1]<=j){
    				//第i个物品放入包中 和   第i个物品不放进包中  两者取最大值
    				dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-A[i-1]]+V[i-1]);
    			}
    			//包的容量放不下第i个物品了
    			else{
    				dp[i][j] = dp[i-1][j];
    			}
    		}
    	}
    	return dp[len][m];
    }
}