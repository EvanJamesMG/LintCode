/**
	����һ������ n ���������������飬�ҳ�����Ŀ��ֵ target ����ʼ�ͽ���λ�á�

	���Ŀ��ֵ���������У��򷵻�[-1, -1]

	����
	����[5, 7, 7, 8, 8, 10]��Ŀ��ֵtarget=8,

	����[3, 4]
	
*/
public class Solution {
    /** 
     *@param A : an integer sorted array
     *@param target :  an integer to be inserted
     *return : a list of length 2, [index1, index2]
     */
    public int[] searchRange(int[] A, int target) {
    	int left = 0;
    	int right = A.length-1;
    	int mid = 0;
    	int res[] = {-1,-1};
    	if(A==null || A.length==0)
    		return res;
    	if(A.length==1 && A[0]==target){
    		res[0]=0;
    		res[1]=0;
    		return res;
    	}
    	
    	while(left<=right){
    		
    		mid = (left+right)/2;
    		if(A[mid]==target)
    			break;
    		if(A[mid]>target)
    			right = mid-1;
    		else if (A[mid]<target) {
    			left = mid+1;
			}
    	}
		
		if(A[mid]==target){
			for(int i=mid;i>=0;i--){
				if(i==0&&A[i]==target)
					res[0]=0;
				if(A[i]!=target){
					res[0] = i+1;
					break;
				}
			}
			for(int i =mid;i<=A.length-1;i++){
				if(i==A.length-1&&A[i]==target)
					res[1]=i;
				if(A[i]!=target){
					res[1] = i-1;
					break;
				}
			}
			
		}
    	return res;
        
    }
}
