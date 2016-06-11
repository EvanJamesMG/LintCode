/**
	检查两棵二叉树是否等价。等价的意思是说，首先两棵二叉树必须拥有相同的结构，并且每个对应位置上的节点上的数都相等。

	样例
		1             1
	   / \           / \
	  2   2   and   2   2
	 /             /
	4             4
	就是两棵等价的二叉树。

		1             1
	   / \           / \
	  2   3   and   2   3
	 /               \
	4                 4
	就不是等价的。
 */
public class Solution {
    /**
     * @param a, b, the root of binary trees.
     * @return true if they are identical, or false.
     */
    public boolean isIdentical(TreeNode a, TreeNode b) {
        if(a==null&&b==null)
            return true;
        if(a==null||b==null)
            return false;
        if(a.val!=b.val)
            return false;
        else{
            return isIdentical(a.left,b.left)&&isIdentical(a.right,b.right);
        }
    }
}