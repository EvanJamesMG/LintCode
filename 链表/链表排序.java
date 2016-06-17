
/**
 * Definition for ListNode.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int val) {
 *         this.val = val;
 *         this.next = null;
 *     }
 * }
 */ 
 
 //πÈ≤¢≈≈–Ú
public class Solution {
    /**
     * @param head: The head of linked list.
     * @return: You should return the head of the sorted linked list,
                    using constant space complexity.
     */
    public ListNode sortList(ListNode head) {
        // write your code here
        if(head==null||head.next==null)
            return head;
        ListNode fast = head;
        ListNode slow = head;
        while(fast.next!=null&&fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode head2 = slow.next;
        slow.next = null;
        ListNode head1= head;
        head1 = sortList(head1);
        head2 = sortList(head2);
        head = merge(head1,head2);
        return head;
    }

    private static ListNode merge(ListNode head1, ListNode head2) {
        ListNode origin =new ListNode(0);
        ListNode dummy = origin;
        while(head1!=null&&head2!=null){
            if(head1.val<=head2.val){
                dummy.next = head1;
                head1 = head1.next;
                dummy = dummy.next;
            }else {
                dummy.next = head2;
                head2 = head2.next;
                dummy = dummy.next;
            }
        }
        if(head1==null)
            dummy.next = head2;
        if(head2==null)
            dummy.next = head1;

        return origin.next;
    }
}
