/**
����һ��������������飬�ҳ�����û�г��ֵ���С��������

����
������� [1,2,0], return 3
������� [3,4,-1,1], return 2
*/

public class Solution {
    /**    
     * @param A: an array of integers
     * @return: an integer
     */
    public int firstMissingPositive(int[] A) {
        // write your code here   
        if(A==null||A.length==0)
            return 1;
        HashSet<Integer> set = new HashSet<>();
        for(int sub:A)
            set.add(sub);
        for(int i=1;i<=A.length;i++){
            if(!set.contains(i))
                return i;
        }
        return A.length+1;
    }
}