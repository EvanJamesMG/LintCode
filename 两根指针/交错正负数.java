/**
   ����һ�������������͸����������飬�������г�һ����������������顣

	 ע������

	����Ҫ�������������߸�����ԭ����˳��

	����
	��������[-1, -2, -3, 4, 5, 6]����������֮�󣬱��[-1, 5, -2, 4, -3, 6]���������κ�����Ҫ��Ĵ�


 * �뵽���ݵ����⣬һ�㶼����������ָ�����������������ָ������ߣ���������ָ������ͬ�����ߣ�������������һ��ָ��ָ����һ�����ģ�
 * һ��ָ��ָ����һ�����ģ�Ȼ��ǰ��Ҫɶ���ŵģ��ͺ��Ǹ�ָ����н������ٵ���ָ�롣
 * /
class Solution {
    /**
     * @param A: An integer array.
     * @return: void
     */
    public void rerange(int[] A) {
       // write your code here
        if(A==null||A.length<=1)
            return;
        int posnum = 0;
        int negnum = 0;
        int cur = 0;
        int posindex = 0;
        int negindex = 0;
        int curpos = 0;
        //ͳ�������͸�������Ŀ
        for(int sub:A){
            if(sub>0)
                posnum++;
            if(sub<0)
                negnum++;
        }

        //ԭ�������ҵ���һ��������ţ���һ���������
        while(A[posindex]<0)
            posindex++;
        while(A[negindex]>0)
            negindex++;

        //���������Ŀ�󣬵�һ�����ֶ�Ӧ��������
        if(posnum>negnum)
            curpos = 1;
        while(cur<A.length){
            if(curpos==1){
                swap(A,cur,posindex);
                posindex++;
                while(posindex<A.length&&A[posindex]<0) posindex++;
                while(negindex<A.length&&A[negindex]>0) negindex++;
            }else{
                swap(A,cur,negindex);
                negindex++;
                while(posindex<A.length&&A[posindex]<0) posindex++;
                while(negindex<A.length&&A[negindex]>0) negindex++;
            }
            curpos = 1 - curpos;
            cur++;
        }
    }

    private static void swap(int[] A, int left, int right) {
        int tem = A[left];
        A[left] = A[right];
        A[right] = tem;
    }
}