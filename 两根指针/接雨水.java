/*
http://www.lintcode.com/zh-cn/problem/trapping-rain-water/#
*/
public class Solution {
    /**
     * @param heights: an array of integers
     * @return: a integer
     */
    public int trapRainWater(int[] heights) {
        if(heights==null || heights.length==0)
            return 0;
        int left = 0;
        int right = heights.length-1;
        int max_num = 0;
        int max_index = 0;
        int res =0;
        for(int i=0;i<heights.length;i++){
            if(heights[i]>max_num){
                max_num = heights[i];
                max_index = i;
            }
        }

        int maxheight = heights[left];
        while(left<max_index){
            if(heights[left+1]>maxheight){
                maxheight = heights[left+1];
            }else{
                res += maxheight-heights[left+1];
            }
            left++;
        }

        int maxheight2 = heights[right];
        while(right>max_index){
            if(heights[right-1]>maxheight2){
                maxheight2 = heights[right-1];
            }else{
                res += maxheight2-heights[right-1];
            }
            right--;
        }

        return res;
    }
}