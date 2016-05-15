	/*
	给出两个单词word1和word2，计算出将word1 转换为word2的最少操作次数。

		你总共三种操作方法：

		插入一个字符
		删除一个字符
		替换一个字符
		样例
		给出 work1="mart" 和 work2="karma"

		返回 3
	*/
	
	/*
	 * 动态数组dp[word1.length+1][word2.length+1]

		dp[i][j]表示从word1前i个字符转换到word2前j个字符最少的步骤数。
		
		假设word1现在遍历到字符x，word2遍历到字符y（word1当前遍历到的长度为i，word2为j）。
		
		以下两种可能性：
		
		1. x==y，那么不用做任何编辑操作，所以dp[i][j] = dp[i-1][j-1]
		
		2. x != y
		
		   (1) 在word1插入y， 那么dp[i][j] = dp[i][j-1] + 1 
		   （dp[i][j-1]表示word1前i个字符转换为word2前j-1个字符最小的步骤数，现在求word1前i个字符转换为word2前j个字符最小的步骤数，
		      只需增加1个步骤,也就是将word2的新加入的第j个字符加入进来）
		 
		   (2) 在word1删除x， 那么dp[i][j] = dp[i-1][j] + 1 
		   （dp[i-1][j]表示word1前i-1个字符转换为word2前j个字符最小的步骤数，现在求word1前i个字符转换为word2前j个字符最小的步骤数，
		      只需增加1个步骤,也就是将word1的新加入的第i个字符删除）
		
		   (3) 把word1中的x用y来替换，那么dp[i][j] = dp[i-1][j-1] + 1 (word1的前i-1个字符 已经和 word2的前j-1个字符 相等了 )
		   （dp[i-1][j-1]表示word1前i-1个字符转换为word2前j-1个字符最小的步骤数，现在求word1前i个字符转换为word2前j个字符最小的步骤数，
		      只需增加1个步骤,也就是将word1的新加入的第i个字符直接转化为word2新加入的第j个字符）
		
		 最少的步骤就是取这三个中的最小值。
		
		最后返回 dp[word1.length+1][word2.length+1] 即可。
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
    				int insert = dp[i][j-1] + 1; // 在word1插入y
    				int delet = dp[i-1][j] + 1;  // 在word1删除x
    				int replace = dp[i-1][j-1] + 1; // 把word1中的x用y来替换
    				dp[i][j] = Math.min(insert, Math.min(delet, replace));
    			}
    		}
    	}
    	return dp[len1][len2];
    }