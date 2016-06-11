/**
	给出一棵二叉树，返回其节点值的层次遍历（逐层从左往右访问）

	样例
	给一棵二叉树 {3,9,20,#,#,15,7} ：

	  3
	 / \
	9  20
	  /  \
	 15   7
	返回他的分层遍历结果：

	[
	  [3],
	  [9,20],
	  [15,7]
	]
 */
 
 
public class Solution {
    /**
     * @param root: The root of binary tree.
     * @return: Level order a list of lists of integer
     */
    public ArrayList<ArrayList<Integer>> levelOrder(TreeNode root) {
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

        return res;
    }
}