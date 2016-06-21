/**
给出一个有n个整数的数组S，在S中找到三个整数a, b, c，找到所有使得a + b + c = 0的三元组。

 注意事项

在三元组(a, b, c)，要求a <= b <= c。

结果不能包含重复的三元组。

样例
如S = {-1 0 1 2 -1 -4}, 你需要返回的三元组集合的是：

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