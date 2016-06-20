/**
给定 n 和 k，求123..n组成的排列中的第 k 个排列。

 注意事项

1 ≤ n ≤ 9

样例
对于 n = 3, 所有的排列如下：

123
132
213
231
312
321
如果 k = 4, 第4个排列为，231.
*/

class Solution {
    /**
      * @param n: n
      * @param k: the kth permutation
      * @return: return the k-th permutation
      */
    public String getPermutation(int n, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=1;i<=n;i++)
            list.add(i);
        ArrayList<ArrayList<Integer>> list2 = permuteUnique(list);
        ArrayList<Integer> tem = list2.get(k-1);
        String res = "";
        for(int sub:tem)
            res+=sub;
        return res;
    }

    public static ArrayList<ArrayList<Integer>> permuteUnique(ArrayList<Integer> nums) {
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
