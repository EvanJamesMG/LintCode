/**
	给一个数组 nums 写一个函数将 0 移动到数组的最后面，非零元素保持原数组的顺序

	 注意事项

	1.必须在原数组上操作
	2.最小化操作数

	样例
	给出 nums = [0, 1, 0, 3, 12], 调用函数之后, nums = [1, 3, 12, 0, 0].
*/

public class Solution {
    /**
     * @param nums an integer array
     * @return nothing, do this in-place
     */
    public void moveZeroes(int[] nums) {
        // Write your code here
        if(nums==null||nums.length==0)
            return;
        int left = 0;
        int right = 0;

        while (right<nums.length){
            if(nums[right]!=0){
                swap(nums,left,right);
                left++;
            }
            right++;
        }
    }

    private static void swap(int[] nums, int left, int right) {
        int tem = nums[left];
        nums[left] = nums[right];
        nums[right] = tem;
    }
}