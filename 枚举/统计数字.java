/*
计算数字k在0到n中的出现的次数，k可能是0~9的一个值

样例
例如n=12，k=1，在 [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12]，我们发现1出现了5次 (1, 10, 11, 12)
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
