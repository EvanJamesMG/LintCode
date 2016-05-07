/*
给一个词典，找出其中所有最长的单词。

样例
在词典

{
  "dog",
  "google",
  "facebook",
  "internationalization",
  "blabla"
}
中, 最长的单词集合为 ["internationalization"]

在词典

{
  "like",
  "love",
  "hate",
  "yes"
}
中，最长的单词集合为 ["like", "love", "hate"]
*/

class Solution {
    /**
     * @param dictionary: an array of strings
     * @return: an arraylist of strings
     */
    ArrayList<String> longestWords(String[] dictionary) {
    	ArrayList<String> res = new ArrayList<>();
    	int maxnum = 0;
    	for(String sub:dictionary){
    		if(sub.length()>=maxnum)
    			maxnum = sub.length();
    	}
    	for(String sub:dictionary){
    		if(sub.length()==maxnum)
    			res.add(sub);
    	}
    	return res;
    }
};