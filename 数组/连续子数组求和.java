
/**
����һ���������飬���ҳ�һ�����������飬ʹ�ø�������ĺ���������ʱ����ֱ𷵻ص�һ�����ֺ����һ�����ֵ��±ꡣ�����������ͬ�Ĵ𰸣��뷵����������һ����

����
���� [-3, 1, 3, -3, 4], ����[1,4].
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