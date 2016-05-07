/*
����쳲����������е� N ������

��ν��쳲�����������ָ��

ǰ2������ 0 �� 1 ��
�� i �����ǵ� i-1 �����͵�i-2 �����ĺ͡�
쳲��������е�ǰ10�������ǣ�

0, 1, 1, 2, 3, 5, 8, 13, 21, 34 ...

����
���� 1������ 0

���� 2������ 1

���� 10������ 34
*/
class Solution {
    /**
     * @param n: an integer
     * @return an integer f(n)
     */
    public int fibonacci(int n) {
    	if(n==1)
    		return 0;
    	if(n==2)
    		return 1;
    	int[] dp= new int[n+1];
    	dp[0]=0;
    	dp[1]=1;
    	for(int i=2;i<=n;i++){
    		dp[i] = dp[i-1]+dp[i-2];
    	}
    	
		return dp[n-1];
    }
}

