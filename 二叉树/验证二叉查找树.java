/**

	给定一个二叉树，判断它是否是合法的二叉查找树(BST)

	一棵BST定义为：

	节点的左子树中的值要严格小于该节点的值。
	节点的右子树中的值要严格大于该节点的值。
	左右子树也必须是二叉查找树。
	一个节点的树也是二叉查找树。

	样例
	一个例子：

	  2
	 / \
	1   4
	   / \
	  3   5
	上述这棵二叉树序列化为 {2,1,4,#,#,3,5}.
*/

public class Solution {
    /**
     * @param root: The root of binary tree.
     * @return: True if the binary tree is BST, or false
     */
    public static boolean isValidBST(TreeNode root) {
        // write your code here
        return helper(root,(Integer.MIN_VALUE)*10.0,(Integer.MAX_VALUE)*10.0);
    }

    private static boolean helper(TreeNode root, double minValue, double maxValue) {
        if(root==null)
            return true;
        if(root.val<=minValue||root.val>=maxValue)
            return false;
        return helper(root.left,minValue,root.val)&&helper(root.right,root.val,maxValue);
    }
}