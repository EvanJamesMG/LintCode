/*
����һ���������飬�ҵ���Ϊ��������顣��Ĵ���Ӧ�÷�������Ҫ������������ʼλ�úͽ���λ��

����
���� [-3, 1, 2, -3, 4]������[0, 2] ���� [1, 3].
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