/*
����һ���Ǹ��������飬�������λ������ĵ�һ��λ�á�

�����е�ÿ��Ԫ�ش��������Ǹ�λ�ÿ�����Ծ����󳤶ȡ�������

���Ŀ����ʹ�����ٵ���Ծ����������������һ��λ�á�

����
��������A = [2,3,1,1,4]�����ٵ����������һ��λ�õ���Ծ������2(�������±�0��һ���������±�1��Ȼ����3������������һ��λ�ã�һ����Ծ2��)
*/

public class Solution {
    /**
     * @param A: A list of lists of integers
     * @return: An integer
     */
    public int jump(int[] A) {
		int tem = A[0];
		int k=1;
		if(tem>=A.length)
			return k;
    	for(int i=0;i<A.length;i++){
    		int max = i+1+A[i+1];
    		int ori_i= i+1;
    		int label = 0 ;
    		int maxnum = 0;
    		//Ѱ�ҳ��ֽ׶οɴ�·���е����ֵ
    		for(int index=i+1;index<Math.min(ori_i+tem,A.length);index++){
    			if(index+A[index]>=max){	
    				label = index;
    				maxnum = A[index];  
    			}
    		}
    		//�ҳ������ֵ���ڵ������Ծ��
			i = label+maxnum;
			k++;
			if(i>=A.length-1)
				return k;
			tem = A[i];
			i--;

		}
    	return k;
    }
}