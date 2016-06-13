/**

 ����һ���ѡ����(C)��Ŀ������(T),�ҳ�C�����е���ϣ�ʹ��������ֵĺ�ΪT��C��ÿ��������ÿ�������ֻ��ʹ��һ�Ρ�

 ע������

	���е�����(����Ŀ������)��Ϊ��������
	Ԫ�����(a1, a2, �� , ak)�����Ƿǽ���(ie, a1 �� a2 �� �� �� ak)��
	�⼯���ܰ����ظ�����ϡ� 
	����
	����һ�����ӣ���ѡ���ּ���Ϊ[10,1,6,7,2,1,5] ��Ŀ������ 8  ,

	�⼯Ϊ��[[1,7],[1,2,5],[2,6],[1,1,6]]
*/

public class Solution {
    /**
     * @param num: Given the candidate numbers
     * @param target: Given the target number
     * @return: All the combinations that sum to target
     */
    public List<List<Integer>> combinationSum2(int[] num, int target) {
        // write your code here
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> subres = new ArrayList<>();
        if(num==null||num.length==0)
            return res;
        Arrays.sort(num);
        dfs(0, num, target, res, subres);
        return res;
    }

    private static void dfs(int startindex, int[] num, int target, List<List<Integer>> res, List<Integer> subres) {
        if(target==0) {
            if(!res.contains(subres))
                res.add(subres);
            return;
        }
        if(startindex==num.length||target<0)
            return;
        for(int i=startindex;i<num.length;i++){
            List<Integer> newsubres = new ArrayList<>(subres);
            newsubres.add(num[i]);
            dfs(i+1,num,target-num[i],res,newsubres);
        }
    }
}