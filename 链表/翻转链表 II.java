/**
��ת�����е�m���ڵ㵽��n���ڵ�Ĳ���

 ע������

m��n����1 �� m �� n �� ������

����
��������1->2->3->4->5->null�� m = 2 ��n = 4������1->4->3->2->5->null
 */
public class Solution {
    /**
     * @param ListNode head is the head of the linked list 
     * @oaram m and n
     * @return: The head of the reversed ListNode
     */
    public ListNode reverseBetween(ListNode head, int m , int n) {
        if(head==null|| head.next == null)
            return head;
        ListNode dummyone  = new ListNode(0);
        ListNode dummytwo = new ListNode(1);

        ListNode p1 = dummyone;
        ListNode p2 = dummytwo;
        ListNode p3 = null;
        int k=0;
        while(head !=null){
            k++;
            if(k<m) {
                dummyone.next = new ListNode(head.val);
                dummyone = dummyone.next;
                head = head.next;
            }

            if(k>=m&&k<=n){
                dummytwo.next = new ListNode(head.val);
                dummytwo = dummytwo.next;
                head = head.next;
            }
            if(k==n+1) {
                p3 = head;
                break;
            }
        }
        ListNode p2start = reverse(p2.next);
        ListNode p2end = p2start;
        while (p2end.next!=null)
            p2end = p2end.next;
        dummyone.next = p2start;
        p2end.next = p3;
        return p1.next;
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