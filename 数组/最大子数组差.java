/**
给定一个整数数组，找出两个不重叠的子数组A和B，使两个子数组和的差的绝对值|SUM(A) - SUM(B)|最大。

返回这个最大的差值。

 注意事项

子数组最少包含一个数

您在真实的面试中是否遇到过这个题？ Yes
样例
给出数组[1, 2, -3, 1]，返回 6
*/
/*
 *对原数组进行切割，分为左右两个子数组，
 * 分别求出左数组中的存在的子数组最大值and最小值 
 *         右数组中的存在的子数组最大值and最小值
 * 求差的绝对值最大，那么求出子数组和的最大最小值，然后相减就行，但是有可能是左边最大右边最小，也可
 * 能是左边最小右边最大。
 */
public class Solution {
    /**
     * @param nums: A list of integers
     * @return: An integer indicate the value of maximum difference between two
     *          Subarrays
     */
    public int maxDiffSubArrays(int[] nums) {
    	ArrayList<Integer> input = new ArrayList<>();
    	int res = Integer.MIN_VALUE;
    	for(int sub:nums){
    		input.add(sub);
    	}
    	
    	for(int i=1;i<nums.length;i++){
    		ArrayList <Integer> leftsub = new ArrayList<>(input.subList(0, i));
    		ArrayList<Integer> rightsub = new ArrayList<>( input.subList(i,input.size()));
        	int minleftsub = minSubArray(leftsub);
        	int maxleftsub = maxSubArray(leftsub);
        	int minrightsub = minSubArray(rightsub);
        	int maxrightsub = maxSubArray(rightsub);
        	
        	int maxone = Math.abs(maxleftsub - minrightsub);
        	int maxtwo = Math.abs(maxrightsub - minleftsub);
        	res= Math.max(res, Math.max(maxone,maxtwo));
    	}
		return res;
    	
    }

    /*取数组中的子数组的最大值*/
    private static int maxSubArray(ArrayList<Integer> nums) {
		// TODO Auto-generated method stub
    	if(nums==null ||nums.size()==0)
    		return 0;
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

    /*取数组中的子数组的最小值*/
    public static int minSubArray(ArrayList<Integer> nums) {
    	if(nums==null ||nums.size()==0)
    		return 0;
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
