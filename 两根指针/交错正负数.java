/**
   给出一个含有正整数和负整数的数组，重新排列成一个正负数交错的数组。

	 注意事项

	不需要保持正整数或者负整数原来的顺序。

	样例
	给出数组[-1, -2, -3, 4, 5, 6]，重新排序之后，变成[-1, 5, -2, 4, -3, 6]或者其他任何满足要求的答案


 * 想到数据的问题，一般都可以用两根指针来解决，不是两个指针对着走，就是两根指针往相同方向走，这道题里可以用一根指针指向下一个负的，
 * 一根指针指向下一个正的，然后当前需要啥符号的，就和那根指针进行交换，再调整指针。
 * /
class Solution {
    /**
     * @param A: An integer array.
     * @return: void
     */
    public void rerange(int[] A) {
       // write your code here
        if(A==null||A.length<=1)
            return;
        int posnum = 0;
        int negnum = 0;
        int cur = 0;
        int posindex = 0;
        int negindex = 0;
        int curpos = 0;
        //统计正数和负数的数目
        for(int sub:A){
            if(sub>0)
                posnum++;
            if(sub<0)
                negnum++;
        }

        //原数组中找到第一个正数标号，第一个负数标号
        while(A[posindex]<0)
            posindex++;
        while(A[negindex]>0)
            negindex++;

        //如果正数数目大，第一个数字对应的是正数
        if(posnum>negnum)
            curpos = 1;
        while(cur<A.length){
            if(curpos==1){
                swap(A,cur,posindex);
                posindex++;
                while(posindex<A.length&&A[posindex]<0) posindex++;
                while(negindex<A.length&&A[negindex]>0) negindex++;
            }else{
                swap(A,cur,negindex);
                negindex++;
                while(posindex<A.length&&A[posindex]<0) posindex++;
                while(negindex<A.length&&A[negindex]>0) negindex++;
            }
            curpos = 1 - curpos;
            cur++;
        }
    }

    private static void swap(int[] A, int left, int right) {
        int tem = A[left];
        A[left] = A[right];
        A[right] = tem;
    }
}