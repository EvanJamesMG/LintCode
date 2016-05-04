/*
����һ��������,ȷ�����Ǹ߶�ƽ��ġ������������,һ�ø߶�ƽ��Ķ������Ķ����ǣ�һ�ö�������ÿ���ڵ������������������ᳬ��1�� 


����
���������� A={3,9,20,#,#,15,7}, B={3,#,20,15,7}

A)  3            B)    3 
   / \                  \
  9  20                 20
    /  \                / \
   15   7              15  7
������A�Ǹ߶�ƽ��Ķ�����������B����

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