/**
	�����������ʣ�start��end����һ���ֵ䣬�ҵ���start��end�����ת������

	���磺

	ÿ��ֻ�ܸı�һ����ĸ��
	�任�����е��м䵥�ʱ������ֵ��г��֡�

	 ע������

	���û��ת�������򷵻�0��
	���е��ʾ�����ͬ�ĳ��ȡ�
	���е��ʶ�ֻ����Сд��ĸ��

	����
	�����������£�

	start = "hit"

	end = "cog"

	dict = ["hot","dot","dog","lot","log"]

	һ����̵ı任������ "hit" -> "hot" -> "dot" -> "dog" -> "cog"��

	�������ĳ��� 5

	http://www.programcreek.com/2012/12/leetcode-word-ladder/
*/
class WordNode{
    String word;
    int num;
    public WordNode(String word,int num){
        this.word  =word;
        this.num = num;
    }
}
public class Solution {
    /**
      * @param start, a string
      * @param end, a string
      * @param dict, a set of string
      * @return an integer
      */
    public int ladderLength(String start, String end, Set<String> dict) {
        Queue<WordNode> queue = new LinkedList<>();
        queue.add(new WordNode(start,1));
        dict.add(end);
        while(!queue.isEmpty()){

            WordNode curWordNode = queue.poll();
            String curWord = curWordNode.word;
            int curnum = curWordNode.num;

            if(curWord.equals(end))
                return curnum;
            char[] newcurWord = curWord.toCharArray();
            for(int i=0;i<start.length();i++){
                char tem = newcurWord[i];
                for(char w='a';w<='z';w++){
                    if(tem!=w)
                        newcurWord[i] = w;
                    String curWord2 = new String(newcurWord);
                    if(dict.contains(curWord2)){
                        queue.add(new WordNode(curWord2,curnum+1));
                        dict.remove(curWord2);
                    }
                }
                newcurWord[i] = tem;
            }
        }
        return 0;
    }
}