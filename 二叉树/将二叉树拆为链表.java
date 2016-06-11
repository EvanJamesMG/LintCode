/**
	��һ�ö���������ǰ���������Ϊһ����������ν�ļ�������˵���ö������� right ָ�룬����ʾ�����е� next ָ�롣

	 ע������

	��Ҫ���ǽ�����ӱ��Ϊ null����������ܻ�õ��ռ��������ʱ�������
	����
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