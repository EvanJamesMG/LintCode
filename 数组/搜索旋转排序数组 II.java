/**

	跟进“搜索旋转排序数组”，假如有重复元素又将如何？

	是否会影响运行时间复杂度？

	如何影响？

	为何会影响？

	写出一个函数判断给定的目标值是否出现在数组中。
	样例
	给出[3,4,4,5,7,0,1,2]和target=4，返回 true	
*/

public class Solution {
    /** 
     * param A : an integer ratated sorted array and duplicates are allowed
     * param target :  an integer to be search
     * return : a boolean 
     */
    public boolean search(int[] A, int target) {
    	if(A==null ||A.length==0)
    		return false;
    	int left = 0;
    	int right = A.length-1;
    	int mid = 0;
    	
    	while(left<=right){
    		mid = (left+right)/2;
    		
        	if(A[left]==A[right]&&A[right]==A[mid]){
        		for(int i=left;i<=right;i++){
        			if(A[i]==target)
        				return true;
        		}
        		return false;
        	}
    		
    		if(A[mid]==target)
    			return true;
    		if(A[left]<=A[mid]){
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
    	return false;
    }
}
