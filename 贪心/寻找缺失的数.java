import java.util.Arrays;
/*
给出一个包含 0 .. N 中 N 个数的序列，找出0 .. N 中没有出现在序列中的那个数。

 注意事项

可以改变序列中数的位置。

样例
 N = 4 且序列为 [0, 1, 3] 时，缺失的数为2。
*/
public class Solution {
    /**    
     * @param nums: an array of integers
     * @return: an integer
     */
    public int findMissing(int[] nums) {
		Arrays.sort(nums);
    	for(int i=0;i<nums.length;i++){
    		if(nums[i]!=i)
    			return i;
		}
    	return nums.length;
    }
}