/**
给定n个不同的正整数，整数k（1<= k <= n）以及一个目标数字。　　　　

在这n个数里面找出K个数，使得这K个数的和等于目标数字，你需要找出所有满足要求的方案。

您在真实的面试中是否遇到过这个题？ Yes
样例
给出[1,2,3,4]，k=2， target=5，返回 [[1,4],[2,3]]
*/

public class Solution {
    /**
     * @param A: an integer array.
     * @param k: a positive integer (k <= length(A))
     * @param target: a integer
     * @return a list of lists of integer 
     */ 
    public  ArrayList<ArrayList<Integer>> kSumII(int[] A, int k, int target) {
        // write your code here
        ArrayList<ArrayList<Integer>> res =new ArrayList<>();
        ArrayList<Integer> subres = new ArrayList<>();
        dfs(0,0,res,subres,A,k,target);
        return res;
    }

    private static void dfs(int depth,int startindex, ArrayList<ArrayList<Integer>> res, ArrayList<Integer> subres, int[] A, int k, int target) {

        if(subres.size()==k&&target==0) {
            res.add(subres);
            return;
        }else if (subres.size()==k&&target!=0){
            return;
        }
        if(depth==A.length)
            return;


        for(int i=startindex;i<A.length;i++){
            ArrayList<Integer> newsubres = new ArrayList<>(subres);
            newsubres.add(A[i]);
            dfs(depth+1,i+1,res, newsubres,A,k,target-A[i]);
        }

    }
}