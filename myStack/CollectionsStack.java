package myStack;

public class CollectionsStack {

	public static void main(String[] args) throws Exception {

		MyStack<Integer> stack = new MyStack<Integer>();
		stack.push(12);
		stack.push(24);
		stack.push(36);
		stack.push(78);
		int peek = stack.peek();
		System.out.println(peek);

	}

}
