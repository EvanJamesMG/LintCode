/**
	���һ�ַ�������һ���ַ����е����пո��滻�� %20 ������Լ�����ַ������㹻�Ŀռ��������µ��ַ�������õ����ǡ���ʵ�ġ��ַ����ȡ�

	��ĳ�����Ҫ���ر��滻����ַ����ĳ��ȡ�

	 ע������

	���ʹ�� Java �� Python, �����������ַ������ʾ�ַ�����

	����
	�����ַ���"Mr John Smith", ����Ϊ 13

	�滻�ո�֮�󣬲����е��ַ�����Ҫ��Ϊ"Mr%20John%20Smith"�����Ұ��³��� 17 ��Ϊ������ء�
*/

public class Solution {
    /**
     * @param string: An array of Char
     * @param length: The true length of the string
     * @return: The true length of new string
     */
    public int replaceBlank(char[] string, int length) {
        String input = "";
        for(int i=0;i<length;i++)
            input += string[i];
        int index=0;
        for(int i=0;i<input.length();i++){
            if(input.charAt(i)==' '){
                string[index] = '%';
                string[index+1] = '2';
                string[index+2] = '0';
                index +=3;
            }else{
                string[index] = input.charAt(i);
                index++;
            }
        }

        return index;
    }
}