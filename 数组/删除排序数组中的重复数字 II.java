/**
	������ɾ���ظ����֡���

	�������������������ظ�����δ���

	����
	��������A =[1,1,1,2,2,3]����ĺ���Ӧ�÷��س���5����ʱA=[1,1,2,2,3]��
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
            if(i==nums.length-1)
                break;
            if(nums[i+1]==nums[i]){
                nums[index] = nums[i+1];
                index++;
                i++;
            }
            if(i==nums.length-1)
                break;
            while (nums[i + 1] == nums[i]) {
                i++;
                if(i==nums.length-1)
                    break;
            }
        }

        return index;
    }
}