/**
给一个包含n个数的整数数组S，在S中找到所有使得和为给定整数target的四元组(a, b, c, d)。

 注意事项

	四元组(a, b, c, d)中，需要满足a <= b <= c <= d

	答案中不可以包含重复的四元组。

	样例
	例如，对于给定的整数数组S=[1, 0, -1, 0, -2, 2] 和 target=0. 满足要求的四元组集合为：

	(-1, 0, 0, 1)

	(-2, -1, 1, 2)

	(-2, 0, 0, 2)
*/

public class Solution {
    /**
     * @param numbers : Give an array numbersbers of n integer
     * @param target : you need to find four elements that's sum of target
     * @return : Find all unique quadruplets in the array which gives the sum of
     *           zero.
     */
    public ArrayList<ArrayList<Integer>> fourSum(int[] numbers, int target) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        Arrays.sort(numbers);
        for(int i=0;i<numbers.length;i++){
            int[] cynumbers = Arrays.copyOfRange(numbers,i+1,numbers.length);
            ArrayList<ArrayList<Integer>> temres = threeSum(cynumbers,target - numbers[i]);
            if(temres!=null){
                for(ArrayList<Integer> sub:temres){
                    ArrayList<Integer> tem = new ArrayList<>();
                    tem.add(numbers[i]);
                    tem.addAll(sub);
                    if(!res.contains(tem))
                        res.add(tem);
                }
            }
        }
        return res;
    }

    public static ArrayList<ArrayList<Integer>> threeSum(int[] numbers,int target) {
        // write your code here
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        Arrays.sort(numbers);
        for(int i=0;i<numbers.length;i++){

            int newtarget = target-numbers[i];
            int left = i+1;
            int right = numbers.length-1;
            while (left<right){
                ArrayList<Integer> tem = new ArrayList<>();
                tem.add(numbers[i]);
                if(numbers[left]+numbers[right]==newtarget){
                    tem.add(numbers[left]);
                    tem.add(numbers[right]);
                    if(!res.contains(tem))
                        res.add(tem);
                    left++;
                    right--;
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