import java.util.HashMap;
import java.util.Map.Entry;
/*
����2*n + 1 �������֣�������һ������֮������ÿ�����־��������Σ��ҵ�������֡�

����
���� [1,2,2,1,3,4,3]������ 4
*/

public class Solution {
    /**
      *@param A : an integer array
      *return : a integer 
      */
    public int singleNumber(int[] A) {
	   HashMap<Integer, Integer> map = new HashMap<>();
	   int res = 0;
	   for(int sub:A){
		   if(map.containsKey(sub))
			   map.remove(sub);
		   else {
			   map.put(sub, 1);
	      }
	   }
	   
	   for (Entry<Integer, Integer> entry : map.entrySet()) {
			res= entry.getKey();
	   }       
	   return res;
    }
}