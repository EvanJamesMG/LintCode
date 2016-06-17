/**
给定一个单链表L: L0→L1→…→Ln-1→Ln,

重新排列后为：L0→Ln→L1→Ln-1→L2→Ln-2→…

必须在不改变节点值的情况下进行原地操作。

样例
给出链表 1->2->3->4->null，重新排列后为1->4->2->3->null。
 */ 
public class Solution {
    /**
     * @param head: The head of linked list.
     * @return: void
     */
    public void reorderList(ListNode head) {  
        
        if(head==null||head.next==null)
            return;
        ListNode slow = head;
        ListNode fast = head;
        ListNode p1 = head;
        ListNode p2;
        ListNode dummynode = new ListNode(0);
        ListNode res = dummynode;
        while(fast.next!=null&&fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        p2 = slow.next;
        slow.next = null;
        p2 = reverse(p2);
        while(p1!=null&&p2!=null){
            ListNode p1tem = p1.next;
            p1.next = p2;
            ListNode p2tem = p2.next;
            p2.next = p1tem;
            p1 = p1tem;
            p2 = p2tem;
        }

    }
    public static ListNode reverse(ListNode head) {
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
