/**

����һ���ַ���source��һ��Ŀ���ַ���target�����ַ���source���ҵ���������Ŀ���ַ�����ĸ���Ӵ���

 ע������

�����source��û���������Ӵ�������""������ж���������Ӵ���������ʼλ����С���Ӵ���

˵��
�ڴ𰸵��Ӵ��е���ĸ��Ŀ���ַ������Ƿ���Ҫ������ͬ��˳��

��������Ҫ��

����
����source = "ADOBECODEBANC"��target = "ABC" ����Ҫ��Ľ�  "BANC"
*/

public class Solution {
    /**
     * @param source: A string
     * @param target: A string
     * @return: A string denote the minimum window
     *          Return "" if there is no such a string
     */
    public String minWindow(String source, String target) {
        // write your code
        if(source==null||source.length()==0)
            return "";
        HashMap<Character,Integer> targetmap = transf(target);

        int minlength = Integer.MAX_VALUE;
        String res = "";
        int len = target.length();
        int pre = 0;
        int count=0;

        for(int i=0;i<source.length();i++){
            if(targetmap.containsKey(source.charAt(i))){
                targetmap.put(source.charAt(i),targetmap.get(source.charAt(i))-1);
                if(targetmap.get(source.charAt(i))>=0)
                    count++;
            }
            while(count == len){
                if(targetmap.containsKey(source.charAt(pre))){
                    targetmap.put(source.charAt(pre),targetmap.get(source.charAt(pre))+1);
                    if(targetmap.get(source.charAt(pre))>0){
                        String tem =  source.substring(pre,i+1);
                        if(tem.length()<minlength){
                            res =tem;
                            minlength =res.length();
                        }
                        count--;
                    }
                }
                pre++;
            }
        }
        return res;
    }
    //���ַ���ת��Ϊhashmap
    private static HashMap<Character, Integer> transf(String target) {
        HashMap<Character,Integer> targetmap = new HashMap<>();
        for(int i=0;i<target.length();i++){
            if(!targetmap.containsKey(target.charAt(i)))
                targetmap.put(target.charAt(i),1);
            else
                targetmap.put(target.charAt(i),targetmap.get(target.charAt(i))+1);
        }
        return targetmap;
    }
}