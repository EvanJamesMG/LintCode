/**
	�������������n��k�����ش�1......n��ѡ����k��������ϡ�

	����
	���� n = 4 �� k = 2

	���صĽ�Ϊ��

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