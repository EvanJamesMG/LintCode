/**
	��һ������ nums дһ�������� 0 �ƶ������������棬����Ԫ�ر���ԭ�����˳��

	 ע������

	1.������ԭ�����ϲ���
	2.��С��������

	����
	���� nums = [0, 1, 0, 3, 12], ���ú���֮��, nums = [1, 3, 12, 0, 0].
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