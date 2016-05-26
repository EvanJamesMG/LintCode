/**

��һ������ n ������������ S, �ҵ������������ target ��ӽ�����Ԫ�飬�������������ĺ͡�

 ע������

	ֻ��Ҫ������Ԫ��֮�ͣ����践����Ԫ�鱾��

	����
	���� S = [-1, 2, 1, -4] and target = 1. ����ӽ� 1 ����Ԫ���� -1 + 2 + 1 = 2.
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
