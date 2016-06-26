/**
	写出一个函数 anagram(s, t) 判断两个字符串是否可以通过改变字母的顺序变成一样的字符串。

	样例
	给出 s = "abcd"，t="dcab"，返回 true.
	给出 s = "ab", t = "ab", 返回 true.
	给出 s = "ab", t = "ac", 返回 false.
*/

public class Solution {
    /**
     * @param s: The first string
     * @param b: The second string
     * @return true or false
     */
    public boolean anagram(String s, String t) {
        if(s.length()==0&&t.length()==0)
            return true;
        if(s.length()==0||t.length()==0)
            return false;
        char[] cys = s.toCharArray();
        char[] cyt = t.toCharArray();
        Arrays.sort(cys);
        Arrays.sort(cyt);
        s = Arrays.toString(cys);
        t = Arrays.toString(cyt);
        if(s.equals(t))
            return true;
        else
            return false;    
    }
};