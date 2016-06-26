/**
	比较两个字符串A和B，确定A中是否包含B中所有的字符。字符串A和B中的字符都是 大写字母

	 注意事项

	在 A 中出现的 B 字符串里的字符不需要连续或者有序。

	您在真实的面试中是否遇到过这个题？ Yes
	样例
	给出 A = "ABCD" B = "ACD"，返回 true

	给出 A = "ABCD" B = "AABC"， 返回 false
*/
public class Solution {
    /**
     * @param A : A string includes Upper Case letters
     * @param B : A string includes Upper Case letter
     * @return :  if string A contains all of the characters in B return true else return false
     */
    public boolean compareStrings(String A, String B) {
    	HashMap<Character, Integer> mapA = new HashMap<>();
    	HashMap<Character, Integer> mapB = new HashMap<>();
    	for(int i=0;i<A.length();i++){
    		if(mapA.containsKey(A.charAt(i))){
    			mapA.put(A.charAt(i), mapA.get(A.charAt(i))+1);
    		}else{
    			mapA.put(A.charAt(i), 1);
    		}
    	}
    	
    	for(int i=0;i<B.length();i++){
    		if(mapB.containsKey(B.charAt(i))){
    			mapB.put(B.charAt(i), mapB.get(B.charAt(i))+1);
    		}else{
    			mapB.put(B.charAt(i), 1);
    		}
    	}
    	
    	for(Entry<Character, Integer> entry:mapB.entrySet()){
    		if(mapA.containsKey(entry.getKey())){
    			if(mapA.get(entry.getKey())<entry.getValue())
    				return false;	
    		}else{
    			return false;
    		}
    	}
    	return true;    
    }
}