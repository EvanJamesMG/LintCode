/*
����һ���ַ���s����s�ָ��һЩ�Ӵ���ʹÿ���Ӵ����ǻ��ġ�

����s����Ҫ��ĵ����ٷָ������

����
���磬�����ַ���s = "aab"��

���� 1�� ��Ϊ����һ�ηָ���Խ��ַ���s�ָ��["aa","b"]�������������Ӵ�
*/

/*
 ����Ϊhard�Ѷ�
http://www.cnblogs.com/springfor/p/3891896.html

��������dp���� cuts[len+1]��cuts[i]��ʾ�ӵ�iλ�õ���lenλ�ã���������[i, len])���и�������lenλ��Ϊ�գ���

 ��ʼʱ����len-i�������������aab��cuts[0]=3����������ÿһ���ַ������иa|a|b|' '��cuts[1] = 2, ����i=1λ�ÿ�ʼ��a|b|' '��

 cuts[2] = 1 b|' '��cuts[3]=0,����lenλ�ã�Ϊ���ַ�������Ҫ�и

 

 ��������cuts������������������Сcuts�ġ�

 

 ����Ҫһ��dp��ά����matrixs[i][j]��ʾ�ַ���[i,j]�ӵ�i��λ�ã�����������j��λ�ã������� �Ƿ��ǻ��ġ�

 ����ж��ַ���[i,j]�ǲ��ǻ��ģ�

 1. matrixs[i+1][j-1]�ǻ����� s.charAt(i) == s.charAt(j)��

 2. i==j��i��j����һ���ַ���

 3. j=i+1��i��j���ڣ���s.charAt(i) == s.charAt(j)

 

 ���ַ���[i,j]�ǻ��ĺ�˵���ӵ�i��λ�õ��ַ�����lenλ�õ���Сcut�����Ա������ˣ�

 ��ô���Ǵ�j+1λ�ÿ�ʼ����lenλ�õ���Сcut������[i,j]|[j+1,len - 1]�м����һcut��

 ����Math.min(cuts[i], cuts[j+1]+1) 

 ��󷵻�cuts[0]-1���Ѷ���ӵ��Ǹ����ڵ�lenλ�õ��и�ȥ������Ϊ���ս����
 */
 
 

public class Solution {
    /**
     * @param s a string
     * @return an integer
     */
    public int minCut(String s) {
        // write your code here
        int min = 0;  
        int len = s.length();  
        boolean[][] matrix = new boolean[len][len];  
        int cuts[] = new int[len+1];  
          
        if (s == null || s.length() == 0)  
            return min;  
         
        for (int i=0; i<len; ++i){  
            cuts[i] = len - i;  //cut nums from i to len [i,len]
        }  
          
        for (int i=len-1; i>=0; --i){  
            for (int j=i; j<len; ++j){  
                if ((s.charAt(i) == s.charAt(j) && (j-i<2))  
                        || (s.charAt(i) == s.charAt(j) && matrix[i+1][j-1]))  
                {  
                    matrix[i][j] = true;  
                    cuts[i] = Math.min(cuts[i], cuts[j+1]+1);  
                }  
            }  
        }  
        min = cuts[0]-1;  
        return min;  
    }
};