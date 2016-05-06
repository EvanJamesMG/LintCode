/*
假设有一个数组，它的第i个元素是一支给定的股票在第i天的价格。
如果你最多只允许完成一次交易(例如,一次买卖股票),设计一个算法来找出最大利润。

样例
给出一个数组样例 [3,2,3,1,2], 返回 1 
*/

public class Solution {
    /**
     * @param prices: Given an integer array
     * @return: Maximum profit
     */
    public int maxProfit(int[] prices) {
        if(prices ==null ||prices.length==0)
            return 0;
    	int localmin = Integer.MAX_VALUE;
    	int maxsum = Integer.MIN_VALUE;
    	for(int sub:prices){
    		if(sub<=localmin)
    			localmin = sub;
			maxsum = Math.max(maxsum, sub-localmin);
    	}
		return maxsum;
    }
}