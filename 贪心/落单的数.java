import java.util.HashMap;
import java.util.Map.Entry;
/*
给出2*n + 1 个的数字，除其中一个数字之外其他每个数字均出现两次，找到这个数字。

样例
给出 [1,2,2,1,3,4,3]，返回 4
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