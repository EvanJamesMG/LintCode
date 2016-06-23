/**
	给出一棵二叉树，返回其节点值的锯齿形层次遍历（先从左往右，下一层再从右往左，层与层之间交替进行） 

	样例
	给出一棵二叉树 {3,9,20,#,#,15,7},

		3
	   / \
	  9  20
		/  \
	   15   7
	返回其锯齿形的层次遍历为：

	[
	  [3],
	  [20,9],
	  [15,7]
	]
 */
 
 
public class Solution {
    /**
     * @param root: The root of binary tree.
     * @return: A list of lists of integer include 
     *          the zigzag level order traversal of its nodes' values 
     */
    public ArrayList<ArrayList<Integer>> zigzagLevelOrder(TreeNode root) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        if(root==null)
            return res;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int level = 0;
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
            level++;
            if(level%2==1)
                res.add(list);
            if(level%2==0){
                Collections.reverse(list);
                res.add(list);
            }
        }

        return res;
    }
}