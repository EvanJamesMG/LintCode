import java.util.Arrays;
/*
����һ������ 0 .. N �� N ���������У��ҳ�0 .. N ��û�г����������е��Ǹ�����

 ע������

���Ըı�����������λ�á�

����
 N = 4 ������Ϊ [0, 1, 3] ʱ��ȱʧ����Ϊ2��
*/
public class Solution {
    /**    
     * @param nums: an array of integers
     * @return: an integer
     */
    public int findMissing(int[] nums) {
		Arrays.sort(nums);
    	for(int i=0;i<nums.length;i++){
    		if(nums[i]!=i)
    			return i;
		}
    	return nums.length;
    }
}