/**
 * 自定义排序  return (b+a).compareTo(a + b);
 * 注意字符串全为零的情况
 * 这时候返回“0”
 * 
 * /

class CustomComparator implements java.util.Comparator<String> {
    @Override
    public int compare(String a, String b) {
            return (b+a).compareTo(a + b);
    }
}
public class Solution {
    /**
     *@param num: A list of non negative integers
     *@return: A string
     */
    public String largestNumber(int[] num) {
        // write your code here
        String res = "";
        if(num==null ||num.length==0)
            return "";
        if(num.length==1)
            return Integer.toString(num[0]);
        String input[] = new String[num.length];
        for(int i=0;i<num.length;i++)
            input[i] =""+num[i];

        Arrays.sort(input,new CustomComparator());

        int zeroindex = 0;
        for(zeroindex=0;zeroindex<input.length;zeroindex++){
            if(!input[zeroindex].equals("0"))
                break;
        }
        if(zeroindex==input.length) {
            res = "0";
        }else {
            for (int i = zeroindex; i < input.length; i++)
                res += input[i];
        }
        return res;
    }
}