/**
	给定一个字符串，逐个翻转字符串中的每个单词。

	说明
	单词的构成：无空格字母构成一个单词
	输入字符串是否包括前导或者尾随空格？可以包括，但是反转后的字符不能包括
	如何处理两个单词间的多个空格？在反转字符串中间空格减少到只含一个
	样例
	给出s = "the sky is blue"，返回"blue is sky the"
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
