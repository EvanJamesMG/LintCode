	/*
	������������word1��word2���������word1 ת��Ϊword2�����ٲ���������

		���ܹ����ֲ���������

		����һ���ַ�
		ɾ��һ���ַ�
		�滻һ���ַ�
		����
		���� work1="mart" �� work2="karma"

		���� 3
	*/
	
	/*
	 * ��̬����dp[word1.length+1][word2.length+1]

		dp[i][j]��ʾ��word1ǰi���ַ�ת����word2ǰj���ַ����ٵĲ�������
		
		����word1���ڱ������ַ�x��word2�������ַ�y��word1��ǰ�������ĳ���Ϊi��word2Ϊj����
		
		�������ֿ����ԣ�
		
		1. x==y����ô�������κα༭����������dp[i][j] = dp[i-1][j-1]
		
		2. x != y
		
		   (1) ��word1����y�� ��ôdp[i][j] = dp[i][j-1] + 1 (word2��ǰj-1���ַ� �Ѿ��� word1��ǰi���ַ� ����� )
		 
		   (2) ��word1ɾ��x�� ��ôdp[i][j] = dp[i-1][j] + 1 ((word1��ǰi-1���ַ� �Ѿ��� word2��ǰj���ַ� ����� ))
		
		   (3) ��word1�е�x��y���滻����ôdp[i][j] = dp[i-1][j-1] + 1 (word1��ǰi-1���ַ� �Ѿ��� word2��ǰj-1���ַ� ����� )
		
		 ���ٵĲ������ȡ�������е���Сֵ��
		
		��󷵻� dp[word1.length+1][word2.length+1] ���ɡ�
	 */
	
    public static int minDistance(String word1, String word2) {
        // write your code here
    	int len1= word1.length();
    	int len2= word2.length();
    	int[][] dp = new int[len1+1][len2+1];
    	
    	for(int i=1;i<=len1;i++){
    		dp[i][0] = i;
    	}
    	for(int j=1;j<=len2;j++){
    		dp[0][j] = j;
    	}
    	for(int i=1;i<=len1;i++){
    		for(int j=1;j<=len2;j++){
    			if(word1.charAt(i-1)==word2.charAt(j-1)){
    				dp[i][j] = dp[i-1][j-1];
    			}else{
    				int insert = dp[i][j-1] + 1;
    				int delet = dp[i-1][j] + 1;
    				int replace = dp[i-1][j-1] + 1;
    				dp[i][j] = Math.min(insert, Math.min(delet, replace));
    			}
    		}
    	}
    	return dp[len1][len2];
    }