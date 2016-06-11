/**
	����һ�ö�������������ڵ�ֵ�Ĳ�α��������������ҷ��ʣ�

	����
	��һ�ö����� {3,9,20,#,#,15,7} ��

	  3
	 / \
	9  20
	  /  \
	 15   7
	�������ķֲ���������

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