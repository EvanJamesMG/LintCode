/**
给定 n 个非负整数 a1, a2, ..., an, 每个数代表了坐标中的一个点 (i, ai)。画 n 条垂直线，使得 i 垂直线的两个端点分别为(i, ai)和(i, 0)。找到两条线，使得其与 x 轴共同构成一个容器，以容纳最多水。

 注意事项

容器不可倾斜。

样例
给出[1,3,2], 最大的储水面积是2.
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