/**
����һ���������飬�ҵ�һ���������͵������飬���������͡�

 ע������

���������ٰ���һ����

����
��������[?2,2,?3,4,?1,2,1,?5,3]������Ҫ���������Ϊ[4,-1,2,1]��������Ϊ6
*/
public class Solution {
    /**
     * @param nums: A list of integers
     * @return: A integer indicate the sum of max subarray
     */
    public int maxSubArray(int[] nums) {

		int tem = Integer.MIN_VALUE;
		int maxvalue = Integer.MIN_VALUE;
    	for(int sub:nums){
    		if(tem<0){
    			tem = sub;
    		}else{
    			tem+=sub;
    		}
    		maxvalue = Math.max(maxvalue, tem);
    	}
		return maxvalue;
	}
}