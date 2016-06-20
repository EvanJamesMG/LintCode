/**
给定一个非负数，表示一个数字数组，在该数的基础上+1，返回一个新的数组。

该数字按照大小进行排列，最大的数在列表的最前面。

样例
给定 [1,2,3] 表示 123, 返回 [1,2,4].

给定 [9,9,9] 表示 999, 返回 [1,0,0,0].
*/

public class Solution {
    /**
     * @param digits a number represented as an array of digits
     * @return the result
     */
    public int[] plusOne(int[] digits) {
        long input =0;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<digits.length;i++){
            input = input*10+digits[i];
        }
        input++;

        while(input!=0){

            int tem = (int)(input%10);
            list.add(tem);
            input /=10;
        }
        int[] res = new int[list.size()];
        Collections.reverse(list);
        for(int i=0;i<res.length;i++)
            res[i] = (int)list.get(i);
        return res;
    }
}