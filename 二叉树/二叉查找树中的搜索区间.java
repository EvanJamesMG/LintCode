/**
	��������ֵ k1 �� k2��k1 < k2����һ������������ĸ��ڵ㡣�ҵ���������ֵ�� k1 �� k2 ��Χ�ڵĽڵ㡣
	����ӡ����x (k1 <= x <= k2) ���� x �Ƕ�����������еĽڵ�ֵ��
	������������Ľڵ�ֵ��

	����
	����� k1 = 10 �� k2 = 22, ��ĳ���Ӧ�÷��� [12, 20, 22].

		20
	   /  \
	  8   22
	 / \
	4   12
	
	˼·��������� + ��Ҫ�������ж��൱�ڼ�֦����
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