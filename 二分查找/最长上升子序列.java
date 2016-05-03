import java.util.ArrayList;

public class LintCode {
	
	public static void main(String args[]) {
		int L[] = {1,1,1,1,1,1};
		int res = longestIncreasingSubsequence(L);
		System.out.println(res);
	}

	/**
	 * 维护一个单调序列
	 * 遍历nums数组，二分查找每一个数在单调序列中的位置，然后替换之。
	 * dp用以表示长度为i最长子序列的最后一个数最小可以是多少。易证：i<j时，dp[i]<dp[j]。
	 * 
	 * http://www.wutianqi.com/?p=1850
	 * http://bookshadow.com/weblog/2015/11/03/leetcode-longest-increasing-subsequence/
	 */
	
    /**
     * @param nums: The integer array
     * @return: The length of LIS (longest increasing subsequence)
     */
    public static int longestIncreasingSubsequence(int[] nums) {
    	ArrayList<Integer> dp = new ArrayList<>();
    	for(int sub:nums){
    		int left=0;
    		int right = dp.size()-1;
    		int mid = 0;
    		while(left<=right){
    			mid = (left+right)/2;
 
    			if(sub>=dp.get(mid)){
    				left = mid+1;
    			}else{
    				right = mid-1;
				}
    		}

    		if(left>=dp.size())
    			dp.add(sub);
    		else{
    			dp.set(left, sub);
    		}
    		
    	}
    	
		return dp.size();
    }
    
    
}
