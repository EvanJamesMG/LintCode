   /**
     * ˼·��
     * ������ڵ�dummyone������ڵ��ǰһ�����ӽڵ�dummyonepre�������ҽڵ�dummytwo�����ҽڵ��ǰһ�����ӽڵ�dummytwopre��
     * ֮����ǽڵ�Ľ���
     * ��Ҫע�����������ǣ�
     *  1. v1 �� v2 �������е�ǰ��˳�򣨲�һ����v1��һ���ȳ��֣���ǰ�棩
     *  2. dummyone �ڵ� �� dummytwopre �ڵ��غϵ����
     *
     * @param head
     * @param v1
     * @param v2
     * @return
     */
    public static ListNode swapNodes(ListNode head, int v1, int v2) {
        // Write your code here
        if(head==null)
            return null;

        ListNode dummyonepre = new ListNode(0);
        ListNode dummytwopre = new ListNode(0);
        ListNode res = dummyonepre;
        ListNode dummyone = head;
        ListNode dummytwo = head;
        ListNode test = head;
        dummyonepre.next  = dummyone;
        dummytwopre.next = dummytwo;
        int first = 0;
        int second = 0;
        while(test!=null){
            if(test.val==v1){
                first = v1;
                second = v2;
                break;
            }
            if(test.val==v2){
                first = v2;
                second = v1;
                break;
            }
            test = test.next;
        }

        while(dummyone!=null&&dummyone.val!=first){
            dummyonepre = dummyonepre.next;
            dummyone = dummyone.next;
        }
        while(dummytwo!=null&&dummytwo.val!=second){
            dummytwopre = dummytwopre.next;
            dummytwo = dummytwo.next;
        }

        if(dummyone!=null&&dummytwo!=null) {
            if(dummyone.val!=dummytwopre.val) {
                dummyonepre.next = dummytwo;
                ListNode tem = dummytwo.next;
                dummytwo.next = dummyone.next;
                dummytwopre.next = dummyone;
                dummyone.next = tem;
            }else {
                dummyonepre.next = dummytwo;
                ListNode tem = dummytwo.next;
                dummytwo.next = dummyone;
                dummyone.next = tem;
            }
        }

        return res.next;
    }