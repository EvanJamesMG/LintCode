/*
������һ�����飬���ĵ�i��Ԫ����һ�������Ĺ�Ʊ�ڵ�i��ļ۸����һ���㷨���ҵ���������
�������ɾ����ܶ�Ľ���(���������Ʊ)��Ȼ��,�㲻��ͬʱ����������(��������ٴι���ǰ���۹�Ʊ)��

����
����һ����������[2,1,2,0,1], ���� 2
*/

class Solution {
    /**
     * @param prices: Given an integer array
     * @return: Maximum profit
     */
    public int maxProfit(int[] prices) {
        if(prices ==null ||prices.length==0)
            return 0;
    	int maxsum = 0;
    	for(int i=1;i<prices.length;i++){
    		if(prices[i]>=prices[i-1]){
    			maxsum+=prices[i]-prices[i-1];
    		}
    	}
		return maxsum;
	}
}