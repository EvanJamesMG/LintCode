/**
дһ���㷨���ж�һ�����ǲ���"������"��

һ�����ǲ��ǿ�������ô����ģ�����һ����������ÿһ�ν������滻Ϊ��ÿ��λ���ϵ����ֵ�ƽ���ͣ�Ȼ���ظ��������ֱ���������Ϊ1����������ѭ����ʼ�ձ䲻��1��
������Ա�Ϊ1����ô��������ǿ�������

����
19 ����һ����������

1^2 + 9^2 = 82
8^2 + 2^2 = 68
6^2 + 8^2 = 100
1^2 + 0^2 + 0^2 = 1
*/

public class Solution {
    /**
     * @param n an integer
     * @return true if this is a happy number or false
     */
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        while (n!=1&&!set.contains(n)){
            set.add(n);
            int sum = 0;
            while(n>0){
                int tem = n%10;
                sum+=Math.pow(tem,2);
                n/=10;
            }
            n =sum;
        }
        return n==1;
    }
}