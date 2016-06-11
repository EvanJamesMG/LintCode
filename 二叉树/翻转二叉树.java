
/**
	��תһ�ö�����

	������ʵ���������Ƿ�����������⣿ Yes
	����
	  1         1
	 / \       / \
	2   3  => 3   2
	   /       \
	  4         4
 */
public class Solution {
    /**
     * @param root: a TreeNode, the root of the binary tree
     * @return: nothing
     */
    public void invertBinaryTree(TreeNode root) {
        if(root==null)
            return;
        invertBinaryTree(root.left);
        invertBinaryTree(root.right);
        TreeNode tem = root.left;
        root.left = root.right;
        root.right = tem;
    }
}