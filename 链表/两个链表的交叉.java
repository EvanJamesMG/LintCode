/**
��дһ�������ҵ������������ʼ�Ľ���ڵ㡣

 ע������

�����������û�н��棬����null��
�ڷ��ؽ���������������뱣��ԭ�еĽṹ��
�ɼٶ���������ṹ��û��ѭ����
����
������������

A:          a1 �� a2
                   �K
                     c1 �� c2 �� c3
                   �J            
B:     b1 �� b2 �� b3
�ڽڵ� c1 ��ʼ���档
 */
public class Solution {
    /**
     * @param headA: the first list
     * @param headB: the second list
     * @return: a ListNode 
     */
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null||headB==null)
            return null;
        ListNode cyheadA = headA;
        ListNode cyheadB = headB;
        int lenA = 0;
        int lenB = 0;
        while(cyheadA!=null){
            cyheadA = cyheadA.next;
            lenA++;
        }
        while(cyheadB!=null){
            cyheadB = cyheadB.next;
            lenB++;
        }
        if(lenA>lenB){
            for(int i=0;i<lenA-lenB;i++)
                headA = headA.next;
        }else{
            for(int i=0;i<lenB-lenA;i++)
                headB = headB.next;
        }
        while(headA!=null&&headB!=null){
            if(headA.val==headB.val)
                return headA;
            headA = headA.next;
            headB = headB.next;
        }
        return null;
    }  
}