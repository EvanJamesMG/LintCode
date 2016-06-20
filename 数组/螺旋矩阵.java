/**
给定一个包含 m x n 个要素的矩阵，（m 行, n 列），按照螺旋顺序，返回该矩阵中的所有要素。

样例
给定如下矩阵：

[
 [ 1, 2, 3 ],
 [ 4, 5, 6 ],
 [ 7, 8, 9 ]
]
应返回 [1,2,3,6,9,8,7,4,5]。
*/
public class Solution {
    /**
     * @param matrix a matrix of m x n elements
     * @return an integer list
     */
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        if(matrix.length==0)
            return res;
        int rowtop = 0;
        int rowbot = matrix.length-1;
        int colleft = 0;
        int colright = matrix[0].length-1;
        int label = 0;
        while(rowtop<=rowbot&&colleft<=colright){
            //上
            if(label==0){
                for(int i=colleft;i<=colright;i++){
                    res.add(matrix[rowtop][i]);
                }
                rowtop++;
            }
            //右
            if(label==1){
                for(int i=rowtop;i<=rowbot;i++){
                    res.add(matrix[i][colright]);
                }
                colright--;
            }
            //下
            if(label==2){
                for(int i=colright;i>=colleft;i--){
                    res.add(matrix[rowbot][i]);
                }
                rowbot--;
            }
            //左
            if(label==3){
                for(int i=rowbot;i>=rowtop;i--){
                    res.add(matrix[i][colleft]);
                }
                colleft++;
            }

            label =(label+1)%4;
        }
        return res;
    }
}