/*
	Given an unsorted array nums, reorder it in-place such that

	nums[0] <= nums[1] >= nums[2] <= nums[3]....
	 ע������

	Please complete the problem in-place.

	����
	Given nums = [3, 5, 2, 1, 6, 4], one possible answer is [1, 6, 2, 5, 3, 4].
*/

/*
 * ������Ŀ�Ķ��壬ҡ������ķ�������ܶ��֡����ǿ����Ƚ�����������ʱ��ӵ�3��Ԫ�ؿ�ʼ������3��Ԫ�غ͵�2��Ԫ�ؽ�����
 * Ȼ���ٴӵ�5��Ԫ�ؿ�ʼ������5��Ԫ�غ͵�4��Ԫ�ؽ������Դ����ơ�����������ĿҪ��
 */

public class Solution {
    /**
     * @param nums a list of integer
     * @return void
     */
    public void wiggleSort(int[] nums) {
        // Write your code here
        Arrays.sort(nums);
        // ��������һ��һ�Խ���
        for(int i = 2; i < nums.length; i+=2){
            int tmp = nums[i-1];
            nums[i-1] = nums[i];
            nums[i] = tmp;
        }
    }
}