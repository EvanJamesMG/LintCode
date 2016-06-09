/**
	给定一个二叉树，找出其最小深度。

	二叉树的最小深度为根节点到最近叶子节点的距离。
	样例
	给出一棵如下的二叉树:

			1
			
		 /     \ 

	   2       3

			  /    \

			4      5  

	这个二叉树的最小深度为 2
 */
public class Solution {
    /**
     * @param root: The root of binary tree.
     * @return: An integer.
     */
    public int minDepth(TreeNode root) {
        // write your code here
        if(root==null)
            return 0;
        if(root.left==null&&root.right!=null)
            return minDepth(root.right)+1;
        if(root.left!=null&&root.right==null)
            return minDepth(root.left)+1;

        return Math.min(minDepth(root.left),minDepth(root.right))+1;
    }

}