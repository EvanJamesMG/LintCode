/**
	跟进“删除重复数字”：

	如果可以允许出现两次重复将如何处理？

	样例
	给出数组A =[1,1,1,2,2,3]，你的函数应该返回长度5，此时A=[1,1,2,2,3]。
*/

public class Solution {
    /**
     * @param A: a array of integers
     * @return : return an integer
     */
    public int removeDuplicates(int[] nums) {
        if(nums==null||nums.length==0)
            return 0;
        int left = 0;
        int index =0;
        for(int i=0;i<nums.length;i++){
            nums[index] = nums[i];
            index++;
            if(i==nums.length-1)
                break;
            if(nums[i+1]==nums[i]){
                nums[index] = nums[i+1];
                index++;
                i++;
            }
            if(i==nums.length-1)
                break;
            while (nums[i + 1] == nums[i]) {
                i++;
                if(i==nums.length-1)
                    break;
            }
        }

        return index;
    }
}