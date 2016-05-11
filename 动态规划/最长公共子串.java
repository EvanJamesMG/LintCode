/*
给出两个字符串，找到最长公共子串，并返回其长度。

 注意事项

子串的字符应该连续的出现在原字符串中，这与子序列有所不同。

样例
给出A=“ABCD”，B=“CBCE”，返回 2
*/

/*
state: dp[i][j] 表示前i个字符配上前j个字符的LCS长度(必须包括以i j结尾的字符)
        也就是说i，j结尾的字符必须也得匹配上
		当A[i] != B[j] 时，i,j结尾的字符没有匹配上，所以dp[i][j]中没有以i，j结尾的字符的连续子串了，dp[i][j]=0
*/
public class Solution {
    /**
     * @param A, B: Two string.
     * @return: the length of the longest common substring.
     */
    public int longestCommonSubstring(String A, String B) {
    	int lenA = A.length();
    	int lenB = B.length();
    	int dp[][] = new int[lenA+1][lenB+1];
    	int maxres = 0;
    	for(int i=1;i<=lenA;i++){
    		for(int j=1;j<=lenB;j++){
    			if(A.charAt(i-1)==B.charAt(j-1)){
    				dp[i][j] = dp[i-1][j-1]+1;
    			}else{
    				dp[i][j]=0;
    			}
    			maxres = Math.max(maxres, dp[i][j]);
    		}
    	}
		return maxres;
	}
}