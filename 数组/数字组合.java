/**
给出一组候选数字(C)和目标数字(T),找到C中所有的组合，使找出的数字和为T。C中的数字可以无限制重复被选取。

例如,给出候选数组[2,3,6,7]和目标数字7，所求的解为：

[7]，

[2,2,3]

 注意事项

所有的数字(包括目标数字)均为正整数。
元素组合(a1, a2, … , ak)必须是非降序(ie, a1 ≤ a2 ≤ … ≤ ak)。
解集不能包含重复的组合。 

样例
给出候选数组[2,3,6,7]和目标数字7

返回 [[7],[2,2,3]]
*/

public class Solution {
    /**
     * @param candidates: A list of integers
     * @param target:An integer
     * @return: A list of lists of integers
     */
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> subres = new ArrayList<>();
        if(candidates==null||candidates.length==0)
            return res;
        Arrays.sort(candidates);
        dfs(0, candidates, target, res, subres);
        return res;
    }

    private static void dfs(int startindex, int[] num, int target, List<List<Integer>> res, List<Integer> subres) {
        if(target==0) {
            if(!res.contains(subres))
                res.add(subres);
            return;
        }
        if(target<0)
            return;
        for(int i=startindex;i<num.length;i++){
            List<Integer> newsubres = new ArrayList<>(subres);
            newsubres.add(num[i]);
            dfs(i, num, target - num[i], res, newsubres);
        }
    }
}