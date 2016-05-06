/*有 N 个小孩站成一列。每个小孩有一个评级。

按照以下要求，给小孩分糖果：

每个小孩至少得到一颗糖果。

评级越高的小孩可以得到更多的糖果。
（其实题目描述的有点问题，不是评级越高的小孩可以得到更多的糖果，从第三个样例中可以看出来，应该是“相邻两人里评级高的，可以得到更多的糖果”，）

需最少准备多少糖果？

样例
给定评级 = [1, 2], 返回 3.

给定评级 = [1, 1, 1], 返回 3.

给定评级 = [1, 2, 2], 返回 4. ([1,2,1]).
*/

	/**
	 * 思路：
	 * 其实题目描述的有点问题，不是评级越高的小孩可以得到更多的糖果，从第三个样例中可以看出来，应该是“相邻两人里评级高的，可以得到更多的糖果”，
	 * 首先初始化每个人一个糖果，然后这个算法需要遍历两遍，第一遍从左向右遍历，如果右边的小盆友的等级高，等加一个糖果，这样保证了一个方向上高等级的糖果多。
	 * 然后再从右向左遍历一遍，如果相邻两个左边的等级高，而左边的糖果又少的话，则左边糖果数为右边糖果数加一。最后再把所有小盆友的糖果数都加起来返回即可。
	 * @param ratings
	 * @return
	 */
	
public class Solution {
    /**
     * @param ratings Children's ratings
     * @return the minimum candies you must give
     */
    public int candy(int[] ratings) {
    	int res = 0;
    	int[] num = new int[ratings.length];
    	for(int i=0;i<ratings.length;i++)
    		num[i]=1;
        for (int i = 0; i < ratings.length - 1; ++i) {
            if (ratings[i + 1] > ratings[i]) num[i + 1] = num[i] + 1;
        }
        for (int i = (int)ratings.length - 1; i > 0; --i) {
            if (ratings[i - 1] > ratings[i]) num[i - 1] = Math.max(num[i] + 1, num[i - 1]);
        }
        for (int i = 0; i < num.length; ++i) {
            res += num[i];
        }
        return res;
    }
}