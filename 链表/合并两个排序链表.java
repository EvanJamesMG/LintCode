/**
将两个排序链表合并为一个新的排序链表

样例
给出 1->3->8->11->15->null，2->null， 返回 1->2->3->8->11->15->null。
 */ 
public class Solution {
    /**
     * @param ListNode l1 is the head of the linked list
     * @param ListNode l2 is the head of the linked list
     * @return: ListNode head of linked list
     */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ArrayList<Integer> input = new ArrayList<>();
        ListNode dummynode = new ListNode(0);
        ListNode p1 = dummynode;
        while(l1!=null){
            input.add(l1.val);
            l1 = l1.next;
        }
        while (l2!=null){
            input.add(l2.val);
            l2 = l2.next;
        }
        Collections.sort(input);
        for(int sub:input){
            p1.next = new ListNode(sub);
            p1 = p1.next;
        }
        return dummynode.next;
    }
}