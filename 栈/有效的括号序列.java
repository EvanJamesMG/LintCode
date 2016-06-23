/**
����һ���ַ�������ʾ���������У����������ַ��� '(', ')', '{', '}', '[' and ']'�� �ж��Ƿ�����Ч���������С�

����
���ű������� "()" ˳���ʾ�� "()[]{}" ����Ч�����ţ��� "([)]"������Ч�����š�
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