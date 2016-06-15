/**
写一个算法来判断一个数是不是"快乐数"。

一个数是不是快乐是这么定义的：对于一个正整数，每一次将该数替换为他每个位置上的数字的平方和，然后重复这个过程直到这个数变为1，或是无限循环但始终变不到1。
如果可以变为1，那么这个数就是快乐数。

样例
19 就是一个快乐数。

1^2 + 9^2 = 82
8^2 + 2^2 = 68
6^2 + 8^2 = 100
1^2 + 0^2 + 0^2 = 1
*/

public class Solution {
    /**
     * @param n an integer
     * @return true if this is a happy number or false
     */
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        while (n!=1&&!set.contains(n)){
            set.add(n);
            int sum = 0;
            while(n>0){
                int tem = n%10;
                sum+=Math.pow(tem,2);
                n/=10;
            }
            n =sum;
        }
        return n==1;
    }
}