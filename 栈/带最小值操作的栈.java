/**
	ʵ��һ������ȡ��Сֵmin������ջ��min���������ص�ǰջ�е���Сֵ��

	��ʵ�ֵ�ջ��֧��push��pop �� min ���������в���Ҫ����O(1)ʱ������ɡ�

	 ע������

	�����ջ��û���������ܽ���min�����ĵ���

	����
	���²�����push(1)��pop()��push(2)��push(3)��min()�� push(1)��min() ���� 1��2��1
*/

public class MinStack {
    
    private Stack<Integer> stack1;
    private Stack<Integer> minstack;
    public MinStack() {
        // do initialize if necessary
        stack1 = new Stack<Integer>();
        minstack = new Stack<Integer>();
    }

    public void push(int number) {
        // write your code here
        stack1.add(number);
        if(minstack.empty()||number<=minstack.peek())
            minstack.add(number);
    }

    public int pop() {
        // write your code here
        if(!minstack.empty()&&stack1.peek().equals(minstack.peek()))
            minstack.pop();
        return stack1.pop();
    }

    public int min() {
        // write your code here
        return minstack.peek();
    }
}
