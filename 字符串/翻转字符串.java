/**
	����һ���ַ����������ת�ַ����е�ÿ�����ʡ�

	˵��
	���ʵĹ��ɣ��޿ո���ĸ����һ������
	�����ַ����Ƿ����ǰ������β��ո񣿿��԰��������Ƿ�ת����ַ����ܰ���
	��δ����������ʼ�Ķ���ո��ڷ�ת�ַ����м�ո���ٵ�ֻ��һ��
	����
	����s = "the sky is blue"������"blue is sky the"
*/

public class Solution {
    /**
     * @param s : A string
     * @return : A string
     */
    public String reverseWords(String s) {
        String res = "";
        if(s==null||s.length()==0)
            return res;
        ArrayList<String> list = new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=' '){
                int k=i;
                while(k<s.length()){
                    if(s.charAt(k)==' ')
                        break;
                    k++;
                }
                String sub = s.substring(i,k);
                list.add(sub);
                i=k;
            }
        }
        Collections.reverse(list);
        for(int i=0;i<list.size();i++){
            if(i==list.size()-1)
                res+=list.get(i);
            else
                res+=list.get(i)+" ";

        }
        return res;
    }
}
