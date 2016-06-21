/**

给定一个排序的整数数组（升序）和一个要查找的整数target，
用O(logn)的时间查找到target第一次出现的下标（从0开始），如果target不存在于数组中，返回-1。

样例
在数组 [1, 2, 3, 3, 4, 5, 10] 中二分查找3，返回2。
*/

class Solution {
    /**
     * @param nums: The integer array.
     * @param target: Target to find.
     * @return: The first position of target. Position starts from 0.
     */
    public int binarySearch(int[] nums, int target) {
    	if(nums==null || nums.length==0)
    		return -1;
    	int left = 0;
    	int right = nums.length-1;
    	int mid = 0;
    	int res = -1;
    	
    	while(left<=right){
    		mid = (left+right)/2;
    		if(nums[mid]==target)
    			break;
    		if(target>nums[mid]){
    			left = mid+1;
    		}else if (target<nums[mid]) {
				right = mid-1;
			}
    	}
    	if(nums[mid]==target){
    		for(int i =mid;i>=0;i--){
    			if(nums[0]==target)
    				res= 0;
    			if(nums[i]!=target){
    				res = i+1;
    				break;
    			}
    		}    		
    	}else{
    		res = -1;
    	}
		return res;
    }
}
