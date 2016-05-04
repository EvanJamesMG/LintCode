/*
你给出一个整数数组(size为n)，其具有以下特点：

相邻位置的数字是不同的
A[0] < A[1] 并且 A[n - 2] > A[n - 1]
假定P是峰值的位置则满足A[P] > A[P-1]且A[P] > A[P+1]，返回数组中任意一个峰值的位置。

 注意事项

数组可能包含多个峰值，只需找到其中的任何一个即可

样例
给出数组[1, 2, 1, 3, 4, 5, 7, 6]返回1, 即数值 2 所在位置, 或者6, 即数值 7 所在位置.
*/

class Solution {
    /**
     * @param A: An integers array.
     * @return: return any of peek positions.
     */
    public int findPeak(int[] A) {
    	int left = 0;
    	int right = A.length-1;
    	int mid = 0;
    	while(left<=right){
    		mid = (left+right)/2;
    		if(mid>=1 && A[mid]>A[mid-1] && A[mid]>A[mid+1])
    			return mid;
    		if(A[mid]<=A[mid+1])
    			left = mid+1;
    		else{
    			right = mid-1;
    		}
    		
    	}
    	return -1;
    }
}
