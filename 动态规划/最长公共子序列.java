/*
给出两个字符串，找到最长公共子序列(LCS)，返回LCS的长度。

 注意事项

说明
最长公共子序列的定义：

最长公共子序列问题是在一组序列（通常2个）中找到最长公共子序列（注意：不同于子串，LCS不需要是连续的子串）。
该问题是典型的计算机科学问题，是文件差异比较程序的基础，在生物信息学中也有所应用。
https://en.wikipedia.org/wiki/Longest_common_subsequence_problem
样例
给出"ABCD" 和 "EDCA"，这个LCS是 "A" (或 D或C)，返回1

给出 "ABCD" 和 "EACB"，这个LCS是"AC"返回 2
*/

/**
 * 1. D[i][j] 定义为s1, s2的前i,j个字符串的最长common subsequence. 
   2. D[i][j] 当char i == char j， D[i - 1][j - 1] + 1
              当char i != char j, D[i ][j - 1], D[i - 1][j] 里取一个大的. 
               因为在A[i] != B[j]时，由于A[i] 或者 B[j] 不可能同时出现在最终的 LCS 中，故这个问题可进一步缩小，
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
