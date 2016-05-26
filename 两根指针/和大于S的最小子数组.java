/**
给定一个由 n 个整数组成的数组和一个正整数 s ，请找出该数组中满足其和 ≥ s 的最小长度子数组。如果无解，则返回 -1。

样例
给定数组 [2,3,1,2,4,3] 和 s = 7, 子数组 [4,3] 是该条件下的最小长度子数组。
*/
public class Solution {
    /**
     * @param nums: an array of integers
     * @param s: an integer
     * @return: an integer representing the minimum size of subarray
     */
    public int minimumSize(int[] nums, int s) {
        if(nums==null||nums.length==0)
            return -1;
        int fast = 0;
        int slow = 0;
        int sum = 0;
        int res = nums.length+1;
        while(fast<nums.length){
            while(fast<nums.length&&sum<s){
                sum+=nums[fast];
                fast++;
            }
            while (slow<fast&&sum>=s){
                res = Math.min(res,fast-slow);
                sum -= nums[slow];
                slow++;
            }
        }
        return (res==nums.length+1)?-1:res;
    }
}