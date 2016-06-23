/**
	给一个整数数组，找到两个数使得他们的和等于一个给定的数 target。

	你需要实现的函数twoSum需要返回这两个数的下标, 并且第一个下标小于第二个下标。注意这里下标的范围是 1 到 n，不是以 0 开头。

	 注意事项

	你可以假设只有一组答案。

	样例
	给出 numbers = [2, 7, 11, 15], target = 9, 返回 [1, 2].
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