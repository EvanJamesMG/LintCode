/**
	给一个排序数组（从小到大），将其转换为一棵高度最小的排序二叉树。

	样例
	给出数组 [1,2,3,4,5,6,7], 返回

		 4
	   /   \
	  2     6
	 / \    / \
	1   3  5   7
 */ 
public class Solution {
    /**
     * @param A: an integer array
     * @return: a tree node
     */
    public TreeNode sortedArrayToBST(int[] A) {  
        // write your code here
        TreeNode res = null;
        if(A==null||A.length==0)
            return res;
        if(A.length==1){
            res = new TreeNode(A[0]);
            return res;
        }
        
        res = new TreeNode(A[A.length/2]);
        res.left = sortedArrayToBST(Arrays.copyOfRange(A,0,A.length/2));
        res.right = sortedArrayToBST(Arrays.copyOfRange(A,A.length/2+1,A.length));

        return res;
    }  
}
