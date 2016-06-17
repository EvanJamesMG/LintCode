/**
翻转一个链表

样例
给出一个链表1->2->3->null，这个翻转后的链表为3->2->1->null
 */ 
public class Solution {
    /**
     * @param head: The head of linked list.
     * @return: The new head of reversed linked list.
     */
    public ListNode reverse(ListNode head) {
        // write your code here
        if(head==null||head.next==null)
            return head;
        ListNode pre = null;
        while (head!=null){
            ListNode tem = head.next;
            head.next = pre;
            pre = head;
            head = tem;
        }
        return pre;
    }
}
