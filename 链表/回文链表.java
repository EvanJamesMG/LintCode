/**
���һ�ַ�ʽ���һ�������Ƿ�Ϊ��������

����
1->2->1 ����һ����������
 */
public class Solution {
    /**
     * @param head a ListNode
     * @return a boolean
     */
    public boolean isPalindrome(ListNode head) {
        // Write your code here
        if(head==null)
            return true;
        ArrayList<Integer> input = new ArrayList<>();

        while(head!=null){
            input.add(head.val);
            head = head.next;
        }
        int left = 0;
        int right = input.size()-1;
        while(left<=right){

            if(!input.get(left).equals(input.get(right)))
                return false;
            else{
                left++;
                right--;
            }
        }
        return true;
    }
}