	/*
	  �ҳ�һ�������г˻��������������У����ٰ���һ��������
	  
	  ����
		����, ���� [2,3,-2,4] �г˻�����������Ϊ [2,3] ����˻�Ϊ6��
	*/
	
	/*
	 * ����һ��
	 * ��̬�滮����⣺productArray[i][j]��ʱ�����ٴ�ѭ����i��j���������ã�productArray[i][j]=productArray[i][j-1]*A[j];
	 * ���õ��Ƶķ��������㣬�㷨ʱ�临�Ӷ�ΪO(n2)
	 * ʱ��Ϳռ䶼��ͨ��
	 */
    public static int maxProduct(int[] nums) {
    	int[][] dp = new int[nums.length][nums.length];
    	int maxpru = nums[0];
    	int len = nums.length;
    	for(int i=0;i<len;i++){
    		for(int j=i;j<len;j++){
    			if(i==j){
    				dp[i][j] = nums[j];
    			}else {
					dp[i][j] = dp[i][j-1] *nums[j];
				}
    			if(dp[i][j]>maxpru)
    				maxpru = dp[i][j];
    		}
    	}
    	
		return maxpru;
    }
	
	
	/* ��������
	 * ��ʵ������˻����ֵ�Ŀ�����Ϊ���۳˵����ֵ������һ��������
	 * ���ߣ��۳˵���Сֵ����������������һ������������ÿ��Ҫ�����۳˵��������������Сֵ����������
	 * ͬʱ����һ��ѡ�������߼������֮ǰ��������Сֵͬ��ǰԪ�����֮��û�е�ǰԪ�ش󣨻�С����ô��ǰԪ�ؾͿ���Ϊ�µ���㡣
	 * ���磬ǰһ��Ԫ��Ϊ0�������{1,0,9,2}����9��ʱ��9Ӧ����Ϊһ�����ֵ��Ҳ�����µ���㣬{1,0,-9,-2}Ҳ��ͬ������-9�ȵ�ǰ��Сֵ��С�����Ը���Ϊ��ǰ��Сֵ��
	 * ���ַ���ֻ��Ҫ����һ�����鼴�ɣ��㷨ʱ�临�Ӷ�ΪO(n)��
	 */
    public static int maxProduct(int[] nums) {
    	
    	int len = nums.length;
    	int[] dpmin = new int[nums.length];
    	int[] dpmax = new int[nums.length];
    	dpmin[0] = nums[0];
    	dpmax[0] = nums[0];
    	int maxres = nums[0];
    	for(int i=1;i<len;i++){
    		dpmin[i] = Math.min(Math.min(dpmin[i-1]*nums[i], dpmax[i-1]*nums[i]), nums[i]);
    		dpmax[i] = Math.max(Math.max(dpmin[i-1]*nums[i], dpmax[i-1]*nums[i]), nums[i]);

    		if(dpmax[i]>maxres)
    			maxres = dpmax[i];
    	}
    	
		return maxres;
    }