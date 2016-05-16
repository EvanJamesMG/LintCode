/*
	Given an unsorted array nums, reorder it in-place such that

	nums[0] <= nums[1] >= nums[2] <= nums[3]....
	 注意事项

	Please complete the problem in-place.

	样例
	Given nums = [3, 5, 2, 1, 6, 4], one possible answer is [1, 6, 2, 5, 3, 4].
*/

/*
 * 根据题目的定义，摇摆排序的方法将会很多种。我们可以先将数组排序，这时候从第3个元素开始，将第3个元素和第2个元素交换。
 * 然后再从第5个元素开始，将第5个元素和第4个元素交换，以此类推。就能满足题目要求。
 */

public class Solution {
    /**
     * @param nums a list of integer
     * @return void
     */
    public void wiggleSort(int[] nums) {
        // Write your code here
        Arrays.sort(nums);
        // 将数组中一对一对交换
        for(int i = 2; i < nums.length; i+=2){
            int tmp = nums[i-1];
            nums[i-1] = nums[i];
            nums[i] = tmp;
        }
    }
}