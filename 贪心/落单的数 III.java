import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
/*
给出2*n + 2个的数字，除其中两个数字之外其他每个数字均出现两次，找到这两个数字。

样例
给出 [1,2,2,3,4,4,5,3]，返回 1和5
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