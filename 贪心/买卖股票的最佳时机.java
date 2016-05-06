/*
������һ�����飬���ĵ�i��Ԫ����һ֧�����Ĺ�Ʊ�ڵ�i��ļ۸�
��������ֻ�������һ�ν���(����,һ��������Ʊ),���һ���㷨���ҳ��������

����
����һ���������� [3,2,3,1,2], ���� 1 
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