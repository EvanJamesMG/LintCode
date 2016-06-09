/**
	����һ���ַ���s����s�ָ��һЩ�Ӵ���ʹÿ���Ӵ����ǻ��Ĵ���

	����s���п��ܵĻ��Ĵ��ָ����

	����
	���� s = "aab"������

	[
	  ["aa", "b"],
	  ["a", "a", "b"]
	]
*/
public class Solution {
    /**
     * @param s: A string
     * @return: A list of lists of string
     */
    public List<List<String>> partition(String s) {
        // write your code here

        List<List<String>> res = new ArrayList<>();
        List<String> subres = new ArrayList<>();
        
        if(s==null||s.length()==0)
            return res;
        dfs(s,0,res,subres);
        return res;
    }

    private static void dfs(String s, int startindex, List<List<String>> res, List<String> subres) {
        if(startindex==s.length()) {
            res.add(subres);
            return;
        }

        for(int i=startindex;i<s.length();i++){
            String tem = s.substring(startindex,i+1);
            if(isValid(tem)) {
                List<String> newsubres = new ArrayList<>(subres);
                newsubres.add(tem);
                dfs(s, i + 1, res, newsubres);
            }
        }

    }

    private static boolean isValid(String tem) {
        int left = 0;
        int right = tem.length()-1;
        while(left<=right){
            if(tem.charAt(left)!=tem.charAt(right))
                return false;
            else{
                left++;
                right--;
            }
        }
        return true;
    }
}