/*
��������k��0��n�еĳ��ֵĴ�����k������0~9��һ��ֵ

����
����n=12��k=1���� [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12]�����Ƿ���1������5�� (1, 10, 11, 12)
*/

class Solution {
    /*
     * param k : As description.
     * param n : As description.
     * return: An integer denote the count of digit k in 1..n
     */
    public int digitCounts(int k, int n) {
    	String newk  = Integer.toString(k); 
    	int res = 0;
    	for(int i=0;i<=n;i++){
        	String newn = Integer.toString(i);
        	if(newn.contains(newk)){
        		for(int ii=0;ii<newn.length();ii++){
        			
        			if(newn.substring(ii,ii+1).equals(newk))
        				res++;
        		}
        	}
    	}
		return res;
	}
};
