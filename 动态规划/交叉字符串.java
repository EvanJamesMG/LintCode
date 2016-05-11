	/*
	 *动态规划数组是dp[i][j]，表示：s1取前i位，s2取前j位，是否能组成s3的前i+j位。
	 *初始化是，假设s1为空，那么s2每一位跟s3匹配放入dp[0][j]；假设s2为空，那么s1每一位跟s3匹配放入dp[i][0]
	 *
	 *递推关系：我们怎么得到dp[i][j]。可以看出，其实只有两种方式来递推，
	 *一种是选取s1的字符作为s3新加进来的字符，另一种是选s2的字符作为新进字符。
	 *而要看看能不能选取，就是判断s1(s2)的第i(j)个字符是否与s3的i+j个字符相等。
	 *如果可以选取并且对应的dp[i-1][j](dp[i][j-1])也为真，就说明s3的i+j个字符可以被表示。
	 *这两种情况只要有一种成立，就说明res[i][j]为真，是一个或的关系。
	 *所以递推式可以表示成:
	 * dp[i][j] = dp[i-1][j]&&s1.charAt(i-1)==s3.charAt(i+j-1) || dp[i][j-1]&&s2.charAt(j-1)==s3.charAt(i+j-1) 
	 *
	 */
    public static boolean isInterleave(String s1, String s2, String s3) {
        // write your code here
    	int lens1 = s1.length();
    	int lens2 = s2.length();
    	if(lens1+lens2!=s3.length())
    	    return false;
    	if(s1.length()==0&&s2.length()==0&&s3.length()==0)
    	    return true;
    	boolean dp[][] = new boolean[lens1+1][lens2+1];
    	dp[0][0] = true;

    	for(int i=1;i<=lens1;i++){
    		if(s1.charAt(i-1)==s3.charAt(i-1))
    			dp[i][0] = true;
    	}
    	for(int j=1;j<=lens2;j++){
    		if(s2.charAt(j-1)==s3.charAt(j-1))
    			dp[0][j] = true;
    	}
    	
    	for(int i=1;i<=lens1;i++){
    		for(int j=1;j<=lens2;j++){
    			char c3 = s3.charAt(i+j-1);
    			if(s1.charAt(i-1)==c3&&dp[i-1][j])//s1.charAt(i-1)表示字符串s1中第i个字符
    				dp[i][j] = true;
    			if(s2.charAt(j-1)==c3&&dp[i][j-1])//s2.charAt(j-1)表示字符串s2中第j个字符
    				dp[i][j] = true;
    		}
    	}
        return dp[lens1][lens2];
    }