/**
	����һ�����������һ��Ŀ��ֵ��������������ҵ�Ŀ��ֵ�򷵻����������û�У����ص������ᱻ��˳������λ�á�

	����Լ��������������ظ�Ԫ�ء�

	����
	[1,3,5,6]��5 �� 2

	[1,3,5,6]��2 �� 1

	[1,3,5,6]�� 7 �� 4

	[1,3,5,6]��0 �� 0
*/
public class Solution {
    /** 
     * param A : an integer sorted array
     * param target :  an integer to be inserted
     * return : an integer
     */
    public int searchInsert(int[] A, int target) {
		int left = 0 ;
		int right = A.length-1;
		int mid = 0;
		while(left<=right){
			mid = (left+right)/2;
			if(A[mid]==target)
				return mid;
			if(A[mid]<target){
				left = mid+1;
			}else if (A[mid]>target) {
				right = mid-1;
			}
		}
		
    	return left;
    }
}
