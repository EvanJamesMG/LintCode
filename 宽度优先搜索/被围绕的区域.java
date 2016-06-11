/**
	��һ����ά�ľ��󣬰��� 'X' �� 'O', �ҵ����б� 'X' Χ�Ƶ����򣬲��� 'X' �������

	����
	������ά����

	X X X X
	X O O X
	X X O X
	X O X X
	�ѱ� 'X' Χ�Ƶ��������֮���Ϊ��

	X X X X
	X X X X
	X X X X
	X O X X
*/
public class Solution {
    /**
     * @param board a 2D board containing 'X' and 'O'
     * @return void
     */
    public void surroundedRegions(char[][] board) {
        if(board==null||board.length==0)
            return;
        int row  = board.length;
        int col = board[0].length;
        Queue<int[]> queue = new LinkedList<>();
        int[] edge = new int[2];
        boolean[][] visited = new boolean[row][col];


        for(int i=0;i<row;i++){
            if(board[i][0]=='O')
                queue.add(new int[]{i,0});
            if(board[i][col-1]=='O')
                queue.add(new int[]{i,col-1});
        }
        for(int j=0;j<col;j++){
            if(board[0][j]=='O')
                queue.add(new int[]{0,j});
            if(board[row-1][j]=='O')
                queue.add(new int[]{row-1,j});
        }
        while(!queue.isEmpty()){
            edge = queue.poll();
            if(board[edge[0]][edge[1]]=='O') {
                board[edge[0]][edge[1]]='#';
                visited[edge[0]][edge[1]] = true;
            }
            int edge_m = edge[0];
            int edge_n = edge[1];
            //��
            if(edge_m-1>=0&&board[edge_m-1][edge_n]=='O'&&!visited[edge_m-1][edge_n])
                queue.add(new int[]{edge_m-1,edge_n});
            //��
            if(edge_m+1<row&&board[edge_m+1][edge_n]=='O'&&!visited[edge_m+1][edge_n])
                queue.add(new int[]{edge_m+1,edge_n});
            //��
            if(edge_n-1>=0&&board[edge_m][edge_n-1]=='O'&&!visited[edge_m][edge_n-1])
                queue.add(new int[]{edge_m,edge_n-1});
            //��
            if(edge_n+1<col&&board[edge_m][edge_n+1]=='O'&&!visited[edge_m][edge_n+1])
                queue.add(new int[]{edge_m,edge_n+1});
        }

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(board[i][j]=='O')
                    board[i][j]='X';
                if(board[i][j]=='#')
                    board[i][j]='O';
            }
        }
    }
}