/*
有 n 个不同价值的硬币排成一条线。两个参赛者轮流从左边依次拿走 1 或 2 个硬币，直到没有硬币为止。计算两个人分别拿到的硬币总价值，价值高的人获胜。

请判定 第一个玩家 是输还是赢？

样例
给定数组 A = [1,2,2], 返回 true.

给定数组 A = [1,2,4], 返回 false.
*/
/*
 * 定义dp[i]表示从i到end能取到的最大值(注意左起点不包括i，是从i+1开始的)

	当我们在i处，有两种选择：
	
	1.若取values[i]，对方可以取values[i+1] 或者values[i+1] + values[i+2]
	
		当对方取values[i+1] 后 ，我们只能从 i+2 到end内取，我们所取得最大值是dp[i+2],  注意：对方所选取的结果一定是使得我们以后选取的值最小
		
		当对方取values[i+1] + values[i+2]后，我们只能从i+3到end内取，我们所取得最大值是dp[i+3]。
		
		此时：dp[i] = values[i] + min(dp[i+2],dp[i+3]) , 注意：对方所选取的结果一定是使得我们以后选取的值最小
	
	2.若取values[i] + values[i+1],对方可取values[i+2] 或者values[i+2] + values[i+3]
	
		当对方取values[i+2]后，我们只能从i+3到end内取，我们取得最大值是dp[i+3]
		
		当对方取values[i+2]+values[i+3]后，我们只能从i+4到end内去，我们取得最大值是dp[i+4]
		
		此时：dp[i] = values[i] + values[i+1]+min(dp[i+3],dp[i+4])
		
		这里的取最小值和上面一样的意思，对方选取过之后的值一定是使得我们选取的值最小，对方不傻并且还很聪明
		
		最后我们可以取上面两个dp[i]的最大值，就是答案，这里意思是：对方留得差的方案中，我们选取的最大值。
 */
	
    public static boolean firstWillWin(int[] values) {
        // write your code here
    	int len = values.length;
    	int[] dp = new int[len+1];
    	if(values==null ||values.length==0)
    		return false;
    	if(len<=2)
    		return true;
    	if(len==3)
    		return (values[0]+values[1])>values[2];
    	dp[len] = 0;
    	dp[len-1] = values[len-1];
    	dp[len-2] = values[len-1]+values[len-2];
    	dp[len-3] = values[len-3]+values[len-2];
    	
    	for(int i=len-4;i>=0;i--){
    		dp[i] = values[i] + Math.min(dp[i+2], dp[i+3]);
    		dp[i] = Math.max(dp[i], values[i]+values[i+1]+Math.min(dp[i+3], dp[i+4]));
    	}
    	
        int sum = 0;
        for(int sub:values)
        	sum+=sub;
        return dp[0]>(sum-dp[0]);
    }