package p15.lecture;

import java.util.Stack;

public class A05Stack {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		// LIFO(Last In First Out)
		stack.push(3);
		stack.push(4);
		stack.push(5);
		System.out.println(stack);

		stack.pop();
		System.out.println(stack);

		stack.pop();
		System.out.println(stack);

		stack.pop();
		System.out.println(stack);

		stack.push(6);
		stack.push(7);
		stack.push(8);
		System.out.println(stack);
		System.out.println(stack.peek());
	}
}
