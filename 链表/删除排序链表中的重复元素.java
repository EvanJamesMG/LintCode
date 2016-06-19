/**
	����һ����������ɾ�������ظ���Ԫ��ÿ��Ԫ��ֻ����һ����

	����
	���� 1->1->2->null������ 1->2->null

	���� 1->1->2->3->3->null������ 1->2->3->null
 */
public class Solution {
    /**
     * @param ListNode head is the head of the linked list
     * @return: ListNode head of linked list
     */
    public static ListNode deleteDuplicates(ListNode head) { 
        // write your code here
        if(head==null)
            return null;
        ListNode dummy = new ListNode(0);
        ListNode p1 = dummy;
        while(head!=null){
            p1.next = new ListNode(head.val);
            p1 = p1.next;
            while(head.next!=null) {
                if(head.val==head.next.val)
                    head = head.next;
                else{
                    break;
                }
            }
            head = head.next;
        }
        return dummy.next;
    }  
}