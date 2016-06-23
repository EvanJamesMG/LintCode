/**
	假设有一个排序的按未知的旋转轴旋转的数组(比如，0 1 2 4 5 6 7 可能成为4 5 6 7 0 1 2)。给定一个目标值进行搜索，如果在数组中找到目标值返回数组中的索引位置，否则返回-1。

	你可以假设数组中不存在重复的元素。

	样例
	给出[4, 5, 1, 2, 3]和target=1，返回 2

	给出[4, 5, 1, 2, 3]和target=0，返回 -1
*/
public class Solution {
    /** 
     *@param A : an integer rotated sorted array
     *@param target :  an integer to be searched
     *return : an integer
     */
    public int search(int[] A, int target) {
        // write your code here
    	int left = 0;
    	int right = A.length-1;
    	int mid = 0;
    	while(left<=right){
    		mid = (left+right)/2;
    		if(A[mid]==target)
    			return mid;
    		if(A[left]<A[mid]){
    			if(target<A[mid]&&target>=A[left])
    				right = mid-1;
    			else{
    				left = mid+1;
    			}
    		}else{
    			if(target>A[mid]&&target<=A[right])
    				left=mid+1;
    			else{
    				right=mid-1;
    			}
    		}
    	}
    	
    	return -1;
    }
}
