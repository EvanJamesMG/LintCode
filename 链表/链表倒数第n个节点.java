/**
找到单链表倒数第n个节点，保证链表中节点的最少数量为n。

样例
给出链表 3->2->1->5->null和n = 2，返回倒数第二个节点的值1.
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
