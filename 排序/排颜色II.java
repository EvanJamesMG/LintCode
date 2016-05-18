/*
	通过快排解决
*/

class Solution {
    /**
     * @param colors: A list of integer
     * @param k: An integer
     * @return: nothing
     */
    public void sortColors2(int[] colors, int k) {
        // write your code here
        QuickSrot(colors,0,colors.length-1);
    }

    private static void QuickSrot(int[] colors, int left, int right) {
        if(left>=right)
            return;
        int key  = colors[left];
        int lp = left;
        int rp = right;
        while (lp<rp){
            while(colors[rp]>=key&&lp<rp){
                rp--;
            }
            while(colors[lp]<=key&&lp<rp){
                lp++;
            }
            swap(colors, lp, rp);
        }
        swap(colors,left,lp);
        QuickSrot(colors, left, lp - 1);
        QuickSrot(colors,rp+1,right);
    }

    private static void swap(int[] colors, int lp, int rp) {
        int tem  = colors[lp];
        colors[lp] =  colors[rp];
        colors[rp] = tem;
    }        
}