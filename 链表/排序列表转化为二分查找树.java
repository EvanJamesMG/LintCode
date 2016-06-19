/**
����һ������Ԫ������������ĵ���������ת����һ�ø߶�ƽ��Ķ��ֲ�����
 */ 
public class Solution {
    /**
     * @param head: The first node of linked list.
     * @return: a tree node
     */
    public  TreeNode sortedListToBST(ListNode head) {
        // write your code here
        if(head==null)
            return null;
        if(head.next==null){
            return new TreeNode(head.val);
        }
        ListNode left= head;
        ListNode right = head;
        while(right!=null&&right.next!=null){
            left=left.next;
            right = right.next.next;
        }
        ListNode mid = left;
        ListNode rightnode = null;
        if(left.next!=null) {
             rightnode = left.next;
        }
        ListNode newleft = head;
        while (newleft.next!=left)
            newleft = newleft.next;
        newleft.next = null;


        TreeNode res = new TreeNode(mid.val);
        res.left = sortedListToBST(head);
        res.right = sortedListToBST(rightnode);
        return res;

    }
}
