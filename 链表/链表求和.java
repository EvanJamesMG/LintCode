/**
����������������������������ÿ���ڵ����һ�����֡����ִ洢������ԭ���������෴��˳��ʹ�õ�һ������λ������Ŀ�ͷ��д��һ������������������ӣ���������ʽ���غ͡�

����
������������ 3->1->5->null �� 5->9->2->null������ 8->0->8->null
 */
public class Solution {
    /**
     * @param l1: the first list
     * @param l2: the second list
     * @return: the sum list of l1 and l2 
     */
    public ListNode addLists(ListNode l1, ListNode l2) {
        if(l1==null)
            return l2;
        if(l2==null)
            return l1;
        ListNode dummyNode = new ListNode(0);
        ListNode p1 = dummyNode;
        int addnum = 0;
        while (l1!=null&&l2!=null){
            int sumnum = l1.val+l2.val+addnum;
            if(sumnum>=10) {
                addnum = 1;
                sumnum = sumnum%10;
            }else{
                addnum=0;
            }
            p1.next = new ListNode(sumnum);
            p1 = p1.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        if(l1==null&&l2==null){
            if(addnum==1){
                p1.next = new ListNode(addnum);
                p1 = p1.next;
            }
        }
        if(l1==null) {
            while(l2!=null){
                int sumnum = l2.val+addnum;
                if(sumnum>=10) {
                    addnum = 1;
                    sumnum = sumnum%10;
                }else{
                    addnum=0;
                }
                p1.next = new ListNode(sumnum);
                p1 = p1.next;
                l2 = l2.next;
            }
        }else{
            while(l1!=null){
                int sumnum = l1.val+addnum;
                if(sumnum>=10) {
                    addnum = 1;
                    sumnum = sumnum%10;
                }else{
                    addnum=0;
                }
                p1.next = new ListNode(sumnum);
                p1 = p1.next;
                l1 = l1.next;
            }
        }
        return dummyNode.next;
    }
}