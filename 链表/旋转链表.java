/**
在 O(n log n) 时间复杂度和常数级的空间复杂度下给链表排序。

样例
给出 1->3->2->null，给它排序变成 1->2->3->null.
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