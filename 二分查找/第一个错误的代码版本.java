/*
�����İ汾���Ǵ� 1 �� n ��������ĳһ�죬�����ύ�˴���汾�Ĵ��룬����������֮��汾�Ĵ����ڵ�Ԫ�����о�����

���ҳ���һ������İ汾�š�

�����ͨ�� isBadVersion �Ľӿ����жϰ汾�� version �Ƿ��ڵ�Ԫ�����г�������ӿ�����͵��÷�����������ע�Ͳ��֡�

 ע������

���Ķ��������룬���ڲ�ͬ�����Ի�ȡ��ȷ�ĵ��� isBadVersion �ķ���������java�ĵ��÷�ʽ��VersionControl.isBadVersion

����
���� n=5

����isBadVersion(3)���õ�false

����isBadVersion(5)���õ�true

����isBadVersion(4)���õ�true

��ʱ���ǿ��Զ϶�4�ǵ�һ������İ汾��
*/


/**
 * public class SVNRepo {
 *     public static boolean isBadVersion(int k);
 * }
 * you can use SVNRepo.isBadVersion(k) to judge whether 
 * the kth code version is bad or not.
*/
class Solution {
    /**
     * @param n: An integers.
     * @return: An integer which is the first bad version.
     */
    public int findFirstBadVersion(int n) {
    	int left = 1;
    	int right = n;
    	int mid = 0;
    	int res = -1;
    	while(left<=right){
    		mid = (left+right)/2;
    		if(SVNRepo.isBadVersion(mid)==false){
    			left = mid+1;
    		}else{
    			right = mid-1;
    		}
    	}
		return left;    
        
    }
}
