/**

	n�ʺ������ǽ�n���ʺ������n*n�������ϣ��ʺ�˴�֮�䲻���໥������

	����һ������n���������в�ͬ��n�ʺ�����Ľ��������

	ÿ�������������һ����ȷ��n�ʺ���ò��֣����С�Q���͡�.���ֱ��ʾһ��Ů����һ����λ�á�

	����
	����4�ʺ�����������ֽ���ķ�����

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
        �����ʺ󶼲��ܴ���ͬһ�С�ͬһ�л�ͬһб���� []
        ����������ͳ��Ϊ�ݹ�������⣬Ҳ���Խ����Ծ��������������������dfs����
		N�ʺ������и����ɵĹؼ��������̵ı�ʾ����������ʹ��һ������Ϳ��Ա���ˡ�
		����board=[1, 3, 0, 2]������4�ʺ������һ���⣬��˼�ǣ��ڵ�0�У��ʺ���ڵ�1�У��ڵ�1�У��ʺ���ڵ�3�У��ڵ�2�У��ʺ���ڵ�0�У�
		�ڵ�3�У��ʺ���ڵ�2�С�������ṩһ���ݹ�ⷨ���µ���ʹ�÷ǵݹ顣check������������ڵ�k�У��ʺ��Ƿ���Է����ڵ�j�С�
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