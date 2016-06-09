/**
	在上次打劫完一条街道之后和一圈房屋之后，窃贼又发现了一个新的可以打劫的地方，但这次所有的房子组成的区域比较奇怪，聪明的窃贼考察地形之后，发现这次的地形是一颗二叉树。与前两次偷窃相似的是每个房子都存放着特定金额的钱。你面临的唯一约束条件是：相邻的房子装着相互联系的防盗系统，且当相邻的两个房子同一天被打劫时，该系统会自动报警。

	算一算，如果今晚去打劫，你最多可以得到多少钱，当然在不触动报警装置的情况下。

	 注意事项

	这题是House Robber和House Robber II的扩展，只不过这次地形由直线和圈变成了二叉树

		样例
		  3
		 / \
		2   3
		 \   \ 
		  3   1
		窃贼最多能偷窃的金钱数是 3 + 3 + 1 = 7.

			3
		   / \
		  4   5
		 / \   \ 
		1   3   1
		窃贼最多能偷窃的金钱数是 4 + 5 = 9.
 */

/**后序遍历二叉树，每次遍历返回两个值：分别表示偷窃或者不偷窃当前节点可以获得的最大收益。*/
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

        //取根节点值，不能取相邻的左右节点值
        res[0] = leftvalue[1] + rightvalue[1] +root.val;
        //取相邻的左右节点的值,不能取根节点的值
        res[1] = Math.max(leftvalue[0],leftvalue[1]) + Math.max(rightvalue[0],rightvalue[1]);
        return res;
    }
}