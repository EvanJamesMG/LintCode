/*
 *�Ѷ�ͦ��� leetcode��hard�Ѷ� 
 ����ⲻ��Ҫinsert newIntervalͬʱ��Ҫ��֤�ܹ�merge����ô�ͷ�������ۡ�

����ÿһ���Ѹ�����interval��

1)����ǰ��interval��endС��newInterval��startʱ��˵���µ������ڵ�ǰ������������ĺ��棬����û���ص���
   ����res��ӵ�ǰ��interval��

2������ǰ��interval��start����newInterval��endʱ��˵���µ�����ȵ�ǰ������������Ҫǰ�棬����Ҳû���ص��� 
   ���԰�newInterval��ӵ�res�������newIntervalΪ��ǰ��interval�� 

3������ǰ��interval��newInterval���ص�ʱ��merge interval�������µ�newIntervalΪmerge��ġ�
 */
 
 
/*
����һ�����ص��İ���������ʼ�˵�����������б�

���б��в���һ���µ����䣬��Ҫȷ���б��е�������Ȼ�����Ҳ��ص�������б�Ҫ�Ļ������Ժϲ����䣩��

����
��������[2, 5] �� [[1,2], [5,9]]�����ǵõ� [[1,9]]��

��������[3, 4] �� [[1,2], [5,9]]�����ǵõ� [[1,2], [3,4], [5,9]]��
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