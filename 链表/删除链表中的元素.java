/**
	删除链表中等于给定值val的所有节点。

	样例
	给出链表 1->2->3->3->4->5->3, 和 val = 3, 你需要返回删除3之后的链表：1->2->4->5。
 */
public class Solution {
    /**
     * @param head a ListNode
     * @param val an integer
     * @return a ListNode
     */
    public ListNode removeElements(ListNode head, int val) {
        if(head==null)
            return null;
        ListNode dummy = new ListNode(0);
        ListNode p1 = dummy;
        while(head!=null){
            if(head.val!=val){
                p1.next = new ListNode(head.val);
                p1 = p1.next;
            }
            head = head.next;
        }
        return dummy.next;
    }
}