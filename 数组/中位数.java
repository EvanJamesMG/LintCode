/**
����һ��δ������������飬�ҵ�����λ����

��λ���������������м�ֵ���������ĸ�����ż�������򷵻����������ĵ�N/2������

����
��������[4, 5, 1, 2, 3]�� ���� 3

��������[7, 9, 4, 5]������ 5
*/

public class Solution {
    /**
     * @param nums: A list of integers.
     * @return: An integer denotes the middle number of the array.
     */
    public int median(int[] nums) {
        // write your code here
        Arrays.sort(nums);
        if(nums.length%2==0)
            return nums[nums.length/2-1];
        else
            return nums[nums.length/2];        
    }
}
