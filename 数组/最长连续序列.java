	/**
		����һ��δ������������飬�ҳ���������еĳ��ȡ�

		˵��
		Ҫ������㷨���Ӷ�ΪO(n)

		����
		��������[100, 4, 200, 1, 3, 2]������������������ [1, 2, 3, 4]���������󳤶� 4
	*/
	
	
	/**
     * �������������뼯���У�Ȼ���ٱ�����Щ������Ϊ������O(1)���ж�ĳ�����Ƿ��ڼ����У��������ǿ���һ�������ϻ������¼�顣
     * Ϊ�˱���֮���ظ���飬����ÿ�鵽һ��������Ҫ����Ӽ������Ƴ�������ÿ����һ������������������±߽磬�����ҳ�����������С�
     * ʱ�临�Ӷ�����O(N)����Ϊ���ǲ����鲻������������������������������Ҳֻ����һ�Ρ�
     */
    public static int longestConsecutive(int[] num) {
        // write you code here
        if(num==null||num.length==0)
            return 0;
        HashSet<Integer> set = new HashSet<>();
        int maxlen = 0;
        for(int sub:num)
            set.add(sub);
        for(int sub:num){
            int cur = sub,len = 0;
            //���ϼ��
            while(set.contains(cur)){
                len++;
                set.remove(cur);
                cur++;
            }
            //���¼��
            cur = sub-1;
            while(set.contains(cur)){
                len++;
                set.remove(cur);
                cur--;
            }
            maxlen = Math.max(maxlen,len);
        }
        return maxlen;
    }