    /**
		������άƽ���ϵ�n���㣬������ж��ٵ���ͬһ��ֱ���ϡ�

		����
		����4���㣺(1, 2), (3, 6), (0, 0), (1, 3)��

		һ��ֱ���ϵĵ������3����
	*/
	
	/**
     * http://www.programcreek.com/2014/04/leetcode-max-points-on-a-line-java/
     * http://bookshadow.com/weblog/2014/10/16/leetcode-max-points-line/
     * ˼·Ϊ��ö�����i�����յ�j�����μ���i��j��б�ʣ�ͳ��б����ͬ�ĵ�ĸ��������ֵ��������Ҫ��������յ��غϵ��������
     * @param points
     * @return
     */
    public static int maxPoints(Point[] points) {
        if(points==null||points.length==0)
            return 0;
        int maxres = 0;
        HashMap<Double,Integer> map = new HashMap<>();
        for(int i=0;i<points.length;i++){
            int duplicate = 0;
            int vertical = 0;
            for(int j=i+1;j<points.length;j++){

                if(points[i].x==points[j].x){
                    if(points[i].y==points[j].y)
                        duplicate++;
                    else
                        vertical++;
                }else{
                    double slope = (1.0 * (points[j].y - points[i].y))
                            / (points[j].x - points[i].x);
                    if(map.containsKey(slope))
                        map.put(slope,map.get(slope)+1);
                    else
                        map.put(slope,1);
                }
            }

            for(int sub:map.values()){
                if(sub+duplicate+1>maxres)
                    maxres = sub+duplicate+1;
            }
            maxres = Math.max(vertical+duplicate+1,maxres);
            map.clear();

        }
        return maxres;
    }