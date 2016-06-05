/**
���� n �����ţ���дһ�������Խ��������µ�������ϣ�������������Ͻ����

����
���� n = 3, �����ɵ��������:

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