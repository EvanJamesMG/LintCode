/**
	��һ���������飬�ҵ�������ʹ�����ǵĺ͵���һ���������� target��

	����Ҫʵ�ֵĺ���twoSum��Ҫ���������������±�, ���ҵ�һ���±�С�ڵڶ����±ꡣע�������±�ķ�Χ�� 1 �� n�������� 0 ��ͷ��

	 ע������

	����Լ���ֻ��һ��𰸡�

	����
	���� numbers = [2, 7, 11, 15], target = 9, ���� [1, 2].
*/

public class Solution {
    /*
     * @param numbers : An array of Integer
     * @param target : target = numbers[index1] + numbers[index2]
     * @return : [index1 + 1, index2 + 1] (index1 < index2)
     */
    public int[] twoSum(int[] numbers, int target) {
    	ArrayList<Integer> list = new ArrayList<>();
    	int[] res = new int[2];
    	for(int sub:numbers)
    		list.add(sub);
    	for(int i=0;i<numbers.length;i++){
    		int tem  = target-list.get(i);
    		if(list.contains(target-list.get(i))){
    			res[0] = i+1;
    			res[1] = list.lastIndexOf(target-list.get(i))+1;
    			break;
    		}
   
    	}
    	return res;
    }
}