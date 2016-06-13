    /**
     * 利用循环递归解决子问题。
     *首先我们要明确传统IP 地址的规律是分4个Part，每个Part是从0-255的数字

     *0-255的数字，转换成字符，即每个Part 可能由一个字符组成，二个字符组成，或者是三个字符组成。

     *对于每个段内数来说，最多3位最少1位，所以在每一层可以循环3次，来尝试填段。

     * 因为IP地址最多4个分段，当层数是3的时候说明已经尝试填过3个段了，那么把剩余没填的数段接到结尾即可。

     *这个过程中要保证的是填的数是合法的，最后拼接的剩余的数也是合法的。

     *注意开头如果是0的话要特殊处理，如果开头是0，判断整个串是不是0，不是的话该字符就是非法的。因为001，01都是不对的。

     */
    public static ArrayList<String> restoreIpAddresses(String s) {
        // Write your code here
        ArrayList<String> res = new ArrayList<>();
        String tem = "";
        if(s.length()<4||s.length()>12)
            return res;
        dfs(s,0,tem,res);
        return res;
    }

    private static void dfs(String s, int startindex, String tem, ArrayList<String> res) {
        if(startindex==3&&isValid(s)) {
            res.add(tem + s);
            return;
        }

        for(int i=0;i<3&&i<s.length()-1;i++){
            String sub = s.substring(0,i+1);
            if(isValid(sub))
                dfs(s.substring(i+1,s.length()),startindex+1,tem+sub+".",res);
        }
    }

    private static boolean isValid(String s) {
        if(s.charAt(0)=='0')
            return s.equals("0");

        int tem = Integer.parseInt(s);
        if(tem>=0&&tem<=255)
            return true;
        else
            return false;
    }