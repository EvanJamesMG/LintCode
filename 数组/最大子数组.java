/**
给定一个整数数组，找到一个具有最大和的子数组，返回其最大和。

 注意事项

子数组最少包含一个数

样例
给出数组[?2,2,?3,4,?1,2,1,?5,3]，符合要求的子数组为[4,-1,2,1]，其最大和为6
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