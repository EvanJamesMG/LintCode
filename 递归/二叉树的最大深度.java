/**
	����һ�����������ҳ��������ȡ�

	�����������Ϊ���ڵ㵽��ԶҶ�ӽڵ�ľ��롣

	����
	����һ�����µĶ�����:

	  1
	 / \ 
	2   3
	   / \
	  4   5
	�����������������Ϊ3.
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