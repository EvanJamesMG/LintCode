/**
	��k���ַ�����������ǵ������ǰ׺(LCP)

	����
	�� "ABCD" "ABEF" �� "ACEF" ��,  LCP Ϊ "A"

	�� "ABCDEFG", "ABCEFG", "ABCEFA" ��, LCP Ϊ "ABC"
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