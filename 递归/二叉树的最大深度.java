/**
	给定一个二叉树，找出其最大深度。

	二叉树的深度为根节点到最远叶子节点的距离。

	样例
	给出一棵如下的二叉树:

	  1
	 / \ 
	2   3
	   / \
	  4   5
	这个二叉树的最大深度为3.
 */
public class Solution {
    /**
     * @param root: The root of binary tree.
     * @return: An integer.
     */
    public int maxDepth(TreeNode root) {
        // write your code here
        if(root==null)
            return 0;
        return Math.max(maxDepth(root.left)+1,maxDepth(root.right)+1);
    }
}