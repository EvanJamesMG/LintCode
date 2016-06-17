/**
	给一个链表，两两交换其中的节点，然后返回交换后的链表。

	您在真实的面试中是否遇到过这个题？ Yes
	样例
	给出 1->2->3->4, 你应该返回的链表是 2->1->4->3。
 */
public class Solution {
    /**
     * @param head a ListNode
     * @return a ListNode
     */
    public ListNode swapPairs(ListNode head) {
        if(head==null||head.next==null)
            return head;
        ListNode tem = head.next;
        ListNode forward = head.next.next;

        tem.next = head;

        head.next = swapPairs(forward);
        return tem;
    }
}