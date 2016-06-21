/**

给定一个整数数组（下标从 0 到 n-1， n 表示整个数组的规模），请找出该数组中的最长上升连续子序列。（最长上升连续子序列可以定义为从右到左或从左到右的序列。）

 注意事项

time

样例
给定 [5, 4, 2, 1, 3], 其最长上升连续子序列（LICS）为 [5, 4, 2, 1], 返回 4.

给定 [5, 1, 2, 3, 4], 其最长上升连续子序列（LICS）为 [1, 2, 3, 4], 返回 4.
*/

public class Solution {
    /**
     * @param A an array of Integer
     * @return  an integer
     */
    public int longestIncreasingContinuousSubsequence(int[] A) {
		int maxnum  = 0;
		if(A==null||A.length==0)
			return 0;
		if(A.length==1)
			return 1;
    	for(int i=0;i<A.length-1;i++){
			int k = 1;
			while(A[i+1]>=A[i]){
				k++;
				i++;
				if(i==A.length-1)
					break;
			}
			maxnum = Math.max(maxnum, k);
		}
		
		for(int i=A.length-1;i>=1;i--){
			int k = 1;
			while(A[i-1]>=A[i]){
				k++;
				i--;
				if(i==0)
					break;
			}
			maxnum = Math.max(maxnum, k);
			
		}
    	return maxnum;
    }
}