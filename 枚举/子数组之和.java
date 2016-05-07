/*
给定一个整数数组，找到和为零的子数组。你的代码应该返回满足要求的子数组的起始位置和结束位置

样例
给出 [-3, 1, 2, -3, 4]，返回[0, 2] 或者 [1, 3].
*/

public class Solution {
    /**
     * @param nums: A list of integers
     * @return: A list of integers includes the index of the first number 
     *          and the index of the last number
     */
    public ArrayList<Integer> subarraySum(int[] nums) {
    	HashMap<Integer, Integer> map = new HashMap<>();
    	ArrayList<Integer> res = new ArrayList<>();
    	map.put(0, -1);
    	int sum = 0;
    	for(int i=0;i<nums.length;i++){
    		sum += nums[i];
    		if(map.containsKey(sum)){
    			res.add(map.get(sum)+1);
    			res.add(i);
    			return res;

    		}else{
    			map.put(sum,i);
    		}
    	}
		return res;
    }
}