/**
�������е������������ǰ��һ�����ִ��ں�������֣����������������һ������ԡ�����һ�����飬����������������Ե�������
���������a[i] > a[j] �� i < j�� a[i] �� a[j] ����һ������ԡ�

����
���� [2, 4, 1, 3, 5] �У��� 3 ������� (2, 1), (4, 1), (4, 3)���򷵻� 3 ��
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