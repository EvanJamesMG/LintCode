/*
�����һ����������(sizeΪn)������������ص㣺

����λ�õ������ǲ�ͬ��
A[0] < A[1] ���� A[n - 2] > A[n - 1]
�ٶ�P�Ƿ�ֵ��λ��������A[P] > A[P-1]��A[P] > A[P+1]����������������һ����ֵ��λ�á�

 ע������

������ܰ��������ֵ��ֻ���ҵ����е��κ�һ������

����
��������[1, 2, 1, 3, 4, 5, 7, 6]����1, ����ֵ 2 ����λ��, ����6, ����ֵ 7 ����λ��.
*/

class Solution {
    /**
     * @param A: An integers array.
     * @return: return any of peek positions.
     */
    public int findPeak(int[] A) {
    	int left = 0;
    	int right = A.length-1;
    	int mid = 0;
    	while(left<=right){
    		mid = (left+right)/2;
    		if(mid>=1 && A[mid]>A[mid-1] && A[mid]>A[mid+1])
    			return mid;
    		if(A[mid]<=A[mid+1])
    			left = mid+1;
    		else{
    			right = mid-1;
    		}
    		
    	}
    	return -1;
    }
}
