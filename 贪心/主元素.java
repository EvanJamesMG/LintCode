/*
����һ���������飬�ҳ���Ԫ�أ����������еĳ��ִ����ϸ��������Ԫ�ظ����Ķ���֮һ��

����
��������[1,1,1,1,2,2,2]������ 1
*/

public class Solution {
    /**
     * @param nums: a list of integers
     * @return: find a  majority number
     */
    public int majorityNumber(ArrayList<Integer> nums) {
    	Collections.sort(nums);
    	
		return nums.get(nums.size()/2);
	}
}