/**
����һ���Ǹ�������ʾһ���������飬�ڸ����Ļ�����+1������һ���µ����顣

�����ְ��մ�С�������У����������б����ǰ�档

����
���� [1,2,3] ��ʾ 123, ���� [1,2,4].

���� [9,9,9] ��ʾ 999, ���� [1,0,0,0].
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