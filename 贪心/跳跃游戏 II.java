/*
给出一个非负整数数组，你最初定位在数组的第一个位置。

数组中的每个元素代表你在那个位置可以跳跃的最大长度。　　　

你的目标是使用最少的跳跃次数到达数组的最后一个位置。

样例
给出数组A = [2,3,1,1,4]，最少到达数组最后一个位置的跳跃次数是2(从数组下标0跳一步到数组下标1，然后跳3步到数组的最后一个位置，一共跳跃2次)
*/

public class Solution {
    /**
     * @param A: A list of lists of integers
     * @return: An integer
     */
    public int jump(int[] A) {
		int tem = A[0];
		int k=1;
		if(tem>=A.length)
			return k;
    	for(int i=0;i<A.length;i++){
    		int max = i+1+A[i+1];
    		int ori_i= i+1;
    		int label = 0 ;
    		int maxnum = 0;
    		//寻找出现阶段可达路径中的最大值
    		for(int index=i+1;index<Math.min(ori_i+tem,A.length);index++){
    			if(index+A[index]>=max){	
    				label = index;
    				maxnum = A[index];  
    			}
    		}
    		//找出的最大值所在点就是跳跃点
			i = label+maxnum;
			k++;
			if(i>=A.length-1)
				return k;
			tem = A[i];
			i--;

		}
    	return k;
    }
}