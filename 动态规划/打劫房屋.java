/*��������һ��רҵ��������׼������һ���ִ�ٷ��ݡ�ÿ�����Ӷ�������ض�����Ǯ��
�����ٵ�ΨһԼ�������ǣ����ڵķ���װ���໥��ϵ�ķ���ϵͳ���� �����ڵ���������ͬһ�챻���ʱ����ϵͳ���Զ�������

����һ���Ǹ������б���ʾÿ�������д�ŵ�Ǯ�� ��һ�㣬�������ȥ��٣��������Եõ�����Ǯ �ڲ���������װ�õ�����¡�

����
���� [3, 8, 4], ���� 8.
*/

public class Solution {
    /**
     * @param A: An array of non-negative integers.
     * return: The maximum amount of money you can rob tonight
     */
    public long houseRobber(int[] A) {
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