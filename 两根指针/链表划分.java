/**
   ����һ�����������ֵx����������ʹ������С��x�Ľڵ����ڴ��ڵ���x�Ľڵ�֮ǰ��

	��Ӧ�ñ���������������ڵ�ԭ�е����˳��

	����
	�������� 1->4->3->2->5->2->null������ x=3

	���� 1->2->2->4->3->5->null
 */ 
public class Solution {
    /**
     * @param head: The first node of linked list.
     * @param x: an integer
     * @return: a ListNode 
     */
    public ListNode partition(ListNode head, int x) {
        ListNode dummyone = new ListNode(0);
        ListNode dummytwo = new ListNode(0);
        ListNode cydummyone = dummyone;
        ListNode cydummytwo = dummytwo;


        while (head!=null){
            if(head.val<x) {
                cydummyone.next = new ListNode(head.val);
                cydummyone = cydummyone.next;
            }else{
                cydummytwo.next = new ListNode(head.val);
                cydummytwo = cydummytwo.next;
            }
            head = head.next;
        }
        cydummyone.next = dummytwo.next;
        cydummytwo.next = null;
        return dummyone.next;
    }
}
