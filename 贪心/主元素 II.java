/*
给定一个整型数组，找到主元素，它在数组中的出现次数严格大于数组元素个数的三分之一。

 注意事项

数组中只有唯一的主元素

样例
给出数组[1,2,1,2,1,3,3] 返回 1
*/


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
public class Solution {
    /**
     * @param nums: A list of integers
     * @return: The majority number that occurs more than 1/3
     */
    public int majorityNumber(ArrayList<Integer> nums) {
		HashMap<Integer, Integer> map = new HashMap<>();
		int length = nums.size()/3;
		for(int sub:nums){
			if(map.containsKey(sub))
				map.put(sub, map.get(sub)+1);
			else{
				map.put(sub,1);
			}
		}
		for(Entry<Integer, Integer> entry:map.entrySet()){
			if(entry.getValue()>length)
				return entry.getKey();
		}
		
    	return -1;
    }
}