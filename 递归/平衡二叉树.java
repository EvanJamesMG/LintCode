/*
给定一个二叉树,确定它是高度平衡的。对于这个问题,一棵高度平衡的二叉树的定义是：一棵二叉树中每个节点的两个子树的深度相差不会超过1。 


样例
给出二叉树 A={3,9,20,#,#,15,7}, B={3,#,20,15,7}

A)  3            B)    3 
   / \                  \
  9  20                 20
    /  \                / \
   15   7              15  7
二叉树A是高度平衡的二叉树，但是B不是

*/


/**
 * Definition of TreeNode:
 * public class TreeNode {
 *     public int val;
 *     public TreeNode left, right;
 *     public TreeNode(int val) {
 *         this.val = val;
 *         this.left = this.right = null;
 *     }
 * }
 */
public class Solution {
    /**
     * @param root: The root of binary tree.
     * @return: True if this Binary tree is Balanced, or false.
     */
    public boolean isBalanced(TreeNode root) {
    	if(root == null)
    		return true;
    	TreeNode left = root.left;
    	TreeNode right = root.right;
    	if(isBalanced(left)&&isBalanced(right))
    		return Math.abs(getheight(left)-getheight(right))<=1;
    	else {
    		return false;
		}
    }

	private int getheight(TreeNode root) {
		// TODO Auto-generated method stub
		if(root== null)
			return 0;
		return Math.max(getheight(root.left), getheight(root.right))+1;
	}
}