    /**
	   给定一个只包含字母的字符串，按照先小写字母后大写字母的顺序进行排序。

		 注意事项

		小写字母或者大写字母他们之间不一定要保持在原始字符串中的相对位置。

		样例
		给出"abAcD"，一个可能的答案为"acbAD"
		
		挑战 
		  在原地扫描一遍完成
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