/**
	给定一个字符串， 包含大小写字母、空格' '，请返回其最后一个单词的长度。

	如果不存在最后一个单词，请返回 0 。

	 注意事项

	一个单词的界定是，由字母组成，但不包含任何的空格。

	样例
	给定 s = "Hello World"，返回 5。
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