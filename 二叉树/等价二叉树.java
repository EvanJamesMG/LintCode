/**
	������ö������Ƿ�ȼۡ��ȼ۵���˼��˵���������ö���������ӵ����ͬ�Ľṹ������ÿ����Ӧλ���ϵĽڵ��ϵ�������ȡ�

	����
		1             1
	   / \           / \
	  2   2   and   2   2
	 /             /
	4             4
	�������õȼ۵Ķ�������

		1             1
	   / \           / \
	  2   3   and   2   3
	 /               \
	4                 4
	�Ͳ��ǵȼ۵ġ�
 */
public class Solution {
    /**
     * @param a, b, the root of binary trees.
     * @return true if they are identical, or false.
     */
    public boolean isIdentical(TreeNode a, TreeNode b) {
        if(a==null&&b==null)
            return true;
        if(a==null||b==null)
            return false;
        if(a.val!=b.val)
            return false;
        else{
            return isIdentical(a.left,b.left)&&isIdentical(a.right,b.right);
        }
    }
}