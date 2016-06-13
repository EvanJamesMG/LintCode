/**
给出一个二维的字母板和一个单词，寻找字母板网格中是否存在这个单词。

单词可以由按顺序的相邻单元的字母组成，其中相邻单元指的是水平或者垂直方向相邻。每个单元中的字母最多只能使用一次。

样例
给出board =

[
  "ABCE",

  "SFCS",

  "ADEE"
]

word = "ABCCED"， ->返回 true,

word = "SEE"，-> 返回 true,

word = "ABCB"， -> 返回 false.
*/

public class Solution {
    /**
     * @param board: A list of lists of character
     * @param word: A string
     * @return: A boolean
     */
    public boolean exist(char[][] board, String word) {
        // write your code here
        boolean label[][] = new boolean[board.length][board[0].length];
        int row  = board.length;
        int col = board[0].length;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(board[i][j]==word.charAt(0)&&!label[i][j]){
                    label[i][j]=true;
                    String newword = word.substring(1);
                    boolean res= bfs(board,newword,label,i,j);
                    if(res)
                        return res;
                }
                label[i][j] = false;
            }
        }
        return false;
    }

    private static boolean bfs(char[][] board, String word, boolean[][] label, int rowindex, int colindex) {
        if(word.length()==0)
            return true;
        //上
        if(rowindex-1>=0&&!label[rowindex-1][colindex]&&board[rowindex-1][colindex]==word.charAt(0)) {
            label[rowindex-1][colindex]=true;
            String newword = word.substring(1);
            boolean res=  bfs(board,newword,label,rowindex-1,colindex);
            if(res)
                return res;
            label[rowindex-1][colindex]=false;
        }

        //下
        if(rowindex+1<board.length&&!label[rowindex+1][colindex]&&board[rowindex+1][colindex]==word.charAt(0)) {
            label[rowindex+1][colindex]=true;
            String newword = word.substring(1);
            boolean res= bfs(board,newword,label,rowindex+1,colindex);
            if(res)
                return res;
            label[rowindex+1][colindex]=false;
        }

        //左
        if(colindex-1>=0&&!label[rowindex][colindex-1]&&board[rowindex][colindex-1]==word.charAt(0)) {
            label[rowindex][colindex-1]=true;
            String newword = word.substring(1);
            boolean res=  bfs(board,newword,label,rowindex,colindex-1);
            if(res)
                return res;
            label[rowindex][colindex-1]=false;
        }

        //右
        if(colindex+1<board[0].length&&!label[rowindex][colindex+1]&&board[rowindex][colindex+1]==word.charAt(0)) {
            label[rowindex][colindex+1]=true;
            String newword = word.substring(1);
            boolean res = bfs(board,newword,label,rowindex,colindex+1);
            if(res)
                return res;
            label[rowindex][colindex+1]=false;
        }

        return false;
    }
}
