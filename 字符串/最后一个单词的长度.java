/**
	����һ���ַ����� ������Сд��ĸ���ո�' '���뷵�������һ�����ʵĳ��ȡ�

	������������һ�����ʣ��뷵�� 0 ��

	 ע������

	һ�����ʵĽ綨�ǣ�����ĸ��ɣ����������κεĿո�

	����
	���� s = "Hello World"������ 5��
*/

public class Solution {
    /**
     * @param s A string
     * @return the length of last word
     */
    public int lengthOfLastWord(String s) {
        if(s==null||s.length()==0)
            return 0;
        s.trim();
        String[] news = s.split(" ");
        return news[news.length-1].length();
    }
}