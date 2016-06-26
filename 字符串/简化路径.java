/**
	给定一个文档(Unix-style)的完全路径，请进行路径简化。
	样例
	"/home/", => "/home"

	"/a/./b/../../c/", => "/c"
*/

public class Solution {
    /**
     * @param path the original path
     * @return the simplified path
     */
    public String simplifyPath(String path) {
        Stack<String> mstack = new Stack<>();
        String res = "";
        int i=0;
        int end = 0;
        while (i<path.length()){
            end = i+1;
            while(end<path.length()&&path.charAt(end)!='/')
                end++;
            String tem = path.substring(i+1,end);
            if(tem.length()>0){
                if(tem.equals("..")){
                    if(!mstack.empty())
                        mstack.pop();
                }else if(!tem.equals("."))
                    mstack.add(tem);
            }
            i=end;
        }
        if(mstack.empty())
            res = "/";
        else{
            for(String sub:mstack){
                res += "/"+sub;
            }
        }
        return res;
    }
}