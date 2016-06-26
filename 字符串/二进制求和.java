/**
	给定两个二进制字符串，返回他们的和（用二进制表示）。

	样例
	a = 11

	b = 1

	返回 100
*/
public class Solution {
    /**
     * @param a a number
     * @param b a number
     * @return the result
     */
    public String addBinary(String a, String b) {
        char[] A = a.toCharArray();
        char[] B = b.toCharArray();
        int maxlen = Math.max(A.length, B.length)-1;
        char[] newA = new char[maxlen];
        char[] newB = new char[maxlen];
        ArrayList<String> temres = new ArrayList<>();
        String res = "";
        if(A.length>B.length){
            newA = A;
            newB = new char[A.length];
            for(int i=0;i<A.length-B.length;i++)
                newB[i] = '0';
            for(int i=A.length-B.length;i<A.length;i++)
                newB[i] = B[i-(A.length-B.length)];
        }else if(B.length>A.length){
            newB = B;
            newA = new char[B.length];
            for(int i=0;i<B.length-A.length;i++)
                newA[i] = '0';
            for(int i = B.length-A.length;i<B.length;i++)
                newA[i] = A[i-(B.length-A.length)];
        }else{
            newA = A;
            newB = B;
        }
        int add = 0;
        for(int i=maxlen;i>=0;i--){
            int Anum = Integer.parseInt(newA[i]+"");
            int Bnum = Integer.parseInt(newB[i]+"");
            int tem = Anum+Bnum+add;
            if(tem>=2){
                tem = tem%2;
                add=1;
            }else{
                add = 0;
            }
            res+=tem;
        }
        if(add==1)
            res+=1;
        return new StringBuffer(res).reverse().toString();
    }
}