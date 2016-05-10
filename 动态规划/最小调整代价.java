/*
给一个整数数组，调整每个数的大小，使得相邻的两个数的差小于一个给定的整数target，调整每个数的代价为调整前后的差的绝对值，求调整代价之和最小是多少。

 注意事项

你可以假设数组中每个整数都是正整数，且小于等于100。

样例
对于数组[1, 4, 2, 3]和target=1，最小的调整方案是调整为[2, 3, 2, 3]，调整代价之和是2。返回2。
*/

/*
   dp[i][j] 表示前i个数, 第i个数调整为j 满足条件, 所需要的最小代价
   function:如果i个数是j 那么第i-1个数k是要满足 Math.abs(j - k) < target的
   dp[i][j] = Math.min(dp[i-1][k] +  Math.abs(j -A.get(i-1))) //第i个数时j 第i-1个数为k时候使代价最小

			  如果第i个数是j, 那么第i-1个数k只能在[lowerRange, UpperRange]之间，
	 lowerRange=Math.max(0, j-target), upperRange=Math.min(99, j+target), 这样的话，transfer function可以写成：
	 for (int p=lowerRange; p<= upperRange; p++) { 　　
		res[i][j] = Math.min(res[i][j], res[i-1][k] + Math.abs(j-A.get(i-1))); 
	 }
   return: 满足条件的最小代价 Math.min(dp[m][j]) // 改变j的值找到最小的代价
 */

public class Solution {
    /**
     * @param A: An integer array.
     * @param target: An integer.
     */
    public int MinAdjustmentCost(ArrayList<Integer> A, int target) {
        // write your code here
        int n = A.size();
        int[][] dp = new int[n+1][101];
        for (int j = 0; j < 101; j++) {
            dp[0][j] = 0;
        } 
        int curMin = 0;  
        for (int i = 1; i <= n; i++) {  
            //第i个数是j
            for (int j = 1; j <= 100; j++) {  
                dp[i][j] = Integer.MAX_VALUE;  
                //第i-1个数是k
                for (int k = Math.max(1, j-target); k <= Math.min(100, j+target); k++) {  
                	 //Math.abs(j -A.get(i-1)))表示第i个数改为j所需代价(在数组A中,第i个数对应的下标为i-1)
                    dp[i][j] = Math.min(dp[i][j], dp[i-1][k] + Math.abs(A.get(i-1)-j)); 
                }  
            }  
        }  
        
        int result = Integer.MAX_VALUE;
        for (int j = 1 ; j <= 100; j++) {
            result = Math.min(result, dp[n][j]);
        }
        return result;
    }
}