/**
	����һ�ö��������ҵ������ڵ������������ڵ�(LCA)��

	������������������ڵ�Ĺ��������Ƚڵ��Ҿ��������ȡ�

	����
	����������ö�����

	  4
	 / \
	3   7
	   / \
	  5   6
	LCA(3, 5) = 4

	LCA(5, 6) = 7

	LCA(6, 7) = 7
 */
public class Solution {
    /**
     * @param root: The root of the binary search tree.
     * @param A and B: two nodes in a Binary.
     * @return: Return the least common ancestor(LCA) of the two nodes.
     */
    private static boolean covers(TreeNode rootNode, TreeNode n) {
        if(rootNode == null) return false;
        if(rootNode == n) return true;
        return covers(rootNode.left, n) || covers(rootNode.right, n);
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode A, TreeNode B) {
        // write your code here
        TreeNode res=null;
        if(root==null)
            return res;
        if (covers(root.left, A)&&covers(root.left, B))
            return lowestCommonAncestor(root.left, A, B);
        if (covers(root.right, A)&&covers(root.right, B))
            return lowestCommonAncestor(root.right, A, B);

        return root;
    }
}