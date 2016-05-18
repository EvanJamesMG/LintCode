/*
	通过快排解决
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