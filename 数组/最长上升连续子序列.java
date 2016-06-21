/**

����һ���������飨�±�� 0 �� n-1�� n ��ʾ��������Ĺ�ģ�������ҳ��������е���������������С�����������������п��Զ���Ϊ���ҵ��������ҵ����С���

 ע������

time

����
���� [5, 4, 2, 1, 3], ����������������У�LICS��Ϊ [5, 4, 2, 1], ���� 4.

���� [5, 1, 2, 3, 4], ����������������У�LICS��Ϊ [1, 2, 3, 4], ���� 4.
*/

public class Solution {
    /**
     * @param A an array of Integer
     * @return  an integer
     */
    public int longestIncreasingContinuousSubsequence(int[] A) {
		int maxnum  = 0;
		if(A==null||A.length==0)
			return 0;
		if(A.length==1)
			return 1;
    	for(int i=0;i<A.length-1;i++){
			int k = 1;
			while(A[i+1]>=A[i]){
				k++;
				i++;
				if(i==A.length-1)
					break;
			}
			maxnum = Math.max(maxnum, k);
		}
		
		for(int i=A.length-1;i>=1;i--){
			int k = 1;
			while(A[i-1]>=A[i]){
				k++;
				i--;
				if(i==0)
					break;
			}
			maxnum = Math.max(maxnum, k);
			
		}
    	return maxnum;
    }
}