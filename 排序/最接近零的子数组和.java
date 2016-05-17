package com.lintcode;

import java.util.Arrays;

/**
    ��subarray sum���ƣ���һ��array���0��i��sum,Ȼ��sortһ�£�������������С�Ĳ�ֵ
    ������Ҫ����һ����ά�����飬�����еڶ�ά��¼����ԭarray��index.
    �ο���https://github.com/shawnfan/LintCode/blob/master/Java/Subarray%20Sum%20Closest.java
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
