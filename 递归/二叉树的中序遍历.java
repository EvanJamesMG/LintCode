/**
	给出一棵二叉树,返回其中序遍历

	样例
	给出二叉树 {1,#,2,3},

	   1
		\
		 2
		/
	   3
	返回 [1,3,2].
 */
public class Solution {
    /**
     * @param root: The root of binary tree.
     * @return: Inorder in ArrayList which contains node values.
     */
    public ArrayList<Integer> inorderTraversal(TreeNode root) {
        // write your code here
        ArrayList<Integer> res = new ArrayList<>();
        if(root==null)
            return res;
        if(root.left!=null)
            res.addAll(inorderTraversal(root.left));
        res.add(root.val);
        if(root.right!=null)
            res.addAll(inorderTraversal(root.right));
        return res;
    }
}