/*
写出一个高效的算法来搜索 m × n矩阵中的值。

这个矩阵具有以下特性：

每行中的整数从左到右是排序的。
每行的第一个数大于上一行的最后一个整数。
样例
考虑下列矩阵：

[
  [1, 3, 5, 7],
  [10, 11, 16, 20],
  [23, 30, 34, 50]
]
给出 target = 3，返回 true
*/
public class Solution {
    /**
     * @param matrix, a list of lists of integers
     * @param target, an integer
     * @return a boolean, indicate whether matrix contains target
     */
    public boolean searchMatrix(int[][] matrix, int target) {
		ArrayList<Integer> input = new ArrayList<>();
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix[0].length;j++){
				input.add(matrix[i][j]);
			}
		}
    	int left = 0;
    	int right = input.size()-1;
    	int mid = 0;
    	while(left<=right){
    		mid = (right+left)/2;
    		if(input.get(mid)==target)
    			return true;
    		if(input.get(mid)>target){
    			right = mid-1;
    		}else if (input.get(mid)<target) {
    			left = mid+1;
			}
    	}
    	return false;
    }
}
