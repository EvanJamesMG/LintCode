    /**
     * ����ѭ���ݹ��������⡣
     *��������Ҫ��ȷ��ͳIP ��ַ�Ĺ����Ƿ�4��Part��ÿ��Part�Ǵ�0-255������

     *0-255�����֣�ת�����ַ�����ÿ��Part ������һ���ַ���ɣ������ַ���ɣ������������ַ���ɡ�

     *����ÿ����������˵�����3λ����1λ��������ÿһ�����ѭ��3�Σ���������Ρ�

     * ��ΪIP��ַ���4���ֶΣ���������3��ʱ��˵���Ѿ��������3�����ˣ���ô��ʣ��û������νӵ���β���ɡ�

     *���������Ҫ��֤����������ǺϷ��ģ����ƴ�ӵ�ʣ�����Ҳ�ǺϷ��ġ�

     *ע�⿪ͷ�����0�Ļ�Ҫ���⴦�������ͷ��0���ж��������ǲ���0�����ǵĻ����ַ����ǷǷ��ġ���Ϊ001��01���ǲ��Եġ�

     */
    public static ArrayList<String> restoreIpAddresses(String s) {
        // Write your code here
        ArrayList<String> res = new ArrayList<>();
        String tem = "";
        if(s.length()<4||s.length()>12)
            return res;
        dfs(s,0,tem,res);
        return res;
    }

    private static void dfs(String s, int startindex, String tem, ArrayList<String> res) {
        if(startindex==3&&isValid(s)) {
            res.add(tem + s);
            return;
        }

        for(int i=0;i<3&&i<s.length()-1;i++){
            String sub = s.substring(0,i+1);
            if(isValid(sub))
                dfs(s.substring(i+1,s.length()),startindex+1,tem+sub+".",res);
        }
    }

    private static boolean isValid(String s) {
        if(s.charAt(0)=='0')
            return s.equals("0");

        int tem = Integer.parseInt(s);
        if(tem>=0&&tem<=255)
            return true;
        else
            return false;
    }