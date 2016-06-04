/**

根据n皇后问题，现在返回n皇后不同的解决方案的数量而不是具体的放置布局。

样例
比如n=4，存在2种解决方案
*/


class Solution {
    /**
     * Calculate the total number of distinct N-Queen solutions.
     * @param n: The number of queens.
     * @return: The total number of distinct solutions.
     */
     
    static int res;
    public int totalNQueens(int n) {
        // write your code here
        if(n<=0)
            return res;

        int[] board = new int[n];
        for(int i=0;i<n;i++)
            board[i] = -1;
        ArrayList<String> subres = new ArrayList<>();
        dfs(0,board,subres,n);
        return res;

    }

    static void dfs(int depth, int[] board, ArrayList<String> subres, int n) {
        if(depth==n) {
            res++;
            return;
        }
        for(int i=0;i<n;i++){
            if(isValid(depth,i,board)){
                board[depth] = i;
                String tem = "";
                for(int k=0;k<n;k++){
                    if(k==i)
                        tem+="Q";
                    else
                        tem+=".";
                }
                ArrayList<String> newsubres = new ArrayList<>(subres);
                newsubres.add(tem);
                dfs(depth+1,board,newsubres,n);
            }
        }

    }

    private static boolean isValid(int depth, int i, int[] board) {
        for(int k=0;k<depth;k++){
            if(board[k]==i||Math.abs(i-board[k])==Math.abs(depth-k))
                return false;
        }

        return true;
    }
};

