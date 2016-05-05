import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
/*
����2*n + 2�������֣���������������֮������ÿ�����־��������Σ��ҵ����������֡�

����
���� [1,2,2,3,4,4,5,3]������ 1��5
*/


public class Solution {
    /**
     * @param A : An integer array
     * @return : Two integers
     */
    public List<Integer> singleNumberIII(int[] A) {
	   HashMap<Integer, Integer> map = new HashMap<>();
	   ArrayList<Integer> res = new ArrayList<>();
	   for(int sub:A){
		   if(map.containsKey(sub))
			   map.put(sub,map.get(sub)+1);
		   else {
			   map.put(sub, 1);
	      }
	   }
	   
	   for (Entry<Integer, Integer> entry : map.entrySet()) {
			if(entry.getValue()==1)
				res.add(entry.getKey());
	   }       
	   return res;
   }
}