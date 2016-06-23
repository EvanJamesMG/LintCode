/**
	给定一个整数数组，找到一个具有最小和的子数组。返回其最小和。

 注意事项

	子数组最少包含一个数字

	您在真实的面试中是否遇到过这个题？ Yes
	样例
	给出数组[1, -1, -2, 1]，返回 -3	
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
