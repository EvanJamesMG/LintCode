/**
合并两个排序的整数数组A和B变成一个新的数组。

样例
给出A=[1,2,3,4]，B=[2,4,5,6]，返回 [1,2,2,3,4,4,5,6]
*/
class Solution {
    /**
     * @param A and B: sorted integer array A and B.
     * @return: A new sorted integer array
     */
    public int[] mergeSortedArray(int[] A, int[] B) {
       if(A==null||A.length==0)
            return B;
        if(B==null||B.length==0)
            return A;
        ArrayList<Integer> list = new ArrayList<>();
        int numA = 0;
        int numB = 0;
        while(numA<A.length&&numB<B.length){
            if(A[numA]<B[numB]) {
                list.add(A[numA]);
                numA++;
            }else{
                list.add(B[numB]);
                numB++;
            }
        }
        if(numA<A.length){
            for(int i=numA;i<A.length;i++)
                list.add(A[i]);
        }
        if(numB<B.length){
            for(int i=numB;i<B.length;i++)
                list.add(B[i]);
        }

        int[] res = new int[list.size()];
        for(int i=0;i<list.size();i++)
            res[i] = list.get(i);
        return res;
    }
}