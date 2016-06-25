/**
	����ָ���ǣ��������е�������˳����б�����Ȼ��õ���һ������������ʾ��

		1, 11, 21, 1211, 111221, ...

		1 ���� "one 1" -> 11.

		11 ���� "two 1s" -> 21.

		21 ���� "one 2, then one 1" -> 1211.

		����һ������ n, ���� �� n ��˳��

		 ע������

		������˳�򽫱�ʾΪһ���ַ�����

		����
		���� n = 5, ���� "111221".
*/
public class Solution {
    /**
     * @param n the nth
     * @return the nth sequence
     */
    public String countAndSay(int n) {
        if(n<=0)
            return "";
        String curRes = "1";
        int start = 1;
        String res = "";
        while(start < n){
            int count = 1;
            res = "";
            for(int i=1;i<curRes.length();i++){
                if(curRes.charAt(i)==curRes.charAt(i-1))
                    count++;
                else{
                    res +=count;
                    res +=curRes.charAt(i-1);
                    count=1;
                }
            }
            res+=count;
            res+=curRes.charAt(curRes.length()-1);
            curRes =res;
            start++;
        }
        return curRes;
    }
}