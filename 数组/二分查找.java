/**

����һ��������������飨���򣩺�һ��Ҫ���ҵ�����target��
��O(logn)��ʱ����ҵ�target��һ�γ��ֵ��±꣨��0��ʼ�������target�������������У�����-1��

����
������ [1, 2, 3, 3, 4, 5, 10] �ж��ֲ���3������2��
*/

class Solution {
    /**
     * @param nums: The integer array.
     * @param target: Target to find.
     * @return: The first position of target. Position starts from 0.
     */
    public int binarySearch(int[] nums, int target) {
    	if(nums==null || nums.length==0)
    		return -1;
    	int left = 0;
    	int right = nums.length-1;
    	int mid = 0;
    	int res = -1;
    	
    	while(left<=right){
    		mid = (left+right)/2;
    		if(nums[mid]==target)
    			break;
    		if(target>nums[mid]){
    			left = mid+1;
    		}else if (target<nums[mid]) {
				right = mid-1;
			}
    	}
    	if(nums[mid]==target){
    		for(int i =mid;i>=0;i--){
    			if(nums[0]==target)
    				res= 0;
    			if(nums[i]!=target){
    				res = i+1;
    				break;
    			}
    		}    		
    	}else{
    		res = -1;
    	}
		return res;
    }
}
