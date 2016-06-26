/**
	给k个字符串，求出他们的最长公共前缀(LCP)

	样例
	在 "ABCD" "ABEF" 和 "ACEF" 中,  LCP 为 "A"

	在 "ABCDEFG", "ABCEFG", "ABCEFA" 中, LCP 为 "ABC"
*/

public class Solution {
    /**
     * @param strs: A list of strings
     * @return: The longest common prefix
     */
    public String longestCommonPrefix(String[] strs) {
		if(strs==null ||strs.length ==0)
		    return "";
		String res = "";
		int minlength = strs[0].length();
		int minindex  = 0;
		for(int i=0;i<strs.length;i++){
			if(strs[i].length()<=minlength){
				minindex = i;
				minlength = strs[i].length();
			}
		}
		if(strs[minindex].length()==0)
		    return "";
		
    	for(int i=0;i<strs[minindex].length();i++){
    		for(int k=0;k<strs.length;k++){
    			if(strs[k].charAt(i)==strs[minindex].charAt(i))
    				continue;
    			else {
					return res;
				}    			
    		}
			res+=strs[0].charAt(i);

    	}
    	
    	return res;
    }
}