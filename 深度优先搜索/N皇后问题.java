/**

	n皇后问题是将n个皇后放置在n*n的棋盘上，皇后彼此之间不能相互攻击。

	给定一个整数n，返回所有不同的n皇后问题的解决方案。

	每个解决方案包含一个明确的n皇后放置布局，其中“Q”和“.”分别表示一个女王和一个空位置。

	样例
	对于4皇后问题存在两种解决的方案：

	[
		[".Q..", // Solution 1

		 "...Q",

		 "Q...",

		 "..Q."],

		["..Q.", // Solution 2

		 "Q...",

		 "...Q",

		 ".Q.."]
	]
*/


class Solution {
    /**
     * Get all distinct N-Queen solutions
     * @param n: The number of queens
     * @return: All distinct solutions
     * For example, A string '...Q' shows a queen on forth position
     */
     
     /* 
        两个皇后都不能处于同一行、同一列或同一斜线上 []
        这类型问题统称为递归回溯问题，也可以叫做对决策树的深度优先搜索（dfs）。
		N皇后问题有个技巧的关键在于棋盘的表示方法，这里使用一个数组就可以表达了。
		比如board=[1, 3, 0, 2]，这是4皇后问题的一个解，意思是：在第0行，皇后放在第1列；在第1行，皇后放在第3列；在第2行，皇后放在第0列；
		在第3行，皇后放在第2列。这道题提供一个递归解法，下道题使用非递归。check函数用来检查在第k行，皇后是否可以放置在第j列。
     */
    static ArrayList<ArrayList<String>> solveNQueens(int n) {
        // write your code here

        ArrayList<ArrayList<String>> res = new ArrayList<>();
        if(n<=0)
            return res;

        int[] board = new int[n];
        for(int i=0;i<n;i++)
            board[i] = -1;
        ArrayList<String> subres = new ArrayList<>();
        dfs(0,board,subres,res,n);
        return res;

    }

    private static void dfs(int depth, int[] board, ArrayList<String> subres, ArrayList<ArrayList<String>> res, int n) {
        if(depth==n) {
            res.add(subres);
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
                dfs(depth+1,board,newsubres,res,n);
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