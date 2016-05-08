/*
 *难度挺大的 leetcode是hard难度 
 这道题不仅要insert newInterval同时还要保证能够merge。那么就分情况讨论。

遍历每一个已给出的interval，

1)当当前的interval的end小于newInterval的start时，说明新的区间在当前遍历到的区间的后面，并且没有重叠，
   所以res添加当前的interval；

2）当当前的interval的start大于newInterval的end时，说明新的区间比当前遍历到的区间要前面，并且也没有重叠， 
   所以把newInterval添加到res里，并更新newInterval为当前的interval； 

3）当当前的interval与newInterval有重叠时，merge interval并更新新的newInterval为merge后的。
 */
 
 
/*
给出一个无重叠的按照区间起始端点排序的区间列表。

在列表中插入一个新的区间，你要确保列表中的区间仍然有序且不重叠（如果有必要的话，可以合并区间）。

样例
插入区间[2, 5] 到 [[1,2], [5,9]]，我们得到 [[1,9]]。

插入区间[3, 4] 到 [[1,2], [5,9]]，我们得到 [[1,2], [3,4], [5,9]]。
*/

/**
 * Definition of Interval:
 * public classs Interval {
 *     int start, end;
 *     Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 */

class Solution {
    /**
     * Insert newInterval into intervals.
     * @param intervals: Sorted interval list.
     * @param newInterval: A new interval.
     * @return: A new sorted interval list.
     */
    public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
        ArrayList<Interval> res = new ArrayList<Interval>();
            
        for(Interval each: intervals){
            if(each.end < newInterval.start){
                res.add(each);
            }else if(each.start > newInterval.end){
                res.add(newInterval);
                newInterval = each;        
            }else if(each.end >= newInterval.start || each.start <= newInterval.end){
                int nstart = Math.min(each.start, newInterval.start);
                int nend = Math.max(newInterval.end, each.end);
                newInterval = new Interval(nstart, nend);
            }
        }
 
        res.add(newInterval); 
 
        return res;
    }
}