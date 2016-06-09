/**
	给出n，生成所有由1...n为节点组成的不同的二叉查找树

	您在真实的面试中是否遇到过这个题？ Yes
	样例
	给出n = 3，生成所有5种不同形态的二叉查找树：

	1         3     3       2    1
	 \       /     /       / \    \
	  3     2     1       1   3    2
	 /     /       \                \
	2     1         2                3
 */
public class Solution {
    /**
     * @paramn n: An integer
     * @return: A list of root
     */
    public List<TreeNode> generateTrees(int n) {
    	return helper(1,n);
    }

	private static List<TreeNode> helper(int start, int end) {
		// TODO Auto-generated method stub
    	List<TreeNode> res = new ArrayList<>();

		if(start>end){
			res.add(null);
			return res;
		}
		
		for(int n=start;n<=end;n++){
			List<TreeNode> left = helper(start, n-1);
			List<TreeNode> right = helper(n+1, end);
			for(TreeNode subleft:left){
				for(TreeNode subright:right){
					TreeNode root = new TreeNode(n);
					root.left = subleft;
					root.right = subright;
					res.add(root);
				}
			}
		}
		return res;
	}
}