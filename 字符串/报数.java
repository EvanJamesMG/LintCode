/**
	报数指的是，按照其中的整数的顺序进行报数，然后得到下一个数。如下所示：

		1, 11, 21, 1211, 111221, ...

		1 读作 "one 1" -> 11.

		11 读作 "two 1s" -> 21.

		21 读作 "one 2, then one 1" -> 1211.

		给定一个整数 n, 返回 第 n 个顺序。

		 注意事项

		整数的顺序将表示为一个字符串。

		样例
		给定 n = 5, 返回 "111221".
*/
public class Solution {
    /**
     * @param n the nth
     * @return the nth sequence
     */
    public String countAndSay(int n) {
        if(n<=0)
            return "";
        String curRes = "1";
        int start = 1;
        String res = "";
        while(start < n){
            int count = 1;
            res = "";
            for(int i=1;i<curRes.length();i++){
                if(curRes.charAt(i)==curRes.charAt(i-1))
                    count++;
                else{
                    res +=count;
                    res +=curRes.charAt(i-1);
                    count=1;
                }
            }
            res+=count;
            res+=curRes.charAt(curRes.length()-1);
            curRes =res;
            start++;
        }
        return curRes;
    }
}