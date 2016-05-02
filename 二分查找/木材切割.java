/*
��һЩԭľ�����������Щľͷ�и��һЩ������ͬ��С��ľͷ����Ҫ�õ���С�ε���Ŀ����Ϊ k��
��Ȼ������ϣ���õ���С��Խ��Խ�ã�����Ҫ�����ܹ��õ���С��ľͷ����󳤶ȡ�

 ע������:
   ľͷ���ȵĵ�λ�����ס�ԭľ�ĳ��ȶ���������������Ҫ���и�õ���С��ľͷ�ĳ���ҲҪ�����������޷��г�Ҫ������ k �ε�,�򷵻� 0 ���ɡ�

����
��3��ľͷ[232, 124, 456], k=7, ��󳤶�Ϊ114.

*/

public class LintCode {
	
    /** 
     *@param L: Given n pieces of wood with length L[i]
     *@param k: An integer
     *return: The maximum length of the small pieces.
     */
	public static void main(String args[]) {
		int L[] = {2147483644,2147483645,2147483646,2147483647};
		int res = woodCut(L,4);
		System.out.println(res);
	}
    public static int woodCut(int[] L, int k) {
    	long msum = 0;
    	int mmax = 0;
    	for(int sub:L){
    		msum += sub;
    		mmax = Math.max(mmax, sub);
    	}
    	if(msum<k)
    		return 0;
    	long left = 0;
    	long right = mmax;
    	while(left<=right){
    		long mid = (left+right)/2;
    		if(judge(L,k,mid))
    			left =mid+1;
    		else
    			right = mid-1;
    		
    	}
    	
		return (int) (right);
        // write your code here
    }

	private static boolean judge(int[] L, int k, long mid) {
		// TODO Auto-generated method stub
		int tem = 0;
		for(int sub:L){
			tem +=sub/mid;
		}
		if(tem>=k)
			return true;
		else {
			return false;
		}
	}

}
