/*
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
        int left = 0;
        int right = A.length-1;
        while(left<=right){
            if(A[left]==elem){
                if(A[right]!=elem){
                    swap(A,left,right);
                    left++;
                    right--;
                }else{
                    right--;
                }
            }else{
                left++;
            }
        }
        
        return left;

    }

    private static void swap(int[] a, int left, int right) {
        int tem = a[left];
        a[left] = a[right];
        a[right] = tem;
    }
   
}
