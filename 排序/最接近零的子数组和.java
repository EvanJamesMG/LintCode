package com.lintcode;

import java.util.Arrays;

/**
    跟subarray sum类似，用一个array存从0到i的sum,然后sort一下，相邻两个找最小的差值
    这里需要声明一个二维的数组，数组中第二维记录的是原array的index.
    参考：https://github.com/shawnfan/LintCode/blob/master/Java/Subarray%20Sum%20Closest.java
*/

class CustomComparator implements java.util.Comparator<int[]> {
    @Override
    public int compare(int[] a, int[] b) {
        return Integer.compare(a[0], b[0]);
    }
}
public class MyClass {
    public static void main(String[] args){
        int[] input = {-3};
        int [] res;
        res = subarraySumClosest(input);
        System.out.println(res);
    }

    public static int[] subarraySumClosest(int[] nums) {
        // write your code here
        int[] res = new int[2];
        int[][] indexnum = new int[nums.length][2];
        indexnum[0][0] = nums[0];
        indexnum[0][1]  = 0;
        for(int i=1;i<nums.length;i++){
            indexnum[i][0] =indexnum[i-1][0]+nums[i];
            indexnum[i][1] = i;
        }
        Arrays.sort(indexnum,new CustomComparator());
        int minres = Integer.MAX_VALUE;
        int startindex = 0;
        int endindex = 0;
        for(int i=1;i<indexnum.length;i++){
            if(Math.abs(indexnum[i][0]-indexnum[i-1][0])<minres){
                minres = indexnum[i][0]-indexnum[i-1][0];
                if(indexnum[i][1]-indexnum[i-1][1]>0){
                    startindex = indexnum[i-1][1]+1;
                    endindex = indexnum[i][1];
                }else{
                    startindex = indexnum[i][1]+1;
                    endindex = indexnum[i-1][1];
                }
            }
        }
        res[0] = startindex;
        res[1] = endindex;
        return res;
    }
}
