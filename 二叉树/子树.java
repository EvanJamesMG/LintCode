/*
	��������ͬ��С�Ķ��������� T1 ���ϰ���Ľڵ㣻 T2 �кü��ٵĽڵ㡣�����һ���㷨���ж� T2 �Ƿ�Ϊ T1��������

	 ע������

	�� T1 �д��ڴӽڵ� n ��ʼ�������� T2 ��ͬ�����ǳ� T2 �� T1 ��������Ҳ����˵������� T1 �ڵ� n ���������ϣ����ϵĲ��ֽ��� T2 ��ȫ��ͬ��

	����
	����������� T2 �� T1 ��������

		   1                3
		  / \              / 
	T1 = 2   3      T2 =  4
			/
		   4
	����������� T2 ���� T1 ��������

		   1               3
		  / \               \
	T1 = 2   3       T2 =    4
			/
		   4
*/

public class Solution {
    /**
     * @param T1, T2: The roots of binary tree.
     * @return: True if T2 is a subtree of T1, or false.
     */
    public static boolean isSubtree(TreeNode T1, TreeNode T2) {
        // write your code here
        if(T2==null)
            return true;
        if(T1==null)
            return false;
        return identical(T1,T2)||isSubtree(T1.left,T2)||isSubtree(T1.right,T2);
    }

    private static boolean identical(TreeNode t1, TreeNode t2) {
        if(t1==null&&t2==null)
            return true;
        if(t1==null||t2==null)
            return false;
        if(t1.val!=t2.val)
            return false;
        return identical(t1.left,t2.left)&&identical(t1.right,t2.right);
    }
}