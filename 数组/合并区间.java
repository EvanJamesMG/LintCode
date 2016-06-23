/**
给出若干闭合区间，合并所有重叠的部分。

样例
给出的区间列表 => 合并后的区间列表：

[                     [
  [1, 3],               [1, 6],
  [2, 6],      =>       [8, 10],
  [8, 10],              [15, 18]
  [15, 18]            ]
]
*/

/**
 * Definition of Interval:
 * public class Interval {
 *     int start, end;
 *     Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 */

class CustomComparator implements java.util.Comparator<Interval> {
    @Override
    public int compare(Interval a, Interval b) {
            return Integer.compare(a.start, b.start);
    }
}
class Solution {
    /**
     * @param intervals, a collection of intervals
     * @return: A new sorted interval list.
     */
    public List<Interval> merge(List<Interval> intervals) {
        // write your code here
        List<Interval> res = new ArrayList<>();
        if(intervals==null || intervals.size()==0)
            return res;
        Collections.sort(intervals,new CustomComparator());
        res.add(intervals.get(0));
        for(int i=1;i<intervals.size();i++){
            if(res.get(res.size()-1).end<intervals.get(i).start) {
                res.add(intervals.get(i));
            }else{
                int start  = Math.min(res.get(res.size()-1).start,intervals.get(i).start);
                int end = Math.max(res.get(res.size()-1).end, intervals.get(i).end);
                Interval tem = new Interval(start,end);
                res.set(res.size()-1,tem);
            }
        }
        return res;
    }
}