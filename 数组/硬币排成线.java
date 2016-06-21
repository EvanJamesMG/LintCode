/**
有 n 个硬币排成一条线。两个参赛者轮流从右边依次拿走 1 或 2 个硬币，直到没有硬币为止。拿到最后一枚硬币的人获胜。

请判定 第一个玩家 是输还是赢？

样例
n = 1, 返回 true.

n = 2, 返回 true.

n = 3, 返回 false.

n = 4, 返回 true.

n = 5, 返回 true.
*/

/*
      两个人在一次拿的时候，当第一个人拿的是1时，第二个人拿的就是2；当第一个人拿的是2时，第二个人拿的就是1。
      这样一次拿取得值是3.这样就是一个以3为周期的序列，当只剩三个硬币的时候，不傻也知道怎么拿的。如下，直接对只有三枚硬币的情况考虑即可。
    n = 1, 返回 true.
    n = 2, 返回 true.
    n = 3, 返回 false.
 */
public class Solution {
    /**
     * @param n: an integer
     * @return: a boolean which equals to true if the first player will win
     */
    public boolean firstWillWin(int n) {
        // write your code here
        return (n%3!=0);
    }
}