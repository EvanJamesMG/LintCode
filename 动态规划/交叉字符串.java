	/*
	 *��̬�滮������dp[i][j]����ʾ��s1ȡǰiλ��s2ȡǰjλ���Ƿ������s3��ǰi+jλ��
	 *��ʼ���ǣ�����s1Ϊ�գ���ôs2ÿһλ��s3ƥ�����dp[0][j]������s2Ϊ�գ���ôs1ÿһλ��s3ƥ�����dp[i][0]
	 *
	 *���ƹ�ϵ��������ô�õ�dp[i][j]�����Կ�������ʵֻ�����ַ�ʽ�����ƣ�
	 *һ����ѡȡs1���ַ���Ϊs3�¼ӽ������ַ�����һ����ѡs2���ַ���Ϊ�½��ַ���
	 *��Ҫ�����ܲ���ѡȡ�������ж�s1(s2)�ĵ�i(j)���ַ��Ƿ���s3��i+j���ַ���ȡ�
	 *�������ѡȡ���Ҷ�Ӧ��dp[i-1][j](dp[i][j-1])ҲΪ�棬��˵��s3��i+j���ַ����Ա���ʾ��
	 *���������ֻҪ��һ�ֳ�������˵��res[i][j]Ϊ�棬��һ����Ĺ�ϵ��
	 *���Ե���ʽ���Ա�ʾ��:
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
    			if(s1.charAt(i-1)==c3&&dp[i-1][j])//s1.charAt(i-1)��ʾ�ַ���s1�е�i���ַ�
    				dp[i][j] = true;
    			if(s2.charAt(j-1)==c3&&dp[i][j-1])//s2.charAt(j-1)��ʾ�ַ���s2�е�j���ַ�
    				dp[i][j] = true;
    		}
    	}
        return dp[lens1][lens2];
    }