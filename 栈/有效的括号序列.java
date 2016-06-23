/**
给定一个字符串所表示的括号序列，包含以下字符： '(', ')', '{', '}', '[' and ']'， 判定是否是有效的括号序列。

样例
括号必须依照 "()" 顺序表示， "()[]{}" 是有效的括号，但 "([)]"则是无效的括号。
*/

public class Solution {
    /**
     * @param s A string
     * @return whether the string is a valid parentheses
     */
    public boolean isValidParentheses(String s) {
        Stack<Character> mstack = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='[')
                mstack.add(s.charAt(i));
            if(s.charAt(i)==')') {
                if (mstack.empty() || mstack.pop() != '(')
                    return false;
            }
            if(s.charAt(i)==']'){
                if(mstack.empty()||mstack.pop()!='[')
                    return false;
            }

            if(s.charAt(i)=='}') {
                if(mstack.empty()||mstack.pop()!='{')
                    return false;
            }
        }
        return mstack.empty();
    }
}