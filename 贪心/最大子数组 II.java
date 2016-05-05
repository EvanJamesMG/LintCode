/*
给定一个整数数组，找出两个不重叠子数组使得它们的和最大。

每个子数组的数字在数组中的位置应该是连续的。

返回最大的和。

 注意事项

子数组最少包含一个数

样例
给出数组[1, 3, -1, 2, -1, 2]，这两个子数组分别为[1, 3]和[2, -1, 2]或者[1, 3, -1, 2]和[2]，它们的最大和都是7
*/

public class Solution {
    /**
     * @param nums: A list of integers
     * @return: An integer denotes the sum of max two non-overlapping subarrays
     */
    public int maxTwoSubArrays(ArrayList<Integer> nums) {
    	ArrayList<Integer> input = new ArrayList<>();
    	int res = Integer.MIN_VALUE;
    	for(int sub:nums){
    		input.add(sub);
    	}
    	
    	for(int i=1;i<nums.size();i++){
    		ArrayList <Integer> leftsub = new ArrayList<>(input.subList(0, i));
    		ArrayList<Integer> rightsub = new ArrayList<>( input.subList(i,input.size()));
        	int maxleftsub = maxSubArray(leftsub);
        	int maxrightsub = maxSubArray(rightsub);
        	
        	res= Math.max(res, maxleftsub+maxrightsub);
    	}
		return res;
    	
    }

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
}
