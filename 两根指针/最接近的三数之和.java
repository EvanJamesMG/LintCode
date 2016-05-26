/**

给一个包含 n 个整数的数组 S, 找到和与给定整数 target 最接近的三元组，返回这三个数的和。

 注意事项

	只需要返回三元组之和，无需返回三元组本身

	样例
	例如 S = [-1, 2, 1, -4] and target = 1. 和最接近 1 的三元组是 -1 + 2 + 1 = 2.
*/

public class Solution {
    /**
     * @param numbers: Give an array numbers of n integer
     * @param target : An integer
     * @return : return the sum of the three integers, the sum closest target.
     */
    public int threeSumClosest(int[] numbers ,int target) {
        int minnum = Integer.MAX_VALUE;
        int res = 0;
        Arrays.sort(numbers);
        for(int i=0;i<numbers.length;i++){
            int newtarget = target-numbers[i];
            int left = i+1;
            int right = numbers.length-1;
            while (left<right){
                if(Math.abs(numbers[i] + numbers[left] + numbers[right] - target)<minnum) {
                    minnum = Math.abs(numbers[i] + numbers[left] + numbers[right] - target);
                    res = numbers[i] + numbers[left] + numbers[right];
                }
                if(numbers[left]+numbers[right]==newtarget){
                    return numbers[i] + numbers[left] + numbers[right];
                }else if(numbers[left]+numbers[right]>newtarget){
                    right--;
                }else {
                    left++;
                }
            }
        }
        return  res;
    }
}
