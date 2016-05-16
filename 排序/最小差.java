	/*
	���������������飨��һ�������� A���ڶ��������� B���������� A ��ȡ A[i]������ B ��ȡ B[j]��A[i] �� B[j]���ߵĲ�ԽСԽ��(|A[i] - B[j]|)��������С�

	����
	�������� A = [3,4,6,7]�� B = [2,3,8,9]������ 0��

	��ս 
	ʱ�临�Ӷ� O(n log n)
	*/
	
	/**
	 * ��ʱ�临�Ӷ�(nlogn)���뵽����A����Ȼ���B������ж��ֲ��ң����ֲ�����д
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