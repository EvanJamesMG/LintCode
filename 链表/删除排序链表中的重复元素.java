/**
	给定一个排序链表，删除所有重复的元素每个元素只留下一个。

	样例
	给出 1->1->2->null，返回 1->2->null

	给出 1->1->2->3->3->null，返回 1->2->3->null
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