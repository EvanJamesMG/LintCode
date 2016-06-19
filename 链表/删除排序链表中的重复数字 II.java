/**
	����һ����������ɾ�������ظ���Ԫ��ֻ����ԭ������û���ظ���Ԫ�ء�
	����
	���� 1->2->3->3->4->4->5->null������ 1->2->5->null

	���� 1->1->1->2->3->null������ 2->3->null
 */
public class Solution {
    /**
     * @param ListNode head is the head of the linked list
     * @return: ListNode head of the linked list
     */
    public static ListNode deleteDuplicates(ListNode head) {
        if(head==null)
            return null;
        ListNode dummy = new ListNode(0);
        ListNode p1= dummy;
        HashMap<Integer,Integer>  map = new HashMap<>();
        ListNode cyhead = head;
        ListNode cyhead2 = head;
        while(cyhead!=null){
            if(map.containsKey(cyhead.val))
                map.put(cyhead.val,map.get(cyhead.val)+1);
            else
                map.put(cyhead.val,1);
            cyhead = cyhead.next;
        }
        while(cyhead2!=null){
            if(map.get(cyhead2.val)==1) {
                p1.next = new ListNode(cyhead2.val);
                p1 = p1.next;
            }
            cyhead2 =cyhead2.next;
        }
        return  dummy.next;
    }
}
