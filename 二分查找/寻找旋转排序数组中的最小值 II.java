/*
����һ����ת�������������ʼλ����δ֪�ģ�����0 1 2 4 5 6 7 ���ܱ����4 5 6 7 0 1 2����

����Ҫ�ҵ�������С��Ԫ�ء�

�����п��ܴ����ظ���Ԫ�ء�

����
����[4,4,5,6,7,0,1,2]  ���� 0
*/

public class Solution {
    /**
     * @param num: a rotated sorted array
     * @return: the minimum number in the array
     */
    public int findMin(int[] num) {
        if( num == null || num.length == 0)
            return 0;
        if(num.length == 1)
            return num[0];
        int low = 0;
        int high = num.length -1;
        int mid = low;
        while(low < high){
            mid = (low + high)/2;
            if(num[mid] >  num[high]){
                low = mid + 1;
            }else if( num[mid] < num[high]){
                high = mid ;
            }else{
                high--;
            }
        }
        return num[low];
        
    }
}