
/**
给定一个整数数组，请找出一个连续子数组，使得该子数组的和最大。输出答案时，请分别返回第一个数字和最后一个数字的下标。（如果两个相同的答案，请返回其中任意一个）

样例
给定 [-3, 1, 3, -3, 4], 返回[1,4].
*/
public class Solution {
    /**
     * @param A an integer array
     * @return  A list of integers includes the index of the first number and the index of the last number
     */
    public ArrayList<Integer> continuousSubarraySum(int[] A) {
        // Write your code here
        if(A==null||A.length==0)
            return new ArrayList<Integer>();
        int maxsum = Integer.MIN_VALUE;
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        int left=0,right = 0;
        int sum=0;
        while(right<=A.length-1){
            sum+=A[right];                
            if(sum>maxsum){
                maxsum = sum;
                ArrayList<Integer>  index = new ArrayList<>();
                index.add(left);
                index.add(right);
                map.put(sum,index);
            } 
            if(sum<0){
                right++;
                left = right;
                sum=0;
            }else{
                right++;
            }
        }
        return map.get(maxsum);
    }
}