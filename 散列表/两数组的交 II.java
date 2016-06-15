/**
计算两个数组的交

 注意事项

每个元素出现次数得和在数组里一样
答案可以以任意顺序给出

样例
nums1 = [1, 2, 2, 1], nums2 = [2, 2], 返回 [2, 2].
*/
public class Solution {
    /**
     * @param nums1 an integer array
     * @param nums2 an integer array
     * @return an integer array
     */
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> res = new ArrayList<>();
        if(nums1.length==0||nums2.length==0)
            return new int[0];
        HashMap<Integer,Integer> mapone = new HashMap<>();
        HashMap<Integer,Integer> maptwo = new HashMap<>();
        for(int sub:nums1){
            if(mapone.containsKey(sub))
                mapone.put(sub,mapone.get(sub)+1);
            else
                mapone.put(sub,1);
        }
        for(int sub:nums2){
            if(maptwo.containsKey(sub))
                maptwo.put(sub,maptwo.get(sub)+1);
            else
                maptwo.put(sub,1);
        }
        for(int keyone:mapone.keySet()){
            if(maptwo.containsKey(keyone)){
                for(int i=0;i<Math.min(mapone.get(keyone),maptwo.get(keyone));i++)
                    res.add(keyone);
            }
        }
        int[] finalres = new int[res.size()];
        for(int i=0;i<res.size();i++)
            finalres[i] = res.get(i);

        return finalres;   
    }
}