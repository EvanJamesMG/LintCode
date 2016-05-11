/*
	给出字符串S和字符串T，计算S的不同的子序列中T出现的个数。

	子序列字符串是原始字符串通过删除一些(或零个)产生的一个新的字符串，并且对剩下的字符的相对位置没有影响。
	(比如，“ACE”是“ABCDE”的子序列字符串,而“AEC”不是)。 

	样例
	给出S = "rabbbit", T = "rabbit"

	返回 3
*/	
	
	
/*
 *  首先设置动态规划数组dp[i][j]，表示S串中从开始位置到第i位置与T串从开始位置到底j位置匹配的子序列的个数.
 *  如果S串为空，那么dp[0][j]都是0;如果T串为空，那么dp[i][j]都是1，因为空串为是任何字符串的字串.
 *  若母串的最后一个字符与子串的最后一个字符不同，则长度为 j 的子串在长度为 i 的母串中出现的次数就是母串的前 i - 1 个字符中子串出现的次数，
 *  即 dp[i][j] = dp[i-1][j],
 *  若母串的最后一个字符与子串的最后一个字符相同，那么除了前 i - 1 个字符出现字串的次数外，还要加上子串的前 j - 1 个字符在母串的前 i - 1 个字符中出现的次数，
 *  即 dp[i][j] = dp[i-1][j] + dp[i - 1][j - 1]。  
 */
    public static int numDistinct(String S, String T) {
        // write your code here
    	int lenS = S.length(); 
    	int lenT = T.length();
    	int[][] dp = new int[lenS+1][lenT+1];
    	dp[0][0] = 1;
    	for(int i=1;i<=lenS;i++){
    		dp[i][0] = 1;
    	}
    	for(int j=1;j<=lenT;j++){
    		dp[0][j] = 0;
    	}
    	for(int i=1;i<=lenS;i++){
    		for(int j=1;j<=lenT;j++){
    			if(S.charAt(i-1)==T.charAt(j-1)){
    				dp[i][j] = dp[i-1][j-1]+dp[i-1][j];
    			}else{
    				dp[i][j] = dp[i-1][j];
    			}  				
    		}
    	}
    	return dp[lenS][lenT];
    }