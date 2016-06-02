/**
用递归的方法找到从1到最大的N位整数。

 注意事项

用下面这种方式去递归其实很容易：

recursion(i) {
    if i > largest number:
        return
    results.add(i)
    recursion(i + 1)
}
但是这种方式会耗费很多的递归空间，导致堆栈溢出。你能够用其他的方式来递归使得递归的深度最多只有 N 层么？

样例
给出 N = 1, 返回[1,2,3,4,5,6,7,8,9].

给出 N = 2, 返回[1,2,3,4,5,6,7,8,9,10,11,...,99].

挑战 
用递归完成，而非循环的方式。

*/


public class Solution {
    /**
     * @param n: An integer.
     * return : An array storing 1 to the largest number with n digits.
     */
    public List<Integer> numbersByRecursion(int n) {
        List<Integer> res = new ArrayList<>();
        if(n<=0)
            return res;
        if(n==1){
            for(int i=1;i<=9;i++)
                res.add(i);
            return res;
        }
        List<Integer> preres = numbersByRecursion(n-1);
        res.addAll(preres);

        for(int i=1;i<=9;i++){
            res.add((int) Math.pow(10,n-1)*i);
            for(int sub:preres){
                res.add((int) Math.pow(10,n-1)*i+sub);
            }
        }

        return res;
    }
}