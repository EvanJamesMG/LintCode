/**
	ɾ�������е��ڸ���ֵval�����нڵ㡣

	����
	�������� 1->2->3->3->4->5->3, �� val = 3, ����Ҫ����ɾ��3֮�������1->2->4->5��
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