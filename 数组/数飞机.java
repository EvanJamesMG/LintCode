	/**
		给出飞机的起飞和降落时间的列表，用 interval 序列表示. 请计算出天上同时最多有多少架飞机？
		注意事项
		
		如果多架飞机降落和起飞在同一时刻，我们认为降落有优先权。
		
		样例
		对于每架飞机的起降时间列表：[[1,10],[2,3],[5,8],[4,7]], 返回3。
	*/
   /**
     * 见到网上一些基于interval排序的做法，我觉得这道题还可以用HashMap来做，这样空间换时间，降低了时间复杂度。
     * 首先，每个x对应HashMap的key， 比如在Interval (1, 5)这段有飞机飞过，那么说明在时间点为(1, 2, 3, 4, 5)的时候，各有一架飞机在空中，
     * 也就是说HashMap中可以存入(key, value)分别为(1, 1,), (2, 1,), (3, 1,), (4, 1,), (5, 1,)的 (key, value) pair。
     * 其次，注意到题目说的，If landing and flying happens at the same time, we consider landing should happen at first.
     * 也就是说，interval(1, 5)这段和interval (5, 9)这段如果都有飞机飞过，在5这个点上，依然只能算作只有个一个飞机飞过。
     * 所以上面的(key, value) pari要修正一下。之前是把[interva.start, interval.end]的左闭右闭区间中的所有点放入HashMap,现在考虑到landing这个条件，
     * 应该只把[interva.start, interval.end)的左闭右开区间的所有点放入HashMap.
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