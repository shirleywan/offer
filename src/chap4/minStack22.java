package chap4;
import java.io.PushbackInputStream;
import java.util.Stack;
class Solution22 {
	Stack<Integer> stack1 = new Stack<Integer>();
	Stack<Integer> stack2 = new Stack<Integer>();
	
    public void push(int node) {
        stack1.push(node);
        if(stack2.isEmpty()||node<stack2.peek()) {stack2.push(node);}
        else {stack2.push(stack2.peek());}
    }
    
    public void pop() {
        stack1.pop();
        stack2.pop();
    }
    
    public int top() {
    	if(!stack2.isEmpty() && !stack1.isEmpty()) {return stack1.peek();}
        return 0;
    }
    
    public int min() {
    	if(!stack2.isEmpty() && !stack1.isEmpty()) {return stack2.peek();}
        return 0;
    }
}
public class minStack22{
	public static void main(String[] args) {
		new Solution22().push(1);
		new Solution22().push(2);
		new Solution22().push(3);
		int m=new Solution22().min();
		System.out.println(m);
		int n=new Solution22().top();
		System.out.println(n);
	}
}
