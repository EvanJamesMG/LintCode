/**
	�ϲ������������������A��B���һ���µ����顣

	 ע������

	����Լ���A�����㹻�Ŀռ䣨A����Ĵ�С���ڻ����m+n��ȥ���B�е�Ԫ�ء�

	����
	���� A = [1, 2, 3, empty, empty], B = [4, 5]

	�ϲ�֮�� A ����� [1,2,3,4,5]
*/
class Solution {
    /**
     * @param A: sorted integer array A which has m elements, 
     *           but size of A is m+n
     * @param B: sorted integer array B which has n elements
     * @return: void
     */
    public void mergeSortedArray(int[] A, int m, int[] B, int n) {
        int len = m+n-1;
        int numA = m-1;
        int numB = n-1;
        while(numA>=0&&numB>=0){
            if(A[numA]>B[numB]){
                A[len] = A[numA];
                len--;
                numA--;
            }else{
                A[len] = B[numB];
                numB--;
                len--;
            }
        }
        while(numB>=0){
            A[len] = B[numB];
            numB--;
            len--;
        }
    }
}