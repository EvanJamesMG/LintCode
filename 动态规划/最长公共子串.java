/*
���������ַ������ҵ�������Ӵ����������䳤�ȡ�

 ע������

�Ӵ����ַ�Ӧ�������ĳ�����ԭ�ַ����У�����������������ͬ��

����
����A=��ABCD����B=��CBCE�������� 2
*/

/*
state: dp[i][j] ��ʾǰi���ַ�����ǰj���ַ���LCS����(���������i j��β���ַ�)
        Ҳ����˵i��j��β���ַ�����Ҳ��ƥ����
		��A[i] != B[j] ʱ��i,j��β���ַ�û��ƥ���ϣ�����dp[i][j]��û����i��j��β���ַ��������Ӵ��ˣ�dp[i][j]=0
*/
public class Solution {
    /**
     * @param A, B: Two string.
     * @return: the length of the longest common substring.
     */
    public int longestCommonSubstring(String A, String B) {
    	int lenA = A.length();
    	int lenB = B.length();
    	int dp[][] = new int[lenA+1][lenB+1];
    	int maxres = 0;
    	for(int i=1;i<=lenA;i++){
    		for(int j=1;j<=lenB;j++){
    			if(A.charAt(i-1)==B.charAt(j-1)){
    				dp[i][j] = dp[i-1][j-1]+1;
    			}else{
    				dp[i][j]=0;
    			}
    			maxres = Math.max(maxres, dp[i][j]);
    		}
    	}
		return maxres;
	}
}