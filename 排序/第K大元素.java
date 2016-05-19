/*
在数组中找到第k大的元素

 注意事项

你可以交换数组中的元素的位置

样例
给出数组 [9,3,2,4,8]，第三大的元素是 4

给出数组 [1,2,3,4,5]，第一大的元素是 5，第二大的元素是 4，第三大的元素是 3，以此类推
*/
/*
 思路：快排
*/
class Solution {
    /*
     * @param k : description of k
     * @param nums : array of nums
     * @return: description of return
     */
    public int kthLargestElement(int k, int[] nums) {
        QuickSort(nums, 0, nums.length - 1);
        return nums[nums.length-k];
    }

    private static void QuickSort( int[] nums, int start, int end) {
        if(start>end)
            return;
        int key = nums[start];
        int lp= start;
        int rp = end;
        while(lp<rp){
            while (nums[rp]>=key&&lp<rp)
                rp--;
            while (nums[lp]<=key&&lp<rp)
                lp++;
            swap(nums,lp,rp);
        }
        swap(nums,start,lp);
        QuickSort(nums,start,lp-1);
        QuickSort(nums,lp+1,end);
    }


    private static void swap(int[] nums, int left, int right) {
        int tem = nums[left];
        nums[left] = nums[right];
        nums[right] = tem;
    }
}