import java.util.HashMap;
import java.util.Map.Entry;

/*
给出3*n + 1 个的数字，除其中一个数字之外其他每个数字均出现三次，找到这个数字。

样例
给出 [1,1,2,3,3,3,2,2,4,1] ，返回 4
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