/*
假设一个旋转排序的数组其起始位置是未知的（比如0 1 2 4 5 6 7 可能变成是4 5 6 7 0 1 2）。

你需要找到其中最小的元素。

数组中可能存在重复的元素。

样例
给出[4,4,5,6,7,0,1,2]  返回 0
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