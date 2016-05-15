/*
����һ���ַ���s��һ���ʵ䣬�ж��ַ���s�Ƿ���Ա��ո��зֳ�һ�������������ֵ��еĵ��ʡ�

����
����

s = "lintcode"

dict = ["lint","code"]

���� true ��Ϊ"lintcode"���Ա��ո��зֳ�"lint code"
*/

/*
    ����dp(i)��ʾ����Ϊi���ִ��ܷ���з֣�dp��������:
    
    dp(i) = dp(j) && s[j, i) in dict 
	ע�⣺j��0��ʼ��Ҳ����˵������һ���ַ�������������п��ܣ������󲿷ֲ������ַ������Ҳ��ְ������ֵ��У�
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