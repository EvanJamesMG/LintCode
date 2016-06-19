/**
合并k个排序链表，并且返回合并后的排序链表。尝试分析和描述其复杂度。
样例
给出3个排序链表[2->4->null,null,-1->null]，返回 -1->2->4->null
 */ 
public class Solution {
    /**
     * @param lists: a list of ListNode
     * @return: The head of one sorted list.
     */
    public ListNode mergeKLists(List<ListNode> lists) {  
        if(lists==null|| lists.size()==0)
            return null;
        ArrayList<Integer> input = new ArrayList<>();
        for(ListNode sub:lists){
            while(sub!=null){
                input.add(sub.val);
                sub = sub.next;
            }
        }
        Collections.sort(input);
        ListNode dummynode = new ListNode(0);
        ListNode p1 = dummynode;
        for(int sub:input){
            p1.next = new ListNode(sub);
            p1  = p1.next;
        }
        return dummynode.next;   
    }
}
