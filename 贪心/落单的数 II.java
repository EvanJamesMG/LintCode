import java.util.HashMap;
import java.util.Map.Entry;

/*
����3*n + 1 �������֣�������һ������֮������ÿ�����־��������Σ��ҵ�������֡�

����
���� [1,1,2,3,3,3,2,2,4,1] ������ 4
*/


public class Solution {
	/**
	 * @param A : An integer array
	 * @return : An integer 
	 */
    public int singleNumberII(int[] A) {
	   HashMap<Integer, Integer> map = new HashMap<>();
	   int res = 0;
	   for(int sub:A){
		   if(map.containsKey(sub))
			   map.put(sub,map.get(sub)+1);
		   else {
			   map.put(sub, 1);
	      }
	   }
	   
	   for (Entry<Integer, Integer> entry : map.entrySet()) {
			if(entry.getValue()==1)
				res = entry.getKey();
	   }       
	   return res;
   }
}