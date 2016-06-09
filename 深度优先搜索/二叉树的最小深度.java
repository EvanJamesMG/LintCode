/**
	����һ�����������ҳ�����С��ȡ�

	����������С���Ϊ���ڵ㵽���Ҷ�ӽڵ�ľ��롣
	����
	����һ�����µĶ�����:

			1
			
		 /     \ 

	   2       3

			  /    \

			4      5  

	�������������С���Ϊ 2
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