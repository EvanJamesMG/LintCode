/**
����һ����n������������S����S���ҵ���������a, b, c���ҵ�����ʹ��a + b + c = 0����Ԫ�顣

 ע������

����Ԫ��(a, b, c)��Ҫ��a <= b <= c��

������ܰ����ظ�����Ԫ�顣

����
��S = {-1 0 1 2 -1 -4}, ����Ҫ���ص���Ԫ�鼯�ϵ��ǣ�

(-1, 0, 1)

(-1, -1, 2)
*/
public class Solution {
    /**
     * @param numbers : Give an array numbers of n integer
     * @return : Find all unique triplets in the array which gives the sum of zero.
     */
    public ArrayList<ArrayList<Integer>> threeSum(int[] numbers) {
        // write your code here
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        Arrays.sort(numbers);
        for(int i=0;i<numbers.length;i++){

            int target = -numbers[i];
            int left = i+1;
            int right = numbers.length-1;
            while (left<right){
                ArrayList<Integer> tem = new ArrayList<>();
                tem.add(numbers[i]);
                if(numbers[left]+numbers[right]==target){
                    tem.add(numbers[left]);
                    tem.add(numbers[right]);
                    if(!res.contains(tem))
                        res.add(tem);
                    left++;
                    right--;
                }else if(numbers[left]+numbers[right]>target){
                    right--;
                }else {
                    left++;
                }
            }
        }
        return  res;
    }
}