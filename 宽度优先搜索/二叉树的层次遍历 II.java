/**
	给出一棵二叉树，返回其节点值从底向上的层次序遍历（按从叶节点所在层到根节点所在的层遍历，然后逐层从左往右遍历）

	您在真实的面试中是否遇到过这个题？ Yes
	样例
	给出一棵二叉树 {3,9,20,#,#,15,7},

		3
	   / \
	  9  20
		/  \
	   15   7
	按照从下往上的层次遍历为：

	[
	  [15,7],
	  [9,20],
	  [3]
	]
*/
public class Solution {
    /**
     * @param root: The root of binary tree.
     * @return: buttom-up level order a list of lists of integer
     */
    public ArrayList<ArrayList<Integer>> levelOrderBottom(TreeNode root) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        if(root==null)
            return res;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            ArrayList<Integer> list = new ArrayList<>();
            int len = queue.size();
            for(int i=0;i<len;i++){
                TreeNode temroot = queue.poll();
                list.add(temroot.val);
                if(temroot.left!=null)
                    queue.add(temroot.left);
                if(temroot.right!=null)
                    queue.add(temroot.right);
            }
            res.add(list);
        }
        Collections.reverse(res);
        return res;
    }
}