/**
	实现一个算法确定字符串中的字符是否均唯一出现
	样例
	给出"abc"，返回 true

	给出"aab"，返回 false
*/

public class Solution {
    /**
     * @param str: a string
     * @return: a boolean
     */
    public boolean isUnique(String str) {
        HashSet<Character> set = new HashSet<>();
        for(int i=0;i<str.length();i++){
            if(set.contains(str.charAt(i)))
                return false;
            else
                set.add(str.charAt(i));
        }
        return true;
    }
}