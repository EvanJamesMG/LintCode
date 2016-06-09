/**

 给出一组候选数字(C)和目标数字(T),找出C中所有的组合，使组合中数字的和为T。C中每个数字在每个组合中只能使用一次。

 注意事项

	所有的数字(包括目标数字)均为正整数。
	元素组合(a1, a2, … , ak)必须是非降序(ie, a1 ≤ a2 ≤ … ≤ ak)。
	解集不能包含重复的组合。 
	样例
	给出一个例子，候选数字集合为[10,1,6,7,2,1,5] 和目标数字 8  ,

	解集为：[[1,7],[1,2,5],[2,6],[1,1,6]]
*/

public class Solution {
    /**
     * @param num: Given the candidate numbers
     * @param target: Given the target number
     * @return: All the combinations that sum to target
     */
    public List<List<Integer>> combinationSum2(int[] num, int target) {
        // write your code here
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> subres = new ArrayList<>();
        if(num==null||num.length==0)
            return res;
        Arrays.sort(num);
        dfs(0, num, target, res, subres);
        return res;
    }

    private static void dfs(int startindex, int[] num, int target, List<List<Integer>> res, List<Integer> subres) {
        if(target==0) {
            if(!res.contains(subres))
                res.add(subres);
            return;
        }
        if(startindex==num.length||target<0)
            return;
        for(int i=startindex;i<num.length;i++){
            List<Integer> newsubres = new ArrayList<>(subres);
            newsubres.add(num[i]);
            dfs(i+1,num,target-num[i],res,newsubres);
        }
    }
}