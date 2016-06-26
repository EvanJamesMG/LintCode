/**
	��һ����Ϣ����A-Zͨ�����¹������

	'A' -> 1
	'B' -> 2
	...
	'Z' -> 26
	���ڸ���һ�����ܹ������Ϣ�����м��ֽ���ķ�ʽ

	������ʵ���������Ƿ�����������⣿ Yes
	����
	�������ϢΪ12�������ַ�ʽ���� AB(12) ���� L(12). ���Է��� 2
*/

public class Solution {
    /**
     * @param s a string,  encoded message
     * @return an integer, the number of ways decoding
     */
    public int numDecodings(String s) {
        // Write your code here
        if(s==null||s.length()==0)
    		return 0 ;
    	if(s.length()==1)
    		return s.equals("0")?0:1;
    	int[] dp = new int[s.length()+1];
    	dp[0] = 1;
    	if(s.charAt(0)!='0')
    	    dp[1] = 1;
    	for(int i=2;i<=s.length();i++){
    		if(s.charAt(i-1)!='0'){
    			dp[i] = dp[i-1];
    		}
    		String tem = s.substring(i-2,i);
    		int tem2 = Integer.parseInt(tem);
    		if(tem2>=10&&tem2<=26){
    			dp[i] +=dp[i-2];
    		}
    	}
    	return dp[s.length()];
    }
}