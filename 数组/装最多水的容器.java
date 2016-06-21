/**
���� n ���Ǹ����� a1, a2, ..., an, ÿ���������������е�һ���� (i, ai)���� n ����ֱ�ߣ�ʹ�� i ��ֱ�ߵ������˵�ֱ�Ϊ(i, ai)��(i, 0)���ҵ������ߣ�ʹ������ x �Ṳͬ����һ�����������������ˮ��

 ע������

����������б��

����
����[1,3,2], ���Ĵ�ˮ�����2.
*/

public class Solution {
    /**
     * @param heights: an array of integers
     * @return: an integer
     */
    public int maxArea(int[] heights) {
        if(heights==null||heights.length==0)
            return 0;
        int left = 0;
        int right = heights.length-1;
        int res = 0;
        while(left<=right){
            res = Math.max(res,Math.min(heights[left],heights[right])*(right-left));
            if(heights[left]<heights[right]) {
                left++;
            }else{
                right--;
            }
        }
        return res;
    }
}