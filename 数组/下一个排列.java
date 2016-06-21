/**
	给定一个若干整数的排列，给出按正数大小进行字典序从小到大排序后的下一个排列。

	如果没有下一个排列，则输出字典序最小的序列。

	样例
	左边是原始排列，右边是对应的下一个排列。

	1,2,3 → 1,3,2

	3,2,1 → 1,2,3

	1,1,5 → 1,5,1
*/


public class Solution {
    /**
     * @param nums: an array of integers
     * @return: return nothing (void), do not return anything, modify nums in-place instead
     */

    /**
     * 
     输出字典序中的下一个排列。比如123生成的全排列是：123，132，213，231，312，321。

     那么321的next permutation是123。下面这种算法据说是STL中的经典算法。

     在当前序列中，从尾端往前寻找两个相邻升序元素，升序元素对中的前一个标记为partition。

     然后再从尾端寻找另一个大于partition的元素，并与partition指向的元素交换，然后将partition后的元素（不包括partition指向的元素）逆序排列。

     比如14532，那么升序对为45，partition指向4，由于partition之后除了5没有比4大的数，所以45交换为54，即15432，

     然后将partition之后的元素逆序排列，即432排列为234，则最后输出的next permutation为15234。确实很巧妙。
     * @param nums
     */
    public static void nextPermutation(int[] nums) {
        // write your code here
        if(nums==null||nums.length==0)
            return;

        int partition =-1;

        // 从尾部到首部，寻找升序对
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                partition=i;
                break;
            }
        }

        //从尾部到首部没有升序对，说明是最大序列，直接翻转
        if(partition==-1){
            int left = 0;
            int right = nums.length-1;
            while(left<right){
                int tem = nums[left];
                nums[left] = nums[right];
                nums[right]  = tem;
                left++;
                right--;
            }
        }else{
            //swap
            for(int i=nums.length-1;i>=partition;i--){
                if(nums[i]>nums[partition]){
                    int tem = nums[partition];
                    nums[partition] = nums[i];
                    nums[i] = tem;
                    break;
                }
            }

            //reverse
            int left = partition+1;
            int right = nums.length-1;
            while(left<right){
                int tem = nums[left];
                nums[left] = nums[right];
                nums[right] = tem;
                left++;
                right--;
            }

        }
    }
}