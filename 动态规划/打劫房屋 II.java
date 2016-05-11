/*
���ϴδ����һ���ֵ�֮�������ַ�����һ���µĿ��Դ�ٵĵط�����������еķ���Χ����һ��Ȧ�������ζ�ŵ�һ�䷿�Ӻ����һ�䷿���ǰ��ŵġ�
ÿ�����Ӷ�������ض�����Ǯ�������ٵ�ΨһԼ�������ǣ�
���ڵķ���װ���໥��ϵ�ķ���ϵͳ���� �����ڵ���������ͬһ�챻���ʱ����ϵͳ���Զ�������

����һ���Ǹ������б���ʾÿ�������д�ŵ�Ǯ�� ��һ�㣬�������ȥ��٣��������Եõ�����Ǯ �ڲ���������װ�õ�����¡�

 ע������

������House Robber����չ��ֻ��������ֱ�߱����Ȧ

����
����nums = [3,6,4], ���ء�6�����㲻�ܴ��3��4���ڵķ��䣬��Ϊ����Χ��һ��Ȧ�������ڵģ�
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