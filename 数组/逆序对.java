/**
在数组中的两个数字如果前面一个数字大于后面的数字，则这两个数字组成一个逆序对。给你一个数组，求出这个数组中逆序对的总数。
概括：如果a[i] > a[j] 且 i < j， a[i] 和 a[j] 构成一个逆序对。

样例
序列 [2, 4, 1, 3, 5] 中，有 3 个逆序对 (2, 1), (4, 1), (4, 3)，则返回 3 。
*/
public class Solution {
    /**
     * @param A an array
     * @return total of reverse pairs
     */
    public long reversePairs(int[] A) {
        if(A==null||A.length==0)
            return 0;
        long res = 0;
        //ArrayList<int[]> list = new ArrayList<>();
        for(int i=0;i<A.length-1;i++){
            for(int j=i+1;j<A.length;j++){
                if(A[i]>A[j]){
                    res++;
                    // int[] tem = new int[2];
                    // tem[0] = A[i];
                    // tem[1] = A[j];
                    // list.add(tem);
                }
            }
        }
        return res;    
        
    }
}