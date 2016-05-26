/**
����һ���� n ��������ɵ������һ�������� s �����ҳ���������������� �� s ����С���������顣����޽⣬�򷵻� -1��

����
�������� [2,3,1,2,4,3] �� s = 7, ������ [4,3] �Ǹ������µ���С���������顣
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