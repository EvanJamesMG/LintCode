	/**
		�����ɻ�����ɺͽ���ʱ����б��� interval ���б�ʾ. ����������ͬʱ����ж��ټܷɻ���
		ע������
		
		�����ܷɻ�����������ͬһʱ�̣�������Ϊ����������Ȩ��
		
		����
		����ÿ�ܷɻ�����ʱ���б�[[1,10],[2,3],[5,8],[4,7]], ����3��
	*/
   /**
     * ��������һЩ����interval������������Ҿ�������⻹������HashMap�����������ռ任ʱ�䣬������ʱ�临�Ӷȡ�
     * ���ȣ�ÿ��x��ӦHashMap��key�� ������Interval (1, 5)����зɻ��ɹ�����ô˵����ʱ���Ϊ(1, 2, 3, 4, 5)��ʱ�򣬸���һ�ܷɻ��ڿ��У�
     * Ҳ����˵HashMap�п��Դ���(key, value)�ֱ�Ϊ(1, 1,), (2, 1,), (3, 1,), (4, 1,), (5, 1,)�� (key, value) pair��
     * ��Σ�ע�⵽��Ŀ˵�ģ�If landing and flying happens at the same time, we consider landing should happen at first.
     * Ҳ����˵��interval(1, 5)��κ�interval (5, 9)���������зɻ��ɹ�����5������ϣ���Ȼֻ������ֻ�и�һ���ɻ��ɹ���
     * ���������(key, value) pariҪ����һ�¡�֮ǰ�ǰ�[interva.start, interval.end]������ұ������е����е����HashMap,���ڿ��ǵ�landing���������
     * Ӧ��ֻ��[interva.start, interval.end)������ҿ���������е����HashMap.
     * @param airplanes
     * @return
     */
    public int countOfAirplanes(List<Interval> airplanes) {
        // write your code here
        int max = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        if(airplanes==null||airplanes.size()==0)
            return max;
        for(Interval sub:airplanes){
            for(int i=sub.start;i<sub.end;i++){
                if(map.containsKey(i))
                    map.put(i,map.get(i)+1);
                else
                    map.put(i,1);
                max = Math.max(max,map.get(i));
            }
        }
        return max;
    }