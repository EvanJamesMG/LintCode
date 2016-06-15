/**
给定一个整型数组，找到主元素，它在数组中的出现次数严格大于数组元素个数的1/k。

 注意事项

数组中只有唯一的主元素

样例
给出数组 [3,1,2,3,2,3,3,4,4,4] ，和 k = 3，返回 3
*/

public class Solution {
    /**
     * @param nums: A list of integers
     * @param k: As described
     * @return: The majority number
     */
    public int majorityNumber(ArrayList<Integer> nums, int k) {
        if(nums==null||nums.size()==0)
            return 0;
        int len  = nums.size();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(Integer sub:nums){
            if (map.containsKey(sub))
                map.put(sub,map.get(sub)+1);
            else
                map.put(sub,1);
        }
        for(Integer sub:map.keySet()){
            if(map.get(sub)>len/k)
                return sub;
        }
        return -1;
    }
}
