/*
  给定一个数组和一个值，在原地删除与值相同的数字，返回新数组的长度。

   元素的顺序可以改变，并且对新的数组不会有影响。

	样例
	给出一个数组 [0,4,4,0,0,2,4,4]，和值 4

	返回 4 并且4个元素的新数组为[0,0,0,2]
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
