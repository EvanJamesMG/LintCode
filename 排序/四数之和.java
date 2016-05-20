/**
��һ������n��������������S����S���ҵ�����ʹ�ú�Ϊ��������target����Ԫ��(a, b, c, d)��

 ע������

	��Ԫ��(a, b, c, d)�У���Ҫ����a <= b <= c <= d

	���в����԰����ظ�����Ԫ�顣

	����
	���磬���ڸ�������������S=[1, 0, -1, 0, -2, 2] �� target=0. ����Ҫ�����Ԫ�鼯��Ϊ��

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