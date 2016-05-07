/**
 * ����һ�������������ҳ�һ���Ӿ���ʹ��������֮�͵���0.�����ʱ���뷵���������ֺ��������ֵ����ꡣ
 * ����
 * ��������
 * [
	  [1 ,5 ,7],
	  [3 ,7 ,-8],
	  [4 ,-8 ,9],
  ]
      ���� [(1,1), (2,2)]
 * 
 * �����Ŀ��������֮�͡�
 * http://blog.csdn.net/cumt_cx/article/details/48324893
 * @author EvanJames
 *
 */

public class Solution {
    /**
     * @param matrix an integer matrix
     * @return the coordinate of the left-up and right-down number
     */
    public int[][] submatrixSum(int[][] matrix) {
            int m = matrix.length, n = matrix[0].length;
	       
	        int[][] res = new int[2][2];
	       
	        for(int i = 0; i < n; i++){
	            int[] sum = new int[m];
	            for(int j = i; j < n; j++){   
	                for(int k = 0; k < m; k++){
	                    sum[k] += matrix[k][j];
	                }
	               
	                HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
	                int lastSum = 0;
	                map.put(0, -1); // important
	                
				
	                for(int l = 0; l < m; l++){
	                    lastSum += sum[l];
	                    if(map.containsKey(lastSum)){
	                        res = new int[][] {{map.get(lastSum)+1, i}, {l, j}};
	                        return res;
	                    }
	                    map.put(lastSum, l);
	                }
	            }
	        }
	        return res; 
    }
}