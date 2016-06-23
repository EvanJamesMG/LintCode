/**
	实现一个带有取最小值min方法的栈，min方法将返回当前栈中的最小值。

	你实现的栈将支持push，pop 和 min 操作，所有操作要求都在O(1)时间内完成。

	 注意事项

	如果堆栈中没有数字则不能进行min方法的调用

	样例
	如下操作：push(1)，pop()，push(2)，push(3)，min()， push(1)，min() 返回 1，2，1
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
