/**
 * ������������һ���������飬����������ɰڶ����飬����nums[0] < nums[1] > nums[2] < nums[3]...���������������ӡ�
 * ���ǿ����ȸ���������Ȼ�����������������ķ������ҵ�������м�������൱�ڰ�����������м�ֳ������֣�Ȼ���ǰ��ε�ĩβȡһ�����ڴӺ���ĩβȥһ����
 * ������֤�˵�һ����С�ڵڶ�������Ȼ���ǰ���ȡ�����ڶ������Ӻ���ȡ�����ڶ������Ᵽ֤�˵ڶ��������ڵ����������ҵ�������С�ڵ��ĸ�����
 * �Դ�����ֱ����ȡ�꣬�μ��������£�

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
