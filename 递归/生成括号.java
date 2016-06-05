/**
给定 n 对括号，请写一个函数以将其生成新的括号组合，并返回所有组合结果。

样例
给定 n = 3, 可生成的组合如下:

"((()))", "(()())", "(())()", "()(())", "()()()"
*/

public class Solution {
    /**
     * @param n n pairs
     * @return All combinations of well-formed parentheses
     */
    public  ArrayList<String> generateParenthesis(int n) {
        // Write your code here
        ArrayList<String> res= new ArrayList<>();
        if(n<=0)
            return res;
        dfs(n,n,"",res);
        return  res;

    }

    private static void dfs(int left, int right, String subres, ArrayList<String> res) {

        if(left==0&&right==0)
            res.add(subres);
        if(left>0)
            dfs(left - 1, right, subres + "(", res);
        if(right>0&&left<right)
            dfs(left,right-1,subres+")",res);

    }
}