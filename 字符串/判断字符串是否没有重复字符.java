/**
	ʵ��һ���㷨ȷ���ַ����е��ַ��Ƿ��Ψһ����
	����
	����"abc"������ true

	����"aab"������ false
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