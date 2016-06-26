/**
	给定两个二进制字符串，返回他们的和（用二进制表示）。

	样例
	a = 11

	b = 1

	返回 100
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