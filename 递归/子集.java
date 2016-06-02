/**
	����һ������ͬ�����ļ��ϣ����������е��Ӽ�

	 ע������

	�Ӽ��е�Ԫ�����б����Ƿǽ���ģ��⼯���벻�����ظ����Ӽ�

	����
	��� S = [1,2,3]�������µĽ⣺

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
������ DFS
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