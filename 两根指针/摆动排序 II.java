/**
 * 这道题给了我们一个无序数组，让我们排序成摆动数组，满足nums[0] < nums[1] > nums[2] < nums[3]...，并给了我们例子。
 * 我们可以先给数组排序，然后在做调整。调整的方法是找到数组的中间的数，相当于把有序数组从中间分成两部分，然后从前半段的末尾取一个，在从后半的末尾去一个，
 * 这样保证了第一个数小于第二个数，然后从前半段取倒数第二个，从后半段取倒数第二个，这保证了第二个数大于第三个数，且第三个数小于第四个数，
 * 以此类推直至都取完，参见代码如下：

 */
public class Solution {
    /**
     * @param nums a list of integer
     * @return void
     */
    public void wiggleSort(int[] nums) {

        if(nums==null||nums.length<=1)
            return;
        int[] temnums =Arrays.copyOfRange(nums,0,nums.length);
        Arrays.sort(temnums);
        int n = nums.length,k = (n+1) / 2, j = n;

        for (int i = 0; i < n; ++i) {
            nums[i] = (i & 1)==1 ? temnums[--j] : temnums[--k];
        }
    }
}
