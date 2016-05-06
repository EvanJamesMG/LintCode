/*
给出一个字符串 A, 表示一个 n 位正整数, 删除其中 k 位数字, 使得剩余的数字仍然按照原来的顺序排列产生一个新的正整数。

找到删除 k 个数字之后的最小正整数。

N <= 240, k <= N

样例
给出一个字符串代表的正整数 A 和一个整数 k, 其中 A = 178542, k = 4

返回一个字符串 "12"
*/
/*思路：
   每次删除一个字母，从高位到低位，
   发现s[i]>s[i+1]时，即第i位应该删除，同理可引申到使留下来的正整数尽可能的大，
   注意最后输出不能有前缀0
 */ 
public class Solution {
    /**
     *@param A: A positive integer which has N digits, A is a string.
     *@param k: Remove k digits.
     *@return: A string
     */
    public String DeleteDigits(String A, int k) {
        String temp = A;  
        while(k>0){  
        	k--;
            int i=0;  
            while(i<temp.length()-1&&temp.charAt(i)<=temp.charAt(i+1))  
                i++;  
            temp = temp.substring(0,i)+temp.substring(i+1,temp.length());  
        }  
        int i = 0;  
        while(i<temp.length()&&temp.charAt(i)=='0')  
            i++;  
        String ret = temp.substring(i,temp.length());  
        return ret;  
    }
}