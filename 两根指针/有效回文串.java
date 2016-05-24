
/*
*给定一个字符串，判断其是否为一个回文串。只包含字母和数字，忽略大小写。

 注意事项

你是否考虑过，字符串有可能是空字符串？这是面试过程中，面试官常常会问的问题。

在这个题目中，我们将空字符串判定为有效回文。

样例
"A man, a plan, a canal: Panama" 是一个回文。

"race a car" 不是一个回文。
*/
public class Solution {
    /**
     * @param s A string
     * @return Whether the string is a valid palindrome
     */
    public boolean isPalindrome(String s) {
        if(s==null ||s.length()<=1)
            return true;
        String news = "";

        for(int i=0;i<s.length();i++) {
            char tem = s.charAt(i);
            if (Character.isDigit(s.charAt(i)) || Character.isLetter(s.charAt(i))) {
                news +=s.charAt(i);
            }
        }
        int left = 0;
        int right = news.length()-1;
        news = news.toUpperCase();
        while(left<right){
            if(news.charAt(left)==news.charAt(right)){
                left++;
                right--;
            }else{
                return false;
            }
        }
        return true;
    }
}