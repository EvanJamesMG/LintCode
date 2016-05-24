/**
   分割一个整数数组，使得奇数在前偶数在后。

	样例
	给定 [1, 2, 3, 4]，返回 [1, 3, 2, 4]。

	挑战 
	在原数组中完成，不使用额外空间。
*/
public class Solution {
    /**
     * @param nums: an array of integers
     * @return: nothing
     */
    public void partitionArray(int[] nums) {
        if(nums==null ||nums.length==0)
            return;
        int left = 0;
        int right  = nums.length-1;
        while(left<=right){
            if(nums[left]%2==0){
                if(nums[right]%2==0){
                    right--;
                }else{
                    swap(nums,left,right);
                    left++;
                    right--;
                }
            }else{
                left++;
            }
        }
    }

    private static void swap(int[] nums, int left, int right) {
        int tem = nums[left];
        nums[left] = nums[right];
        nums[right] = tem;
    }

}