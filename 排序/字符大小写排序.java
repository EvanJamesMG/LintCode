    /**
	   ����һ��ֻ������ĸ���ַ�����������Сд��ĸ���д��ĸ��˳���������

		 ע������

		Сд��ĸ���ߴ�д��ĸ����֮�䲻һ��Ҫ������ԭʼ�ַ����е����λ�á�

		����
		����"abAcD"��һ�����ܵĴ�Ϊ"acbAD"
		
		��ս 
		  ��ԭ��ɨ��һ�����
	*/
	
	public static void sortLetters(char[] chars) {
        //write your code here
        int index = 0;
        for(int i=0;i<chars.length;i++){
            if(chars[i]>='a'&&chars[i]<='z'){
                swap(chars,index,i);
                index++;
            }
        }
        index++;
    }

    private static void swap(char[] chars, int index, int i) {
        char tem = chars[index];
        chars[index] = chars[i];
        chars[i] = tem;
    }