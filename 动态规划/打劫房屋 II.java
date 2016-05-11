/*
在上次打劫完一条街道之后，窃贼又发现了一个新的可以打劫的地方，但这次所有的房子围成了一个圈，这就意味着第一间房子和最后一间房子是挨着的。
每个房子都存放着特定金额的钱。你面临的唯一约束条件是：
相邻的房子装着相互联系的防盗系统，且 当相邻的两个房子同一天被打劫时，该系统会自动报警。

给定一个非负整数列表，表示每个房子中存放的钱， 算一算，如果今晚去打劫，你最多可以得到多少钱 在不触动报警装置的情况下。

 注意事项

这题是House Robber的扩展，只不过是由直线变成了圈

样例
给出nums = [3,6,4], 返回　6，　你不能打劫3和4所在的房间，因为它们围成一个圈，是相邻的．
*/

public class Solution {
    /**
     * @param nums: An array of non-negative integers.
     * return: The maximum amount of money you can rob tonight
     */
    public int houseRobber2(int[] nums) {
        // write your code here
        if(nums==null||nums.length==0)
            return 0;
        if(nums.length==1)
        	return nums[0];
    	int[] nums1= Arrays.copyOfRange(nums, 0, nums.length-1);
    	int[] nums2= Arrays.copyOfRange(nums, 1, nums.length);
    	return (int)Math.max(houseRobber(nums1), houseRobber(nums2));

    }
    public static long houseRobber(int[] A) {    	
        // write your code here
        if(A==null||A.length==0)
            return 0;
    	long[] dp = new long[A.length+1];
    	dp[0] = 0;
    	dp[1] = A[0];
    	for(int i=2;i<=A.length;i++){
    		dp[i] = Math.max(dp[i-1], dp[i-2]+A[i-1]);
    	}
		return dp[A.length];
    }
}