/**
   �ָ�һ���������飬ʹ��������ǰż���ں�

	����
	���� [1, 2, 3, 4]������ [1, 3, 2, 4]��

	��ս 
	��ԭ��������ɣ���ʹ�ö���ռ䡣
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