/**
	����һ���������飬�ҵ�һ��������С�͵������顣��������С�͡�

 ע������

	���������ٰ���һ������

	������ʵ���������Ƿ�����������⣿ Yes
	����
	��������[1, -1, -2, 1]������ -3	
*/

public class Solution {
    /**
     * @param nums: a list of integers
     * @return: A integer indicate the sum of minimum subarray
     */
    public int minSubArray(ArrayList<Integer> nums) {
    	int tem= Integer.MAX_VALUE;
    	int minvalue = Integer.MAX_VALUE;
    	for(int sub:nums){
    		if(tem>0){
    			tem = sub;
    		}else{
    			tem+=sub;
    		}
    		minvalue = Math.min(minvalue, tem);
    	}
		return minvalue;
    }
}
