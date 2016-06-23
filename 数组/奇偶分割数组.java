/**
	分割一个整数数组，使得奇数在前偶数在后。

	样例
	给定 [1, 2, 3, 4]，返回 [1, 3, 2, 4]。
*/
public class Solution {
    /**
     * @param nums: an array of integers
     * @return: nothing
     */
    public void partitionArray(int[] nums) {
        if(nums==null ||nums.length==0)
            return;
        int index = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2!=0){
                swap(nums,index,i);
                index++;
            }
        }
    }

    private static void swap(int[] nums, int left, int right) {
        int tem = nums[left];
        nums[left] = nums[right];
        nums[right] = tem;
    }

}