/*
���������ַ������ҵ������������(LCS)������LCS�ĳ��ȡ�

 ע������

˵��
����������еĶ��壺

�������������������һ�����У�ͨ��2�������ҵ�����������У�ע�⣺��ͬ���Ӵ���LCS����Ҫ���������Ӵ�����
�������ǵ��͵ļ������ѧ���⣬���ļ�����Ƚϳ���Ļ�������������Ϣѧ��Ҳ����Ӧ�á�
https://en.wikipedia.org/wiki/Longest_common_subsequence_problem
����
����"ABCD" �� "EDCA"�����LCS�� "A" (�� D��C)������1

���� "ABCD" �� "EACB"�����LCS��"AC"���� 2
*/

/**
 * 1. D[i][j] ����Ϊs1, s2��ǰi,j���ַ������common subsequence. 
   2. D[i][j] ��char i == char j�� D[i - 1][j - 1] + 1
              ��char i != char j, D[i ][j - 1], D[i - 1][j] ��ȡһ�����. 
               ��Ϊ��A[i] != B[j]ʱ������A[i] ���� B[j] ������ͬʱ���������յ� LCS �У����������ɽ�һ����С��
                 D[i][j] = max(D[i - 1][j], D[i][j - 1]).
 */

public class Solution {
    /**
     * @param A, B: Two strings.
     * @return: The length of longest common subsequence of A and B.
     */
    public int longestCommonSubsequence(String A, String B) {
    	int lenA = A.length();
    	int lenB = B.length();
    	int maxres = 0;
    	int[][] dp = new int[lenA+1][lenB+1];
    	for(int i=1;i<=lenA;i++){
    		for(int j=1;j<=lenB;j++){
    			if(A.charAt(i-1)==B.charAt(j-1)){
    				dp[i][j] = dp[i-1][j-1]+1; 
    			}else{
    				dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
    			}
    			maxres = Math.max(maxres, dp[i][j]);
    		}
    	}
    	
    	return maxres;
    }
}
