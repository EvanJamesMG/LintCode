/**
	给出一个字符串s和一个词典，判断字符串s是否可以被空格切分成一个或多个出现在字典中的单词。

	样例
	给出

	s = "lintcode"

	dict = ["lint","code"]

	返回 true 因为"lintcode"可以被空格切分成"lint code"
*/


/*
    假设dp(i)表示长度为i的字串能否别切分，dp方程如下:
    
    dp(i) = dp(j) && s[j, i) in dict, 0 
 */
public class Solution {
    /**
     * @param s: A string s
     * @param dict: A dictionary of words dict
     */
    public boolean wordBreak(String s, Set<String> dict) {
        boolean dp[] = new boolean[s.length()+1];
        dp[0] = true;
        if(s.length()==0 && dict.size()==0)
            return true;
        for(int i=0;i<s.length();i++){
            if(dp[i]) {
                for (int k = i+1; k <= s.length(); k++) {
                    if (dict.contains(s.substring(i, k))) {
                        dp[k] = true;
                    }
                }
            }
        }
        return dp[s.length()];
    }
}