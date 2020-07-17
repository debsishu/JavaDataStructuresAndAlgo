package myLinkedList;

public class MyLinkedListImplemented<E> {

	Node <E>head;
	public void add(E data) {
		Node <E> toAdd = new Node<E>(data);
		if(isEmpty()) {
			head = toAdd;
			return;
		}
		Node<E> temp = head;
		while(temp.next!=null) {
			temp = temp.next;
		}
		temp.next = toAdd;
	}
	
	public boolean isEmpty() {
		if(head == null) {
			return true;
		}else {
			return false;
		}
	}
	
	 public void print() {
		Node<E> temp = head;
		while(temp!=null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}
	 
	 public E removeLast() throws Exception{
		 if(head==null) {
			 throw new Exception("Can not remove last element from the empty list");
		 }
		 Node<E> temp = head;
		 if(temp.next == null) {
			 Node<E> toRemove = head;
			 head = null;
			 return (E)toRemove.data;
		 }
		 
		 while(temp.next.next!=null) {
			 temp = temp.next;
		 }
		 Node<E> toRemove = temp.next;
		 temp.next = null;
		 return (E) toRemove.data;
	 
	 }
	 
	 public E getLastElement()throws Exception{
		 if(head==null) {
			 throw new Exception("Can not remove last element from the empty list");
		 }
		 Node<E> temp = head;
		 
		 while(temp.next!=null) {
			 temp = temp.next;
		 }
	 	 return (E) temp.data;
	 }
	
}

//static class Node {
//	int data;
//	Node next;
//	
//	public Node(int data) {
//		this.data = data;
//		next = null;
//	}
//}
