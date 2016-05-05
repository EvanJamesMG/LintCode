/*
给定一个整型数组，找出主元素，它在数组中的出现次数严格大于数组元素个数的二分之一。

样例
给出数组[1,1,1,1,2,2,2]，返回 1
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