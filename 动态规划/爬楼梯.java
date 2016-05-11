/*
������������¥�ݣ���Ҫn������ܵ��ﶥ������ÿ����ֻ����һ�����������������ж����ֲ�ͬ�ķ�������¥������

����
����n=3��1+1+1=1+2=2+1=3������3�в�ͬ�ķ���
���� 3
*/

public class Solution {
    /**
     * @param n: An integer
     * @return: An integer
     */
    public int climbStairs(int n) {
        // write your code here
        int[] dp = new int[n+1];
        if(n<=1)
            return 1;
        if(n==2)
            return 2;
    	dp[0]=1;
    	dp[1]=1;
    	dp[2]=2;
    	for(int i=3;i<=n;i++){
    		dp[i] = dp[i-1] + dp[i-2];
    	}    	
    	return dp[n];
    }
}