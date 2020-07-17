package myStack;

import myLinkedList.MyLinkedListImplemented;

public class MyStack <E>{

	private MyLinkedListImplemented<E> ll = new MyLinkedListImplemented<E>();
	void push( E e) {
		ll.add(e);
	}
	
	E pop() throws Exception{
		if(ll.isEmpty()) {
			throw new Exception("Popping from empty stack is not allowed");
		}
		return ll.removeLast();
	}
	E peek() throws Exception{
		if(ll.isEmpty()) {
			throw new Exception("Cannot peek from an empty stack");
		}
		return ll.getLastElement();
	}

}
