/**
����n����ͬ��������������k��1<= k <= n���Լ�һ��Ŀ�����֡���������

����n���������ҳ�K������ʹ����K�����ĺ͵���Ŀ�����֣�����Ҫ�ҳ���������Ҫ��ķ�����

������ʵ���������Ƿ�����������⣿ Yes
����
����[1,2,3,4]��k=2�� target=5������ [[1,4],[2,3]]
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