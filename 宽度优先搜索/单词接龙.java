/**
	给出两个单词（start和end）和一个字典，找到从start到end的最短转换序列

	比如：

	每次只能改变一个字母。
	变换过程中的中间单词必须在字典中出现。

	 注意事项

	如果没有转换序列则返回0。
	所有单词具有相同的长度。
	所有单词都只包含小写字母。

	样例
	给出数据如下：

	start = "hit"

	end = "cog"

	dict = ["hot","dot","dog","lot","log"]

	一个最短的变换序列是 "hit" -> "hot" -> "dot" -> "dog" -> "cog"，

	返回它的长度 5

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