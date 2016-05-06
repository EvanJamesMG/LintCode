/*
����һ���ַ��� A, ��ʾһ�� n λ������, ɾ������ k λ����, ʹ��ʣ���������Ȼ����ԭ����˳�����в���һ���µ���������

�ҵ�ɾ�� k ������֮�����С��������

N <= 240, k <= N

����
����һ���ַ�������������� A ��һ������ k, ���� A = 178542, k = 4

����һ���ַ��� "12"
*/
/*˼·��
   ÿ��ɾ��һ����ĸ���Ӹ�λ����λ��
   ����s[i]>s[i+1]ʱ������iλӦ��ɾ����ͬ������굽ʹ�������������������ܵĴ�
   ע��������������ǰ׺0
 */ 
public class Solution {
    /**
     *@param A: A positive integer which has N digits, A is a string.
     *@param k: Remove k digits.
     *@return: A string
     */
    public String DeleteDigits(String A, int k) {
        String temp = A;  
        while(k>0){  
        	k--;
            int i=0;  
            while(i<temp.length()-1&&temp.charAt(i)<=temp.charAt(i+1))  
                i++;  
            temp = temp.substring(0,i)+temp.substring(i+1,temp.length());  
        }  
        int i = 0;  
        while(i<temp.length()&&temp.charAt(i)=='0')  
            i++;  
        String ret = temp.substring(i,temp.length());  
        return ret;  
    }
}