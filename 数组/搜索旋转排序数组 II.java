/**

	������������ת�������顱���������ظ�Ԫ���ֽ���Σ�

	�Ƿ��Ӱ������ʱ�临�Ӷȣ�

	���Ӱ�죿

	Ϊ�λ�Ӱ�죿

	д��һ�������жϸ�����Ŀ��ֵ�Ƿ�����������С�
	����
	����[3,4,4,5,7,0,1,2]��target=4������ true	
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
