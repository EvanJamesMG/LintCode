/**
	����һ���������飬��ԭ������ɾ���ظ����ֵ����֣�ʹ��ÿ��Ԫ��ֻ����һ�Σ����ҷ����µ�����ĳ��ȡ�

	��Ҫʹ�ö��������ռ䣬������ԭ��û�ж���ռ����������ɡ�

	����
	��������A =[1,1,2]����ĺ���Ӧ�÷��س���2����ʱA=[1,2]��
*/

public class Solution {
    /**
     * @param A: a array of integers
     * @return : return an integer
     */
    public int removeDuplicates(int[] nums) {
        if(nums==null||nums.length==0)
            return 0;
        int left = 0;
        int index =0;
        for(int i=0;i<nums.length;i++){
            nums[index] = nums[i];
            index++;
            if(i<nums.length-1) {
                while (nums[i + 1] == nums[i]) {
                    i++;
                    if(i==nums.length-1)
                        break;
                }
            }
        }
        return index;
    }
}