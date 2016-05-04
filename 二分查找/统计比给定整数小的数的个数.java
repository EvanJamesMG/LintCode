
/**
给定一个整数数组 （下标由 0 到 n-1，其中 n 表示数组的规模，数值范围由 0 到 10000），以及一个 查询列表。
对于每一个查询，将会给你一个整数，请你返回该数组中小于给定整数的元素的数量。

样例
对于数组 [1,2,7,8,5] ，查询 [1,8,5]，返回 [0,4,2]
 */
public class Solution {
   /**
     * @param A: An integer array
     * @return: The number of element in the array that 
     *          are smaller that the given integer
     */
    public ArrayList<Integer> countOfSmallerNumber(int[] A, int[] queries) {
    	ArrayList<Integer> res=  new ArrayList<>();
    	ArrayList<Integer> input=  new ArrayList<>();
    	for(int sub:A){
    		input.add(sub);
    	}
    	Collections.sort(input);
    	for(int sub:queries){
    		res.add(findindex(input,sub));
    	}
    	return res;
    	
    }

	private static Integer findindex(ArrayList<Integer> input, int target) {
		// TODO Auto-generated method stub
		int left = 0;
		int right = input.size()-1;
		int mid = 0;
		while(left<=right){
			mid = (left+right)/2;

			if(input.get(mid)>=target)
				right = mid-1;
			else if (input.get(mid)<target) {
				left = mid+1;
			}
		}
		return left;
	}
}
