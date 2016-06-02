/**
	给定一个含不同整数的集合，返回其所有的子集

	 注意事项

	子集中的元素排列必须是非降序的，解集必须不包含重复的子集

	样例
	如果 S = [1,2,3]，有如下的解：

	[
	  [3],
	  [1],
	  [2],
	  [1,2,3],
	  [1,3],
	  [2,3],
	  [1,2],
	  []
	]
/

/**
用深搜 DFS
*/

class Solution {
    /**
     * @param S: A set of numbers.
     * @return: A list of lists. All valid subsets.
     */
    static ArrayList<ArrayList<Integer>> res = new ArrayList<>();
    public  ArrayList<ArrayList<Integer>> subsets(int[] nums) {
        // write your code here
        Arrays.sort(nums);
        dfs(0, 0, new ArrayList<Integer>(), nums);
        return res;
    }

    private static void dfs(int depth, int startindex, ArrayList<Integer> tem, int[] nums) {

        if(!res.contains(tem))
            res.add(tem);
        if(depth==nums.length)
            return;
        for(int i=startindex;i<nums.length;i++){
            ArrayList<Integer> newtem = new ArrayList<>(tem);
            newtem.add(nums[i]);
            dfs(depth + 1, i + 1, newtem, nums);
        }

    }
}