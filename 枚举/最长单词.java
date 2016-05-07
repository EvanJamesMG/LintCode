/*
��һ���ʵ䣬�ҳ�����������ĵ��ʡ�

����
�ڴʵ�

{
  "dog",
  "google",
  "facebook",
  "internationalization",
  "blabla"
}
��, ��ĵ��ʼ���Ϊ ["internationalization"]

�ڴʵ�

{
  "like",
  "love",
  "hate",
  "yes"
}
�У���ĵ��ʼ���Ϊ ["like", "love", "hate"]
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