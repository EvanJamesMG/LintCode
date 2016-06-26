/**
	����һ���ַ��������賤���Ϊ1000�����������������Ӵ�������Լٶ�ֻ��һ����������������Ĵ���

	����
	�����ַ��� "abcdzdcab"������������Ӵ�Ϊ "cdzdc"��
*/

public class Solution {
    /**
     * @param s input string
     * @return the longest palindromic substring
     */
    public String longestPalindrome(String s) {
        // Write your code here
        if(s==null||s.length()<=1)
            return s;

        String res = "";
        int maxnum = 0;

        for (int i = 1; i < s.length(); i++) {
            String temone = helper(i-1,i,s);
            String temtwo = helper(i,i,s);
            String temres = temone.length()>temtwo.length()?temone:temtwo;
            if(temres.length() >maxnum){
                res = temres;
                maxnum = temres.length();
            }
        }
        return res;
    }

    private static String helper(int left, int right, String s) {
        String res ="";
        while (left >= 0 && right < s.length()) {
            if (s.charAt(left) != s.charAt(right))
                break;
            else {
                left--;
                right++;
            }
        }
        left++;
        right--;
        if ((right - left + 1) > res.length())
            res = s.substring(left, right + 1);

        return res;
    }
}