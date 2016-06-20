/**
����һ����n����һ������1-n^2�������ξ���

����
n = 3
����Ϊ

[
  [ 1, 2, 3 ],
  [ 8, 9, 4 ],
  [ 7, 6, 5 ]
]
*/
public class Solution {
    /**
     * @param n an integer
     * @return a square matrix
     */
    public int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        int rowtop = 0;
        int rowbot = n-1;
        int colleft = 0;
        int colright = n-1;
        int label = 0;
        int k=0;
        while(k<Math.pow(n,2)){
            //��
            if(label==0){
                for(int i=colleft;i<=colright;i++){
                    k++;
                    res[rowtop][i] = k;
                }
                rowtop++;
            }
            //��
            if(label==1){
                for(int i=rowtop;i<=rowbot;i++){
                    k++;
                    res[i][colright]=k;
                }
                colright--;
            }
            //��
            if(label==2){
                for(int i=colright;i>=colleft;i--){
                    k++;
                    res[rowbot][i]=k;
                }
                rowbot--;
            }
            //��
            if(label==3){
                for(int i=rowbot;i>=rowtop;i--){
                    k++;
                    res[i][colleft]=k;
                }
                colleft++;
            }

            label =(label+1)%4;
        }
        return res;
    }
}