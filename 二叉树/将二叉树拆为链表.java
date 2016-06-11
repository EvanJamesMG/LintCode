/**
	将一棵二叉树按照前序遍历拆解成为一个假链表。所谓的假链表是说，用二叉树的 right 指针，来表示链表中的 next 指针。

	 注意事项

	不要忘记将左儿子标记为 null，否则你可能会得到空间溢出或是时间溢出。
	样例
				  1
				   \
		 1          2
		/ \          \
	   2   5    =>    3
	  / \   \          \
	 3   4   6          4
						 \
						  5
						   \
							6
 */
public class Solution {
    /**
     * @param root: a TreeNode, the root of the binary tree
     * @return: nothing
     */
    public void flatten(TreeNode root) {
        if(root==null)
            return;
        if(root.left==null&&root.right==null)
            return;
        flatten(root.left);
        flatten(root.right);
        if(root.left!=null) {
            TreeNode temleft = root.left;
            TreeNode tratemleft = temleft;
            while (tratemleft.right != null)
                tratemleft = tratemleft.right;

            root.left = null;
            tratemleft.right = root.right;
            root.right = temleft;
        }
    }
}