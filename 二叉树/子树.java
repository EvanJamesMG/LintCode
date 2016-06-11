/*
	有两个不同大小的二进制树： T1 有上百万的节点； T2 有好几百的节点。请设计一种算法，判定 T2 是否为 T1的子树。

	 注意事项

	若 T1 中存在从节点 n 开始的子树与 T2 相同，我们称 T2 是 T1 的子树。也就是说，如果在 T1 节点 n 处将树砍断，砍断的部分将与 T2 完全相同。

	样例
	下面的例子中 T2 是 T1 的子树：

		   1                3
		  / \              / 
	T1 = 2   3      T2 =  4
			/
		   4
	下面的例子中 T2 不是 T1 的子树：

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