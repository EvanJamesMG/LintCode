/**
�� n ��Ӳ���ų�һ���ߡ������������������ұ��������� 1 �� 2 ��Ӳ�ң�ֱ��û��Ӳ��Ϊֹ���õ����һöӲ�ҵ��˻�ʤ��

���ж� ��һ����� ���仹��Ӯ��

����
n = 1, ���� true.

n = 2, ���� true.

n = 3, ���� false.

n = 4, ���� true.

n = 5, ���� true.
*/

/*
      ��������һ���õ�ʱ�򣬵���һ�����õ���1ʱ���ڶ������õľ���2������һ�����õ���2ʱ���ڶ������õľ���1��
      ����һ����ȡ��ֵ��3.��������һ����3Ϊ���ڵ����У���ֻʣ����Ӳ�ҵ�ʱ�򣬲�ɵҲ֪����ô�õġ����£�ֱ�Ӷ�ֻ����öӲ�ҵ�������Ǽ��ɡ�
    n = 1, ���� true.
    n = 2, ���� true.
    n = 3, ���� false.
 */
public class Solution {
    /**
     * @param n: an integer
     * @return: a boolean which equals to true if the first player will win
     */
    public boolean firstWillWin(int n) {
        // write your code here
        return (n%3!=0);
    }
}