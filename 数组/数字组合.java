/**
����һ���ѡ����(C)��Ŀ������(T),�ҵ�C�����е���ϣ�ʹ�ҳ������ֺ�ΪT��C�е����ֿ����������ظ���ѡȡ��

����,������ѡ����[2,3,6,7]��Ŀ������7������Ľ�Ϊ��

[7]��

[2,2,3]

 ע������

���е�����(����Ŀ������)��Ϊ��������
Ԫ�����(a1, a2, �� , ak)�����Ƿǽ���(ie, a1 �� a2 �� �� �� ak)��
�⼯���ܰ����ظ�����ϡ� 

����
������ѡ����[2,3,6,7]��Ŀ������7

���� [[7],[2,2,3]]
*/

public class Solution {
    /**
     * @param candidates: A list of integers
     * @param target:An integer
     * @return: A list of lists of integers
     */
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> subres = new ArrayList<>();
        if(candidates==null||candidates.length==0)
            return res;
        Arrays.sort(candidates);
        dfs(0, candidates, target, res, subres);
        return res;
    }

    private static void dfs(int startindex, int[] num, int target, List<List<Integer>> res, List<Integer> subres) {
        if(target==0) {
            if(!res.contains(subres))
                res.add(subres);
            return;
        }
        if(target<0)
            return;
        for(int i=startindex;i<num.length;i++){
            List<Integer> newsubres = new ArrayList<>(subres);
            newsubres.add(num[i]);
            dfs(i, num, target - num[i], res, newsubres);
        }
    }
}