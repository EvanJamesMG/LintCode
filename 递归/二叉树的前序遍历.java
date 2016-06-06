
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
     * @return: Preorder in ArrayList which contains node values.
     */
    public ArrayList<Integer> preorderTraversal(TreeNode root) {
        // write your code here
        ArrayList<Integer> res = new ArrayList<>();
        if(root==null)
            return res;
        res.add(root.val);
        if(root.left!=null)
            res.addAll(preorderTraversal(root.left));
        if(root.right!=null)
            res.addAll(preorderTraversal(root.right));
        return res;
    }
}