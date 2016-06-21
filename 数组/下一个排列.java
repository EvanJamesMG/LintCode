/**
	����һ���������������У�������������С�����ֵ����С������������һ�����С�

	���û����һ�����У�������ֵ�����С�����С�

	����
	�����ԭʼ���У��ұ��Ƕ�Ӧ����һ�����С�

	1,2,3 �� 1,3,2

	3,2,1 �� 1,2,3

	1,1,5 �� 1,5,1
*/


public class Solution {
    /**
     * @param nums: an array of integers
     * @return: return nothing (void), do not return anything, modify nums in-place instead
     */

    /**
     * 
     ����ֵ����е���һ�����С�����123���ɵ�ȫ�����ǣ�123��132��213��231��312��321��

     ��ô321��next permutation��123�����������㷨��˵��STL�еľ����㷨��

     �ڵ�ǰ�����У���β����ǰѰ��������������Ԫ�أ�����Ԫ�ض��е�ǰһ�����Ϊpartition��

     Ȼ���ٴ�β��Ѱ����һ������partition��Ԫ�أ�����partitionָ���Ԫ�ؽ�����Ȼ��partition���Ԫ�أ�������partitionָ���Ԫ�أ��������С�

     ����14532����ô�����Ϊ45��partitionָ��4������partition֮�����5û�б�4�����������45����Ϊ54����15432��

     Ȼ��partition֮���Ԫ���������У���432����Ϊ234������������next permutationΪ15234��ȷʵ�����
     * @param nums
     */
    public static void nextPermutation(int[] nums) {
        // write your code here
        if(nums==null||nums.length==0)
            return;

        int partition =-1;

        // ��β�����ײ���Ѱ�������
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                partition=i;
                break;
            }
        }

        //��β�����ײ�û������ԣ�˵����������У�ֱ�ӷ�ת
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