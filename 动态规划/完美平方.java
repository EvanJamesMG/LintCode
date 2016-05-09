/*
��һ�������� n, �ҵ����ɸ���ȫƽ����(����1, 4, 9, ... )ʹ�����ǵĺ͵��� n������Ҫ��ƽ�����ĸ������١�
����
���� n = 12, ���� 3 ��Ϊ 12 = 4 + 4 + 4��
���� n = 13, ���� 2 ��Ϊ 13 = 4 + 9��
*/
public class Solution {
    /**
     * @param n a positive integer
     * @return an integer
     */
    public int numSquares(int n) {
    	int[] dp  = new int[n+1];

    	for(int i=1;i<=n;i++){
    		dp[i] = Integer.MAX_VALUE;
    		for(int j=1;j*j<=i;j++){
    			dp[i] = Math.min(dp[i], dp[i-j*j]+1);
    		}
    	}
		return dp[n];
	}
}