/**
	����һ���������� nums ��һ������ k���������飨���ƶ����� nums �е�Ԫ�أ���ʹ�ã�

	����С��k��Ԫ���Ƶ����
	���д��ڵ���k��Ԫ���Ƶ��ұ�
	�������黮�ֵ�λ�ã��������е�һ��λ�� i������ nums[i] ���ڵ��� k��

	 ע������

	��Ӧ�������Ļ������� nums����������ֻ�Ǽ���� k С����������������� nums �е�����Ԫ�ض��� k С���򷵻� nums.length��

	����
	�������� nums = [3,2,2,1] �� k = 2������ 1.
*/

public class Solution {
	/** 
     *@param nums: The integer array you should partition
     *@param k: As description
     *return: The index after partition
     */
    public int partitionArray(int[] nums, int k) {
	    //write your code here
        int index =0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<k) {
                swap(nums, i, index);
                index++;
            }
        }
        return index;
    }

    private static void swap(int[] nums, int left, int right) {
        int tem = nums[left];
        nums[left] = nums[right];
        nums[right] = tem;
    }

}