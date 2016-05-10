/*
��һ���������飬����ÿ�����Ĵ�С��ʹ�����ڵ��������Ĳ�С��һ������������target������ÿ�����Ĵ���Ϊ����ǰ��Ĳ�ľ���ֵ�����������֮����С�Ƕ��١�

 ע������

����Լ���������ÿ��������������������С�ڵ���100��

����
��������[1, 4, 2, 3]��target=1����С�ĵ��������ǵ���Ϊ[2, 3, 2, 3]����������֮����2������2��
*/

/*
   dp[i][j] ��ʾǰi����, ��i��������Ϊj ��������, ����Ҫ����С����
   function:���i������j ��ô��i-1����k��Ҫ���� Math.abs(j - k) < target��
   dp[i][j] = Math.min(dp[i-1][k] +  Math.abs(j -A.get(i-1))) //��i����ʱj ��i-1����Ϊkʱ��ʹ������С

			  �����i������j, ��ô��i-1����kֻ����[lowerRange, UpperRange]֮�䣬
	 lowerRange=Math.max(0, j-target), upperRange=Math.min(99, j+target), �����Ļ���transfer function����д�ɣ�
	 for (int p=lowerRange; p<= upperRange; p++) { ����
		res[i][j] = Math.min(res[i][j], res[i-1][k] + Math.abs(j-A.get(i-1))); 
	 }
   return: ������������С���� Math.min(dp[m][j]) // �ı�j��ֵ�ҵ���С�Ĵ���
 */

public class Solution {
    /**
     * @param A: An integer array.
     * @param target: An integer.
     */
    public int MinAdjustmentCost(ArrayList<Integer> A, int target) {
        // write your code here
        int n = A.size();
        int[][] dp = new int[n+1][101];
        for (int j = 0; j < 101; j++) {
            dp[0][j] = 0;
        } 
        int curMin = 0;  
        for (int i = 1; i <= n; i++) {  
            //��i������j
            for (int j = 1; j <= 100; j++) {  
                dp[i][j] = Integer.MAX_VALUE;  
                //��i-1������k
                for (int k = Math.max(1, j-target); k <= Math.min(100, j+target); k++) {  
                	 //Math.abs(j -A.get(i-1)))��ʾ��i������Ϊj�������(������A��,��i������Ӧ���±�Ϊi-1)
                    dp[i][j] = Math.min(dp[i][j], dp[i-1][k] + Math.abs(A.get(i-1)-j)); 
                }  
            }  
        }  
        
        int result = Integer.MAX_VALUE;
        for (int j = 1 ; j <= 100; j++) {
            result = Math.min(result, dp[n][j]);
        }
        return result;
    }
}