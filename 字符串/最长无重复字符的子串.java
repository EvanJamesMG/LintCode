/**
	����һ���ַ��������ҳ��������ظ��ַ�������ַ�����

	����
	���磬��"abcabcbb"�У������ظ��ַ�������ַ�����"abc"���䳤��Ϊ 3��

	���ڣ�"bbbbb"�������ظ��ַ�������ַ���Ϊ"b"������Ϊ1��
*/

public class Solution {
    /**
     * @param s: a string
     * @return: an integer 
     */
    public int lengthOfLongestSubstring(String s) {
        // write your code here
        if(s==null ||s.length()==0)
            return 0;
        if(s.length()==1)
            return 1;
        String subs = "";
        int slow = 0;
        int fast = 0;
        int res  = 0;
        while(slow<s.length()&&fast<s.length()){
            if(!subs.contains(""+s.charAt(fast))){
                subs += s.charAt(fast);
                fast++;
            }else{
                for(int i=slow;i<fast;i++){
                    if(s.charAt(i)==s.charAt(fast)){
                        slow = i+1;
                        if(slow<s.length()) {
                            subs = s.substring(slow,fast);
                        }
                        break;
                    }
                }
            }
            res = Math.max(res,fast-slow);
        }
        return res;
    }  
}