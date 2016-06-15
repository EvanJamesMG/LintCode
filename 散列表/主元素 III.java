/**
����һ���������飬�ҵ���Ԫ�أ����������еĳ��ִ����ϸ��������Ԫ�ظ�����1/k��

 ע������

������ֻ��Ψһ����Ԫ��

����
�������� [3,1,2,3,2,3,3,4,4,4] ���� k = 3������ 3
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
