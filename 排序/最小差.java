	/*
	给定两个整数数组（第一个是数组 A，第二个是数组 B），在数组 A 中取 A[i]，数组 B 中取 B[j]，A[i] 和 B[j]两者的差越小越好(|A[i] - B[j]|)。返回最小差。

	样例
	给定数组 A = [3,4,6,7]， B = [2,3,8,9]，返回 0。

	挑战 
	时间复杂度 O(n log n)
	*/
	
	/**
	 * 到时间复杂度(nlogn)就想到遍历A数组然后对B数组进行二分查找，二分查找手写
	 * @param A
	 * @param B
	 * @return
	 */
    public static int smallestDifference(int[] A, int[] B) {
        // write your code here
    	int res = Integer.MAX_VALUE;
    	Arrays.sort(B);
    	for(int sub:A){
    		int index = IndexInB(sub,B);
    		int tem = 0;
    		if(index ==0){
    			tem = Math.abs(sub-B[index]);
    		}else if (index == B.length-1) {
    			tem = Math.abs(sub-B[index]);
    		}else if (index == B.length) {
    			tem = Math.abs(sub-B[B.length-1]);
			}else{
				tem = Math.min(Math.abs(sub-B[index]),Math.min(Math.abs(sub-B[index-1]), Math.abs(sub-B[index+1])));
			}
    		res= Math.min(res, tem);
    	}
		return res;
    }

	private static int IndexInB(int sub, int[] b) {
		// TODO Auto-generated method stub
		
		int left = 0;
		int right = b.length-1;
		int mid = 0;
		while(left<=right){
			mid = (left+right)/2;
			if(b[mid]==sub){
				return mid;
			}else if (b[mid]>sub){
				right = mid-1;
			}else{
				left = mid+1;
			}
		}
		return left;
	}