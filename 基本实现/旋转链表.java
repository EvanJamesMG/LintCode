/*
����һ��������ת����ʹ��ÿ���ڵ������ƶ�k��λ�ã�����k��һ���Ǹ���
����
��������1->2->3->4->5->null��k=2

����4->5->1->2->3->null
*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    /**
     * @param head: the List
     * @param k: rotate to the right k places
     * @return: the list after rotation
     */
    public ListNode rotateRight(ListNode head, int k) {
    	if(head == null||k==0)
    		return head;
    	ListNode copyhead = head;
		ListNode copyhead2 = head;
		int len = 0;
		while(copyhead2!=null){
			len++;
			copyhead2 = copyhead2.next;
		}
		k =k%len; 
		if(k==0)
		    return head;
    	for(int i=0;i<len-k-1;i++){
			copyhead = copyhead.next;
		}
		ListNode left = copyhead.next;
		copyhead.next = null;
		ListNode copyleft = left;
		while(copyleft.next!=null)
			copyleft = copyleft.next;
		copyleft.next = head;
    	
    	return left;
    }
}