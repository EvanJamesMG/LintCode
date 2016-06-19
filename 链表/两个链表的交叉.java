/**
请写一个程序，找到两个单链表最开始的交叉节点。

 注意事项

如果两个链表没有交叉，返回null。
在返回结果后，两个链表仍须保持原有的结构。
可假定整个链表结构中没有循环。
样例
下列两个链表：

A:          a1 → a2
                   ↘
                     c1 → c2 → c3
                   ↗            
B:     b1 → b2 → b3
在节点 c1 开始交叉。
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