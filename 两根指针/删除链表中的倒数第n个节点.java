/**
����һ������ɾ�������е�����n���ڵ㣬���������ͷ�ڵ㡣

 ע������

	�����еĽڵ�������ڵ���n

	����
	��������1->2->3->4->5->null�� n = 2.

	ɾ�������ڶ����ڵ�֮������������1->2->3->5->null.

	��ս 
	O(n)ʱ�临�Ӷ�
*/ 
public class Solution {
    /**
     * @param head: The first node of linked list.
     * @param n: An integer.
     * @return: The head of linked list.
     */
    ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode cyhead = head;
        ListNode cyheadtwo = head;
        ListNode headright = head;
        int len = 0;
        while(cyheadtwo!=null) {
            cyheadtwo = cyheadtwo.next;
            len++;
        }
        if(len==n)
            return head.next;

        for(int i=0;i<n;i++)
            headright = headright.next;
        while(headright.next!=null){
            headright = headright.next;
            cyhead = cyhead.next;
        }
        cyhead.next = cyhead.next.next;
        return head;
    }
}
