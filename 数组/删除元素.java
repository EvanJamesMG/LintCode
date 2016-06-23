/**
	����һ�������һ��ֵ����ԭ��ɾ����ֵ��ͬ�����֣�����������ĳ��ȡ�

	Ԫ�ص�˳����Ըı䣬���Ҷ��µ����鲻����Ӱ�졣

	����
	����һ������ [0,4,4,0,0,2,4,4]����ֵ 4

	���� 4 ����4��Ԫ�ص�������Ϊ[0,0,0,2]
*/

public class Solution {
    /** 
     *@param A: A list of integers
     *@param elem: An integer
     *@return: The new length after remove
     */
    public int removeElement(int[] A, int elem) {
        // write your code here
        if(A==null||A.length==0)
            return 0;
        int index = 0;
        for(int i=0;i<A.length;i++){
            if(A[i]!=elem){
                swap(A,index,i);
                index++;
            }
        }
        return index;

    }

    private static void swap(int[] nums, int left, int right) {
        int tem = nums[left];
        nums[left] = nums[right];
        nums[right] = tem;
    }
   
}
