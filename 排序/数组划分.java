/*
	给出一个整数数组nums和一个整数k。划分数组（即移动数组nums中的元素），使得：

	所有小于k的元素移到左边
	所有大于等于k的元素移到右边
	返回数组划分的位置，即数组中第一个位置i，满足nums[i]大于等于k。

	 注意事项

	你应该真正的划分数组nums，而不仅仅只是计算比k小的整数数，如果数组nums中的所有元素都比k小，则返回nums.length。

	样例
	给出数组nums=[3,2,2,1]和 k=2，返回 1

	挑战 
	要求在原地使用O(n)的时间复杂度来划分数组
*/
public class Solution {
	 
     @param nums The integer array you should partition
     @param k As description
     return The index after partition
     
    public int partitionArray(int[] nums, int k) {
	    write your code here
        int index =0;
        for(int i=0;inums.length;i++){
            if(nums[i]k) {
                swap(nums, i, index);
                index++;
            }
        }
        return index;
    }

    private static void swap(int[] nums, int left, int right) {
        int tem = nums[left];
        nums[left] = nums[right];
        nums[right] = tem;
    }

}