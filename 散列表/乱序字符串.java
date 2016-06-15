/**
给出一个字符串数组S，找到其中所有的乱序字符串(Anagram)。如果一个字符串是乱序字符串，那么他存在一个字母集合相同，但顺序不同的字符串也在S中。

 注意事项

所有的字符串都只包含小写字母

样例
对于字符串数组 ["lint","intl","inlt","code"]

返回 ["lint","inlt","intl"]
*/
public class Solution {
    /**
     * @param strs: A list of strings
     * @return: A list of strings
     */
    public List<String> anagrams(String[] strs) {
        HashMap<String,Integer> map = new HashMap<>();
        List<String> res= new ArrayList<>();
        if(strs==null||strs.length==0)
            return res;
        for(String sub:strs){
            char[] subtem = sub.toCharArray();
            Arrays.sort(subtem);
            String newsubtem = new String(subtem);
            if(map.containsKey(newsubtem)){
                map.put(newsubtem,map.get(newsubtem)+1);
            }else
                map.put(newsubtem,1);
        }
        String target="";
        HashSet<String> set = new HashSet<>();
        for(String key:map.keySet()){
            if(map.get(key)>1)
                set.add(key);
        }
        for(String sub:strs){
            char[] subtem = sub.toCharArray();
            Arrays.sort(subtem);
            String newsubtem = new String(subtem);
            if(set.contains(newsubtem)){
                res.add(sub);
            }
        }
        return res;
    }
}