/*
A message containing letters from A-Z is being encoded to numbers using the following mapping:

'A' -> 1
'B' -> 2
...
'Z' -> 26
Given an encoded message containing digits, determine the total number of ways to decode it.

ÑùÀý
Given encoded message 12, it could be decoded as AB (1 2) or L (12).
The number of ways decoding 12 is 2.
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