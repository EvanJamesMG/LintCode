/*
����һ���������飬�ҵ���Ԫ�أ����������еĳ��ִ����ϸ��������Ԫ�ظ���������֮һ��

 ע������

������ֻ��Ψһ����Ԫ��

����
��������[1,2,1,2,1,3,3] ���� 1
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