/**
	��һ�����������������еĽڵ㣬Ȼ�󷵻ؽ����������

	������ʵ���������Ƿ�����������⣿ Yes
	����
	���� 1->2->3->4, ��Ӧ�÷��ص������� 2->1->4->3��
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