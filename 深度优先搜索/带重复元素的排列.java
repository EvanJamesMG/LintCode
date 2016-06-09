/**
	����һ�������ظ����ֵ��б��ҳ��б����в�ͬ�����С�

	������ʵ���������Ƿ�����������⣿ Yes
	����
	�����б� [1,2,2]����ͬ�������У�

	[
	  [1,2,2],
	  [2,1,2],
	  [2,2,1]
	]
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
