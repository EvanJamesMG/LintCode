/**
	д��һ������ anagram(s, t) �ж������ַ����Ƿ����ͨ���ı���ĸ��˳����һ�����ַ�����

	����
	���� s = "abcd"��t="dcab"������ true.
	���� s = "ab", t = "ab", ���� true.
	���� s = "ab", t = "ac", ���� false.
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