/**
给一个数字字符串，每个数字代表一个字母，请返回其所有可能的字母组合。

下图的手机按键图，就表示了每个数字可以代表的字母。

Cellphone

 注意事项

以上的答案是按照词典编撰顺序进行输出的，不过，在做本题时，你也可以任意选择你喜欢的输出顺序。

样例
给定 "23"

返回 ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"]
*/

public class Solution {
    /**
     * @param digits A digital string
     * @return all posible letter combinations
     */
    public  ArrayList<String> letterCombinations(String digits) {
        // Write your code here
        HashMap<String,String> dict = new HashMap<>();
        ArrayList<String> res = new ArrayList<>();
        if(digits==null||digits.length()==0)
            return res;

        String subres = "";
        dict.put("2","abc");
        dict.put("3","def");
        dict.put("4","ghi");
        dict.put("5","jkl");
        dict.put("6","mno");
        dict.put("7","pqrs");
        dict.put("8","tuv");
        dict.put("9", "wxyz");

        dfs(0, digits, dict, subres, res);
        return res;
    }

    private static void dfs(int depth, String digits, HashMap<String, String> dict, String subres, ArrayList<String> res) {

        if(depth==digits.length()) {
            res.add(subres);
            return;
        }
        String substring = dict.get(digits.charAt(depth)+"");
        for(int i=0;i<substring.length();i++){
            String tem = substring.charAt(i)+"";
            dfs(depth + 1, digits, dict, subres + tem,res);
        }

    }
}