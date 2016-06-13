/**
	组给出两个整数n和k，返回从1......n中选出的k个数的组合。

	样例
	例如 n = 4 且 k = 2

	返回的解为：

	[[2,4],[3,4],[2,3],[1,2],[1,3],[1,4]]
*/

public class Solution {
    /**
     * @param n: Given the range of numbers
     * @param k: Given the numbers of combinations
     * @return: All the combinations of k numbers out of 1..n
     */
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> subres = new ArrayList<>();
        if(n<=0||k>n)
            return res;
        helper(1,n,k,res,subres);
        return res;
    }

    private static void helper(int start, int n, int k, List<List<Integer>> res, List<Integer> subres) {

        if(k==subres.size()) {
            res.add(subres);
            return;
        }
        for(int i=start;i<=n;i++){
            subres.add(i);
            helper(i + 1, n, k, res, new ArrayList<Integer>(subres));
            subres.remove(subres.size()-1);
        }
    }
}