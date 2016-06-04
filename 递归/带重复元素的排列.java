/**
	给出一个具有重复数字的列表，找出列表所有不同的排列。

	样例
	给出列表 [1,2,2]，不同的排列有：

	[
	  [1,2,2],
	  [2,1,2],
	  [2,2,1]
	]

	
	注意题目中给给出的列表有存在重复的元素，处理的方法是重复的元素值要略过
*/

class Solution {
    /**
     * @param nums: A list of integers.
     * @return: A list of unique permutations.
     */
    public  ArrayList<ArrayList<Integer>> permuteUnique(ArrayList<Integer> nums) {
        // write your code here
        Collections.sort(nums);

        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        if(nums.size()==0)
            return res;
        if(nums.size()==1){
            res.add(new ArrayList<Integer>(nums));
            return res;
        }
        int prenum = Integer.MAX_VALUE;
        for(int i=0;i<nums.size();i++){
            if(nums.get(i)==prenum)
                continue;
            prenum = nums.get(i);

            ArrayList<Integer> subnum = new ArrayList<>(nums);
            subnum.remove(i);
            ArrayList<ArrayList<Integer>> subres = permuteUnique(subnum);

            for(ArrayList sub:subres){
                ArrayList<Integer> tem = new ArrayList<>();
                tem.add(nums.get(i));
                tem.addAll(sub);
                res.add(tem);
            }
        }

        return res;
    }
}
