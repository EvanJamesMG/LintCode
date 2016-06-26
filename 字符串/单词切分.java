/**
	����һ���ַ���s��һ���ʵ䣬�ж��ַ���s�Ƿ���Ա��ո��зֳ�һ�������������ֵ��еĵ��ʡ�

	����
	����

	s = "lintcode"

	dict = ["lint","code"]

	���� true ��Ϊ"lintcode"���Ա��ո��зֳ�"lint code"
*/


/*
    ����dp(i)��ʾ����Ϊi���ִ��ܷ���з֣�dp��������:
    
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