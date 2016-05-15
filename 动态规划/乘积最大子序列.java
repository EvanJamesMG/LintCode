	/*
	  找出一个序列中乘积最大的连续子序列（至少包含一个数）。
	  
	  样例
		比如, 序列 [2,3,-2,4] 中乘积最大的子序列为 [2,3] ，其乘积为6。
	*/
	
	/*
	 * 方法一：
	 * 动态规划，求解：productArray[i][j]的时候不用再次循环从i到j，而是利用：productArray[i][j]=productArray[i][j-1]*A[j];
	 * 采用递推的方法来计算，算法时间复杂度为O(n2)
	 * 时间和空间都不通过
	 */
    public static int maxProduct(int[] nums) {
    	int[][] dp = new int[nums.length][nums.length];
    	int maxpru = nums[0];
    	int len = nums.length;
    	for(int i=0;i<len;i++){
    		for(int j=i;j<len;j++){
    			if(i==j){
    				dp[i][j] = nums[j];
    			}else {
					dp[i][j] = dp[i][j-1] *nums[j];
				}
    			if(dp[i][j]>maxpru)
    				maxpru = dp[i][j];
    		}
    	}
    	
		return maxpru;
    }
	
	
	/* 方法二：
	 * dpmin[i]: 表示起始元素到第i个元素累乘的最小值
	 * dpmax[i]: 表示起始元素到第i个元素累乘的最大值
	 *
	 * 其实子数组乘积最大值的可能性为：累乘的最大值碰到了一个正数；
	 * 或者，累乘的最小值（负数），碰到了一个负数。所以每次要保存累乘的最大（正数）和最小值（负数）。
	 * 同时还有一个选择起点的逻辑，如果之前的最大和最小值同当前元素相乘之后，没有当前元素大（或小）那么当前元素就可作为新的起点。
	 * 例如，前一个元素为0的情况，{1,0,9,2}，到9的时候9应该作为一个最大值，也就是新的起点，{1,0,-9,-2}也是同样道理，-9比当前最小值还小，所以更新为当前最小值。
	 * 这种方法只需要遍历一次数组即可，算法时间复杂度为O(n)。
	 */
    public static int maxProduct(int[] nums) {
    	int[] dpmin = new int[nums.length+1];
    	int[] dpmax = new int[nums.length+1];
    	int maxres = nums[0];
    	dpmin[1] = nums[0];
    	dpmax[1] = nums[0];
    	for(int i=2;i<=nums.length;i++){
    		dpmax[i] = Math.max(nums[i-1],Math.max(dpmax[i-1]*nums[i-1], dpmin[i-1]*nums[i-1]));
    		dpmin[i] = Math.min(nums[i-1], Math.min(dpmax[i-1]*nums[i-1], dpmin[i-1]*nums[i-1]));
    		maxres = Math.max(maxres, dpmax[i]);
    	}
    	return maxres;
    }