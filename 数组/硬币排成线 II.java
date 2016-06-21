/*
�� n ����ͬ��ֵ��Ӳ���ų�һ���ߡ���������������������������� 1 �� 2 ��Ӳ�ң�ֱ��û��Ӳ��Ϊֹ�����������˷ֱ��õ���Ӳ���ܼ�ֵ����ֵ�ߵ��˻�ʤ��

���ж� ��һ����� ���仹��Ӯ��

����
�������� A = [1,2,2], ���� true.

�������� A = [1,2,4], ���� false.
*/
/*
 * ����dp[i]��ʾ��i��end��ȡ�������ֵ(ע������㲻����i���Ǵ�i+1��ʼ��)

	��������i����������ѡ��
	
	1.��ȡvalues[i]���Է�����ȡvalues[i+1] ����values[i+1] + values[i+2]
	
		���Է�ȡvalues[i+1] �� ������ֻ�ܴ� i+2 ��end��ȡ��������ȡ�����ֵ��dp[i+2],  ע�⣺�Է���ѡȡ�Ľ��һ����ʹ�������Ժ�ѡȡ��ֵ��С
		
		���Է�ȡvalues[i+1] + values[i+2]������ֻ�ܴ�i+3��end��ȡ��������ȡ�����ֵ��dp[i+3]��
		
		��ʱ��dp[i] = values[i] + min(dp[i+2],dp[i+3]) , ע�⣺�Է���ѡȡ�Ľ��һ����ʹ�������Ժ�ѡȡ��ֵ��С
	
	2.��ȡvalues[i] + values[i+1],�Է���ȡvalues[i+2] ����values[i+2] + values[i+3]
	
		���Է�ȡvalues[i+2]������ֻ�ܴ�i+3��end��ȡ������ȡ�����ֵ��dp[i+3]
		
		���Է�ȡvalues[i+2]+values[i+3]������ֻ�ܴ�i+4��end��ȥ������ȡ�����ֵ��dp[i+4]
		
		��ʱ��dp[i] = values[i] + values[i+1]+min(dp[i+3],dp[i+4])
		
		�����ȡ��Сֵ������һ������˼���Է�ѡȡ��֮���ֵһ����ʹ������ѡȡ��ֵ��С���Է���ɵ���һ��ܴ���
		
		������ǿ���ȡ��������dp[i]�����ֵ�����Ǵ𰸣�������˼�ǣ��Է����ò�ķ����У�����ѡȡ�����ֵ��
 */
	
    public static boolean firstWillWin(int[] values) {
        // write your code here
    	int len = values.length;
    	int[] dp = new int[len+1];
    	if(values==null ||values.length==0)
    		return false;
    	if(len<=2)
    		return true;
    	if(len==3)
    		return (values[0]+values[1])>values[2];
    	dp[len] = 0;
    	dp[len-1] = values[len-1];
    	dp[len-2] = values[len-1]+values[len-2];
    	dp[len-3] = values[len-3]+values[len-2];
    	
    	for(int i=len-4;i>=0;i--){
    		dp[i] = values[i] + Math.min(dp[i+2], dp[i+3]);
    		dp[i] = Math.max(dp[i], values[i]+values[i+1]+Math.min(dp[i+3], dp[i+4]));
    	}
    	
        int sum = 0;
        for(int sub:values)
        	sum+=sub;
        return dp[0]>(sum-dp[0]);
    }