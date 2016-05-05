/*
����һ���������飬�ҳ��������ص�������ʹ�����ǵĺ����

ÿ��������������������е�λ��Ӧ���������ġ�

�������ĺ͡�

 ע������

���������ٰ���һ����

����
��������[1, 3, -1, 2, -1, 2]��������������ֱ�Ϊ[1, 3]��[2, -1, 2]����[1, 3, -1, 2]��[2]�����ǵ����Ͷ���7
*/

public class Solution {
    /**
     * @param nums: A list of integers
     * @return: An integer denotes the sum of max two non-overlapping subarrays
     */
    public int maxTwoSubArrays(ArrayList<Integer> nums) {
    	ArrayList<Integer> input = new ArrayList<>();
    	int res = Integer.MIN_VALUE;
    	for(int sub:nums){
    		input.add(sub);
    	}
    	
    	for(int i=1;i<nums.size();i++){
    		ArrayList <Integer> leftsub = new ArrayList<>(input.subList(0, i));
    		ArrayList<Integer> rightsub = new ArrayList<>( input.subList(i,input.size()));
        	int maxleftsub = maxSubArray(leftsub);
        	int maxrightsub = maxSubArray(rightsub);
        	
        	res= Math.max(res, maxleftsub+maxrightsub);
    	}
		return res;
    	
    }

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
}
