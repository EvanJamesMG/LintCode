/*
����һ�������� source �ַ�����һ�� target �ַ�������Ӧ���� source �ַ������ҳ� target �ַ������ֵĵ�һ��λ��(��0��ʼ)����������ڣ��򷵻� -1��

˵��
�����������Ƿ���Ҫʵ��KMP�㷨��

����Ҫ�����������������������ʱ�����Թٺܿ���ֻ����Ҫ����һ����Ļ���Ӧ����������Ȼ����Ҫ�ȸ����Թ�ȷ�����Ҫ��ôʵ������⡣
����
��� source = "source" �� target = "target"������ -1��

��� source = "abcdabcdefg" �� target = "bcd"������ 1
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