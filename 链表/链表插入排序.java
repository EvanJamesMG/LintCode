/**
用插入排序对链表排序

样例
Given 1->3->2->0->null, return 0->1->2->3->null
 */ 
public class Solution {
    /**
     * @param head: The first node of linked list.
     * @return: The head of linked list.
     */
    public ListNode insertionSortList(ListNode head) {
        // write your code here
        if(head==null||head.next==null)
            return head;
        ListNode newhead = head;
        while(newhead.next!=null){
            if (newhead.next.val < newhead.val) {
                ListNode tem = new ListNode(newhead.next.val);
                newhead.next = newhead.next.next;
                ListNode newheadtwo = head;
                if(newheadtwo.val>tem.val){
                    tem.next=newheadtwo;
                    head =tem;
                }else {
                    while (newheadtwo.next != null) {
                        if (newheadtwo.next.val > tem.val) {
                            ListNode tem2 = newheadtwo.next;
                            newheadtwo.next = tem;
                            tem.next = tem2;
                            break;
                        }
                        newheadtwo = newheadtwo.next;
                    }
                }
            }else{
                newhead = newhead.next;
            }

        }
        return head;
    }
}