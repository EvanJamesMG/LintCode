/**
	����һ�ö�������������ڵ�ֵ�ľ���β�α������ȴ������ң���һ���ٴ������󣬲����֮�佻����У� 

	����
	����һ�ö����� {3,9,20,#,#,15,7},

		3
	   / \
	  9  20
		/  \
	   15   7
	���������εĲ�α���Ϊ��

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