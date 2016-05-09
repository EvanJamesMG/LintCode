/*
����һ�����������Σ��ҵ��Ӷ������ײ�����С·���͡�ÿһ�������ƶ�������һ�е����������ϡ�

 ע������

�����ֻ�ö���ռ临�Ӷ�O(n)����������ɿ��Ի�üӷ֣�����n�����������ε���������

����
���磬�����������������Σ�

[
     [2],
    [3,4],
   [6,5,7],
  [4,1,8,3]
]
�Ӷ����ײ�����С·����Ϊ11 ( 2 + 3 + 5 + 1 = 11)��
*/

public class Solution {
    /**
     * @param triangle: a list of lists of integers.
     * @return: An integer, minimum path sum.
     */
    public int minimumTotal(int[][] triangle) {
    	for(int i=triangle.length-2;i>=0;i--){
    		for(int j=0;j<=i;j++){
    			triangle[i][j] = triangle[i][j]+Math.min(triangle[i+1][j], triangle[i+1][j+1]);
    		}
    	}
    	return triangle[0][0];
    }
}
