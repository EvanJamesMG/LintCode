/*
对于一个给定的 source 字符串和一个 target 字符串，你应该在 source 字符串中找出 target 字符串出现的第一个位置(从0开始)。如果不存在，则返回 -1。

说明
在面试中我是否需要实现KMP算法？

不需要，当这种问题出现在面试中时，面试官很可能只是想要测试一下你的基础应用能力。当然你需要先跟面试官确认清楚要怎么实现这个题。
样例
如果 source = "source" 和 target = "target"，返回 -1。

如果 source = "abcdabcdefg" 和 target = "bcd"，返回 1
*/

class Solution {
    /**
     * Returns a index to the first occurrence of target in source,
     * or -1  if target is not part of source.
     * @param source string to be scanned.
     * @param target string containing the sequence of characters to match.
     */
    public int strStr(String source, String target) {
        if(target==null)
            return -1;
        if(target.length()==0)
            return 0;

        if(source ==null ||source.length()==0)
            return -1;
        int lentarget = target.length();
    	for(int i=0;i<source.length();i++){
    		if(source.length()-i<lentarget)
    			return -1;
    		for(int k=0;k<lentarget;k++){
    			if(source.charAt(i+k)==target.charAt(k)){
    				if(k==target.length()-1)
    					return i;
    			}else {
					break;
				}
    		}
    	}
        return -1;
    }
}