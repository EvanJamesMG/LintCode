/*
给出一个字符串s和一个词典，判断字符串s是否可以被空格切分成一个或多个出现在字典中的单词。

样例
给出

s = "lintcode"

dict = ["lint","code"]

返回 true 因为"lintcode"可以被空格切分成"lint code"
*/

/*
    假设dp(i)表示长度为i的字串能否别切分，dp方程如下:
    
    dp(i) = dp(j) && s[j, i) in dict 
	注意：j从0开始，也就是说不包含一个字符串（这种情况有可能，就是左部分不包含字符串，右部分包含在字典中）
 */
public class Solution {
    /**
     * @param s: A string s
     * @param dict: A dictionary of words dict
     */
    public boolean wordBreak(String s, Set<String> dict) {
    	boolean dp[] = new boolean[s.length()+1];
		dp[0] = true;
    	for(int i=1;i<s.length()+1;i++){
			for(int k=0;k<i;k++){
				if(dp[k]==true&&dict.contains(s.substring(k,i))){
					dp[i]=true;
					break;
				}
			}
		}
    	
    	return dp[s.length()];
    }
	
}