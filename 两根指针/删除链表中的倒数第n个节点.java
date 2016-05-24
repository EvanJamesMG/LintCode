/**
给定一个链表，删除链表中倒数第n个节点，返回链表的头节点。

 注意事项

	链表中的节点个数大于等于n

	样例
	给出链表1->2->3->4->5->null和 n = 2.

	删除倒数第二个节点之后，这个链表将变成1->2->3->5->null.

	挑战 
	O(n)时间复杂度
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
