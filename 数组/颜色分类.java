/**

	给定一个包含红，白，蓝且长度为 n 的数组，将数组元素进行分类使相同颜色的元素相邻，并按照红、白、蓝的顺序进行排序。

	我们可以使用整数 0，1 和 2 分别代表红，白，蓝。

	 注意事项

	不能使用代码库中的排序函数来解决这个问题。
	排序需要在原数组中进行。

	样例
	给你数组 [1, 0, 1, 2], 需要将该数组原地排序为 [0, 1, 1, 2]。
	
    快速排序解决
*/

class Solution {
    /**
     * @param nums: A list of integer which is 0, 1 or 2 
     * @return: nothing
     */
    public void sortColors(int[] nums) {
        QuickSort(nums,0,nums.length-1);
    }


    private static void QuickSort(int[] nums, int left, int right) {
        if(left>=right)
            return;
        int key = nums[left];
        int lp = left;
        int rp = right;
        while (lp<rp){
            while(nums[rp]>=key&&lp<rp){
                rp--;
            }
            while(nums[lp]<=key&&lp<rp){
                lp++;
            }

            swap(nums,lp,rp);
        }
        swap(nums, left, lp);
        QuickSort(nums, left, lp - 1);
        QuickSort(nums,rp+1,right);
    }

    private static void swap(int[] nums, int lp, int rp) {
        int tem = nums[lp];
        nums[lp] = nums[rp];
        nums[rp] = tem;
    }
}