/**
�õݹ�ķ����ҵ���1������Nλ������

 ע������

���������ַ�ʽȥ�ݹ���ʵ�����ף�

recursion(i) {
    if i > largest number:
        return
    results.add(i)
    recursion(i + 1)
}
�������ַ�ʽ��ķѺܶ�ĵݹ�ռ䣬���¶�ջ��������ܹ��������ķ�ʽ���ݹ�ʹ�õݹ��������ֻ�� N ��ô��

����
���� N = 1, ����[1,2,3,4,5,6,7,8,9].

���� N = 2, ����[1,2,3,4,5,6,7,8,9,10,11,...,99].

��ս 
�õݹ���ɣ�����ѭ���ķ�ʽ��

*/


public class Solution {
    /**
     * @param n: An integer.
     * return : An array storing 1 to the largest number with n digits.
     */
    public List<Integer> numbersByRecursion(int n) {
        List<Integer> res = new ArrayList<>();
        if(n<=0)
            return res;
        if(n==1){
            for(int i=1;i<=9;i++)
                res.add(i);
            return res;
        }
        List<Integer> preres = numbersByRecursion(n-1);
        res.addAll(preres);

        for(int i=1;i<=9;i++){
            res.add((int) Math.pow(10,n-1)*i);
            for(int sub:preres){
                res.add((int) Math.pow(10,n-1)*i+sub);
            }
        }

        return res;
    }
}