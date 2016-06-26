/**
	�Ƚ������ַ���A��B��ȷ��A���Ƿ����B�����е��ַ����ַ���A��B�е��ַ����� ��д��ĸ

	 ע������

	�� A �г��ֵ� B �ַ�������ַ�����Ҫ������������

	������ʵ���������Ƿ�����������⣿ Yes
	����
	���� A = "ABCD" B = "ACD"������ true

	���� A = "ABCD" B = "AABC"�� ���� false
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