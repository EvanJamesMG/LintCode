/**
	合并两个排序的整数数组A和B变成一个新的数组。

	 注意事项

	你可以假设A具有足够的空间（A数组的大小大于或等于m+n）去添加B中的元素。

	样例
	给出 A = [1, 2, 3, empty, empty], B = [4, 5]

	合并之后 A 将变成 [1,2,3,4,5]
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