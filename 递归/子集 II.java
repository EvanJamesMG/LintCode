/**
����һ�����ܾ����ظ����ֵ��б����������п��ܵ��Ӽ�

 ע������

�Ӽ��е�ÿ��Ԫ�ض��Ƿǽ����
�����Ӽ����˳�����޹ؽ�Ҫ��
�⼯�в��ܰ����ظ��Ӽ�

����
��� S = [1,2,2]��һ�����ܵĴ�Ϊ��

[
  [2],
  [1],
  [1,2,2],
  [2,2],
  [1,2],
  []
]
*/

/**
  ������ DFS, ע���ظ�Ԫ�صĴ����ظ���Ԫ��ֱ������
*/
class Solution {
    /**
     * @param S: A set of numbers.
     * @return: A list of lists. All valid subsets.
     */
    static ArrayList<ArrayList<Integer>> res = new ArrayList<>();
    public static ArrayList<ArrayList<Integer>> subsetsWithDup(ArrayList<Integer> S) {
        // write your code here
        Collections.sort(S);
        dfs(0, 0, new ArrayList<Integer>(), S);
        return res;

    }

    private static void dfs(int depth, int startindex, ArrayList<Integer> temres, ArrayList<Integer> S) {

        if(!res.contains(temres))
            res.add(temres);
        if(depth==S.size()) {
            return;
        }
        int prenum = Integer.MAX_VALUE;
        for(int i=startindex;i< S.size();i++){
            if(prenum==S.get(i))
                continue;
            prenum = S.get(i);
            ArrayList<Integer> newtemres = new ArrayList<>(temres);
            newtemres.add(S.get(i));
            dfs(depth + 1, i + 1, newtemres, S);
        }

    }
}
