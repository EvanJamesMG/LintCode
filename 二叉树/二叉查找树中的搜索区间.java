/**
	给定两个值 k1 和 k2（k1 < k2）和一个二叉查找树的根节点。找到树中所有值在 k1 到 k2 范围内的节点。
	即打印所有x (k1 <= x <= k2) 其中 x 是二叉查找树的中的节点值。
	返回所有升序的节点值。

	样例
	如果有 k1 = 10 和 k2 = 22, 你的程序应该返回 [12, 20, 22].

		20
	   /  \
	  8   22
	 / \
	4   12
	
	思路：中序遍历 + 必要的条件判断相当于剪枝操作
 */
public class Solution {
    /**
     * @param root: The root of the binary search tree.
     * @param k1 and k2: range k1 to k2.
     * @return: Return all keys that k1<=key<=k2 in ascending order.
     */
    public ArrayList<Integer> searchRange(TreeNode root, int k1, int k2) {
        // write your code here
        ArrayList<Integer> res = new ArrayList<>();
        if(root==null)
            return res;
        if(root.left!=null){
            if(root.left.val<k1)
                res.addAll(searchRange(root.left.right, k1, k2));
            else if(root.left.val>k2)
                res.addAll(searchRange(root.left.left,k1,k2));
            else
                res.addAll(searchRange(root.left, k1, k2));
        }
        if(root.val>=k1&&root.val<=k2)
            res.add(root.val);
        if(root.right!=null){
            if(root.right.val<k1)
                res.addAll(searchRange(root.right.right, k1, k2));
            else if(root.right.val>k2)
                res.addAll(searchRange(root.right.left, k1, k2));
            else
                res.addAll(searchRange(root.right,k1,k2));
        }
        return res;
    }
}