/**
����һ����ά����ĸ���һ�����ʣ�Ѱ����ĸ���������Ƿ����������ʡ�

���ʿ����ɰ�˳������ڵ�Ԫ����ĸ��ɣ��������ڵ�Ԫָ����ˮƽ���ߴ�ֱ�������ڡ�ÿ����Ԫ�е���ĸ���ֻ��ʹ��һ�Ρ�

����
����board =

[
  "ABCE",

  "SFCS",

  "ADEE"
]

word = "ABCCED"�� ->���� true,

word = "SEE"��-> ���� true,

word = "ABCB"�� -> ���� false.
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
        //��
        if(rowindex-1>=0&&!label[rowindex-1][colindex]&&board[rowindex-1][colindex]==word.charAt(0)) {
            label[rowindex-1][colindex]=true;
            String newword = word.substring(1);
            boolean res=  bfs(board,newword,label,rowindex-1,colindex);
            if(res)
                return res;
            label[rowindex-1][colindex]=false;
        }

        //��
        if(rowindex+1<board.length&&!label[rowindex+1][colindex]&&board[rowindex+1][colindex]==word.charAt(0)) {
            label[rowindex+1][colindex]=true;
            String newword = word.substring(1);
            boolean res= bfs(board,newword,label,rowindex+1,colindex);
            if(res)
                return res;
            label[rowindex+1][colindex]=false;
        }

        //��
        if(colindex-1>=0&&!label[rowindex][colindex-1]&&board[rowindex][colindex-1]==word.charAt(0)) {
            label[rowindex][colindex-1]=true;
            String newword = word.substring(1);
            boolean res=  bfs(board,newword,label,rowindex,colindex-1);
            if(res)
                return res;
            label[rowindex][colindex-1]=false;
        }

        //��
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
