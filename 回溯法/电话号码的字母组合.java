/**
��һ�������ַ�����ÿ�����ִ���һ����ĸ���뷵�������п��ܵ���ĸ��ϡ�

��ͼ���ֻ�����ͼ���ͱ�ʾ��ÿ�����ֿ��Դ������ĸ��

Cellphone

 ע������

���ϵĴ��ǰ��մʵ��׫˳���������ģ���������������ʱ����Ҳ��������ѡ����ϲ�������˳��

����
���� "23"

���� ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"]
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