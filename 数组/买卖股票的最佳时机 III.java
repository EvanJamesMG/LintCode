/**
假设你有一个数组，它的第i个元素是一支给定的股票在第i天的价格。设计一个算法来找到最大的利润。你最多可以完成两笔交易。

 注意事项

你不可以同时参与多笔交易(你必须在再次购买前出售掉之前的股票)

样例
给出一个样例数组 [4,4,6,1,1,4,2,5], 返回 6
*/


/*
 * 可以在整个区间的每一点切开，然后分别计算左子区间和右子区间的最大值，
   然后再用O(n)时间找到整个区间的最大值。
 */
 
class Solution {
    /**
     * @param prices: Given an integer array
     * @return: Maximum profit
     */
    public int maxProfit(int[] prices) {
    // 基本思想是分成两个时间段，然后对于某一天，计算之前的最大值和之后的最大值  
        if(prices.length == 0){  
            return 0;  
        }  
          
        int max = 0;  
        // dp数组保存左边和右边的利润最大值  
        int[] left = new int[prices.length];        // 计算[0,i]区间的最大值  
        int[] right = new int[prices.length];   // 计算[i,len-1]区间的最大值  
          
        process(prices, left, right);  
          
        // O(n)找到最大值  
        for(int i=0; i<prices.length; i++){  
            max = Math.max(max, left[i]+right[i]);  
        }  
          
        return max;  
    }  
      
    public static void process(int[] prices, int[] left, int[] right){  
        left[0] = 0;  
        int min = prices[0];        // 最低买入价  
          
        // 左边递推公式  
        for(int i=1; i<left.length; i++){  
            left[i] = Math.max(left[i-1], prices[i]-min);   // i的最大利润为（i-1的利润）和（当前卖出价和之前买入价之差）的较大那个  
            min = Math.min(min, prices[i]);     // 更新最小买入价  
        }  
          
        right[right.length-1] = 0;  
        int max = prices[right.length-1];       // 最高卖出价  
        // 右边递推公式  
        for(int i=right.length-2; i>=0; i--){  
            right[i] = Math.max(right[i+1], max-prices[i]); // i的最大利润为（i+1的利润）和（最高卖出价和当前买入价之差）的较大那个  
            max = Math.max(max, prices[i]);     // 更新最高卖出价  
        }  
          
    }  
};