/**
��������һ�����飬���ĵ�i��Ԫ����һ֧�����Ĺ�Ʊ�ڵ�i��ļ۸����һ���㷨���ҵ�����������������������ʽ��ס�

 ע������

�㲻����ͬʱ�����ʽ���(��������ٴι���ǰ���۵�֮ǰ�Ĺ�Ʊ)

����
����һ���������� [4,4,6,1,1,4,2,5], ���� 6
*/


/*
 * ���������������ÿһ���п���Ȼ��ֱ�������������������������ֵ��
   Ȼ������O(n)ʱ���ҵ�������������ֵ��
 */
 
class Solution {
    /**
     * @param prices: Given an integer array
     * @return: Maximum profit
     */
    public int maxProfit(int[] prices) {
    // ����˼���Ƿֳ�����ʱ��Σ�Ȼ�����ĳһ�죬����֮ǰ�����ֵ��֮������ֵ  
        if(prices.length == 0){  
            return 0;  
        }  
          
        int max = 0;  
        // dp���鱣����ߺ��ұߵ��������ֵ  
        int[] left = new int[prices.length];        // ����[0,i]��������ֵ  
        int[] right = new int[prices.length];   // ����[i,len-1]��������ֵ  
          
        process(prices, left, right);  
          
        // O(n)�ҵ����ֵ  
        for(int i=0; i<prices.length; i++){  
            max = Math.max(max, left[i]+right[i]);  
        }  
          
        return max;  
    }  
      
    public static void process(int[] prices, int[] left, int[] right){  
        left[0] = 0;  
        int min = prices[0];        // ��������  
          
        // ��ߵ��ƹ�ʽ  
        for(int i=1; i<left.length; i++){  
            left[i] = Math.max(left[i-1], prices[i]-min);   // i���������Ϊ��i-1�����󣩺ͣ���ǰ�����ۺ�֮ǰ�����֮��Ľϴ��Ǹ�  
            min = Math.min(min, prices[i]);     // ������С�����  
        }  
          
        right[right.length-1] = 0;  
        int max = prices[right.length-1];       // ���������  
        // �ұߵ��ƹ�ʽ  
        for(int i=right.length-2; i>=0; i--){  
            right[i] = Math.max(right[i+1], max-prices[i]); // i���������Ϊ��i+1�����󣩺ͣ���������ۺ͵�ǰ�����֮��Ľϴ��Ǹ�  
            max = Math.max(max, prices[i]);     // �������������  
        }  
          
    }  
};