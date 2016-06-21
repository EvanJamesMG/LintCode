/**
����һ���������飬�ҳ��������ص���������A��B��ʹ����������͵Ĳ�ľ���ֵ|SUM(A) - SUM(B)|���

����������Ĳ�ֵ��

 ע������

���������ٰ���һ����

������ʵ���������Ƿ�����������⣿ Yes
����
��������[1, 2, -3, 1]������ 6
*/
/*
 *��ԭ��������и��Ϊ�������������飬
 * �ֱ�����������еĴ��ڵ����������ֵand��Сֵ 
 *         �������еĴ��ڵ����������ֵand��Сֵ
 * ���ľ���ֵ�����ô���������͵������Сֵ��Ȼ��������У������п������������ұ���С��Ҳ��
 * ���������С�ұ����
 */
public class Solution {
    /**
     * @param nums: A list of integers
     * @return: An integer indicate the value of maximum difference between two
     *          Subarrays
     */
    public int maxDiffSubArrays(int[] nums) {
    	ArrayList<Integer> input = new ArrayList<>();
    	int res = Integer.MIN_VALUE;
    	for(int sub:nums){
    		input.add(sub);
    	}
    	
    	for(int i=1;i<nums.length;i++){
    		ArrayList <Integer> leftsub = new ArrayList<>(input.subList(0, i));
    		ArrayList<Integer> rightsub = new ArrayList<>( input.subList(i,input.size()));
        	int minleftsub = minSubArray(leftsub);
        	int maxleftsub = maxSubArray(leftsub);
        	int minrightsub = minSubArray(rightsub);
        	int maxrightsub = maxSubArray(rightsub);
        	
        	int maxone = Math.abs(maxleftsub - minrightsub);
        	int maxtwo = Math.abs(maxrightsub - minleftsub);
        	res= Math.max(res, Math.max(maxone,maxtwo));
    	}
		return res;
    	
    }

    /*ȡ�����е�����������ֵ*/
    private static int maxSubArray(ArrayList<Integer> nums) {
		// TODO Auto-generated method stub
    	if(nums==null ||nums.size()==0)
    		return 0;
		int tem = Integer.MIN_VALUE;
		int maxvalue = Integer.MIN_VALUE;
    	for(int sub:nums){
    		if(tem<0){
    			tem = sub;
    		}else{
    			tem+=sub;
    		}
    		maxvalue = Math.max(maxvalue, tem);
    	}
		return maxvalue;
	}

    /*ȡ�����е����������Сֵ*/
    public static int minSubArray(ArrayList<Integer> nums) {
    	if(nums==null ||nums.size()==0)
    		return 0;
    	int tem= Integer.MAX_VALUE;
    	int minvalue = Integer.MAX_VALUE;
    	for(int sub:nums){
    		if(tem>0){
    			tem = sub;
    		}else{
    			tem+=sub;
    		}
    		minvalue = Math.min(minvalue, tem);
    	}
		return minvalue;
    }
}
