/**
给定一个可能具有重复数字的列表，返回其所有可能的子集

 注意事项

子集中的每个元素都是非降序的
两个子集间的顺序是无关紧要的
解集中不能包含重复子集

样例
如果 S = [1,2,2]，一个可能的答案为：

[
  [2],
  [1],
  [1,2,2],
  [2,2],
  [1,2],
  []
]
*/

/**
  用深搜 DFS, 注意重复元素的处理，重复的元素直接跳过
*/
class Solution {
    /**
     * @param S: A set of numbers.
     * @return: A list of lists. All valid subsets.
     */
    static ArrayList<ArrayList<Integer>> res = new ArrayList<>();
    public static ArrayList<ArrayList<Integer>> subsetsWithDup(ArrayList<Integer> S) {
        // write your code here
        Collections.sort(S);
        dfs(0, 0, new ArrayList<Integer>(), S);
        return res;

    }

    private static void dfs(int depth, int startindex, ArrayList<Integer> temres, ArrayList<Integer> S) {

        if(!res.contains(temres))
            res.add(temres);
        if(depth==S.size()) {
            return;
        }
        int prenum = Integer.MAX_VALUE;
        for(int i=startindex;i< S.size();i++){
            if(prenum==S.get(i))
                continue;
            prenum = S.get(i);
            ArrayList<Integer> newtemres = new ArrayList<>(temres);
            newtemres.add(S.get(i));
            dfs(depth + 1, i + 1, newtemres, S);
        }

    }
}
