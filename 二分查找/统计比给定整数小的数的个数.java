
/**
����һ���������� ���±��� 0 �� n-1������ n ��ʾ����Ĺ�ģ����ֵ��Χ�� 0 �� 10000�����Լ�һ�� ��ѯ�б�
����ÿһ����ѯ���������һ�����������㷵�ظ�������С�ڸ���������Ԫ�ص�������

����
�������� [1,2,7,8,5] ����ѯ [1,8,5]������ [0,4,2]
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
