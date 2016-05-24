/**
   给定一个单链表和数值x，划分链表使得所有小于x的节点排在大于等于x的节点之前。

	你应该保留两部分内链表节点原有的相对顺序。

	样例
	给定链表 1->4->3->2->5->2->null，并且 x=3

	返回 1->2->2->4->3->5->null
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
