/**
�ҵ�����������n���ڵ㣬��֤�����нڵ����������Ϊn��

����
�������� 3->2->1->5->null��n = 2�����ص����ڶ����ڵ��ֵ1.
 */ 
public class Solution {
    /**
     * @param head: The first node of linked list.
     * @param n: An integer.
     * @return: Nth to last node of a singly linked list. 
     */
    ListNode nthToLast(ListNode head, int n) {
        if(head == null)
            return null;
        ListNode left = head;
        ListNode right = head;
        for(int i=0;i<n;i++)
            right = right.next;
        while(right!=null){
            left = left.next;
            right = right.next;
        }
        return left;
    }
}
