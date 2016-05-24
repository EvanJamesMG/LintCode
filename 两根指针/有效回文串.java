
/*
*����һ���ַ������ж����Ƿ�Ϊһ�����Ĵ���ֻ������ĸ�����֣����Դ�Сд��

 ע������

���Ƿ��ǹ����ַ����п����ǿ��ַ������������Թ����У����Թٳ������ʵ����⡣

�������Ŀ�У����ǽ����ַ����ж�Ϊ��Ч���ġ�

����
"A man, a plan, a canal: Panama" ��һ�����ġ�

"race a car" ����һ�����ġ�
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