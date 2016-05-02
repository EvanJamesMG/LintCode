/*
有一些原木，现在想把这些木头切割成一些长度相同的小段木头，需要得到的小段的数目至少为 k。
当然，我们希望得到的小段越长越好，你需要计算能够得到的小段木头的最大长度。

 注意事项:
   木头长度的单位是厘米。原木的长度都是正整数，我们要求切割得到的小段木头的长度也要求是整数。无法切出要求至少 k 段的,则返回 0 即可。

样例
有3根木头[232, 124, 456], k=7, 最大长度为114.

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
