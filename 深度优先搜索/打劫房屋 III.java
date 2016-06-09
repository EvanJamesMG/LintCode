/**
	���ϴδ����һ���ֵ�֮���һȦ����֮�������ַ�����һ���µĿ��Դ�ٵĵط�����������еķ�����ɵ�����Ƚ���֣������������������֮�󣬷�����εĵ�����һ�Ŷ���������ǰ����͵�����Ƶ���ÿ�����Ӷ�������ض�����Ǯ�������ٵ�ΨһԼ�������ǣ����ڵķ���װ���໥��ϵ�ķ���ϵͳ���ҵ����ڵ���������ͬһ�챻���ʱ����ϵͳ���Զ�������

	��һ�㣬�������ȥ��٣��������Եõ�����Ǯ����Ȼ�ڲ���������װ�õ�����¡�

	 ע������

	������House Robber��House Robber II����չ��ֻ������ε�����ֱ�ߺ�Ȧ����˶�����

		����
		  3
		 / \
		2   3
		 \   \ 
		  3   1
		���������͵�ԵĽ�Ǯ���� 3 + 3 + 1 = 7.

			3
		   / \
		  4   5
		 / \   \ 
		1   3   1
		���������͵�ԵĽ�Ǯ���� 4 + 5 = 9.
 */

/**���������������ÿ�α�����������ֵ���ֱ��ʾ͵�Ի��߲�͵�Ե�ǰ�ڵ���Ի�õ�������档*/
public class Solution {
    /**
     * @param root: The root of binary tree.
     * @return: The maximum amount of money you can rob tonight
     */
    public int houseRobber3(TreeNode root) {
        // write your code here
        int[] res = postTraver(root);
        return Math.max(res[0],res[1]);
    }

    private static int[] postTraver(TreeNode root) {
        if(root==null)
            return new int[]{0,0};
        int[] res = new int[2];

        int[] leftvalue = postTraver(root.left);

        int[] rightvalue = postTraver(root.right);

        //ȡ���ڵ�ֵ������ȡ���ڵ����ҽڵ�ֵ
        res[0] = leftvalue[1] + rightvalue[1] +root.val;
        //ȡ���ڵ����ҽڵ��ֵ,����ȡ���ڵ��ֵ
        res[1] = Math.max(leftvalue[0],leftvalue[1]) + Math.max(rightvalue[0],rightvalue[1]);
        return res;
    }
}