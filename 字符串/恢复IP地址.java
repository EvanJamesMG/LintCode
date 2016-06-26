/**
	给一个由数字组成的字符串。求出其可能恢复为的所有IP地址。

	样例
	给出字符串 "25525511135"，所有可能的IP地址为：

	[
	  "255.255.11.135",
	  "255.255.111.35"
	]
	（顺序无关紧要）
*/
public class Solution {
    /**
     * @param s the IP string
     * @return All possible valid IP addresses
     */
    public ArrayList<String> restoreIpAddresses(String s) {
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

}