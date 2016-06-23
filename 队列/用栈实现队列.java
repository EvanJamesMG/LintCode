/**
	�����������������Ҫʹ������ջ��ʵ�ֶ��е�һЩ������

	����Ӧ֧��push(element)��pop() �� top()������pop�ǵ��������еĵ�һ��(��ǰ���)Ԫ�ء�

	pop��top������Ӧ�÷��ص�һ��Ԫ�ص�ֵ��

	����
	����push(1), pop(), push(2), push(3), top(), pop()����Ӧ�÷���1��2��2
*/

public class Queue {
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    public Queue() {
        // do initialization if necessary
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void push(int element) {
        // write your code here
        stack1.add(element);
    }

    public int pop() {
        // write your code here
        top();
        return stack2.pop();
    }

    public int top() {
        // write your code here
        if(stack2.size()!=0)
            return stack2.peek();
        else{
            while(!stack1.empty())
                stack2.add(stack1.pop());
            return stack2.peek();
        }
    }
}