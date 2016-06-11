/**

	����һ�����������ж����Ƿ��ǺϷ��Ķ��������(BST)

	һ��BST����Ϊ��

	�ڵ���������е�ֵҪ�ϸ�С�ڸýڵ��ֵ��
	�ڵ���������е�ֵҪ�ϸ���ڸýڵ��ֵ��
	��������Ҳ�����Ƕ����������
	һ���ڵ����Ҳ�Ƕ����������

	����
	һ�����ӣ�

	  2
	 / \
	1   4
	   / \
	  3   5
	������ö��������л�Ϊ {2,1,4,#,#,3,5}.
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