/*
���������ҵ���k���Ԫ��

 ע������

����Խ��������е�Ԫ�ص�λ��

����
�������� [9,3,2,4,8]���������Ԫ���� 4

�������� [1,2,3,4,5]����һ���Ԫ���� 5���ڶ����Ԫ���� 4���������Ԫ���� 3���Դ�����
*/
/*
 ˼·������
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