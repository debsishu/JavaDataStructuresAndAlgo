package javaPractice;

public class LinkedList1 {
	Node head;
	public void insert(int data) {
		Node n = new Node();
		n.data = data;
		n.next = null;
		if(head==null) {
			head = n;
		}else {
			Node n1 = head;
			while(n1.next!=null) {
				n1=n1.next;
			}
			n1.next = n;
		}
	}
	public void print() {
		Node n = head;
		while(n!=null) {
			System.out.print(n.data + " ");
			n = n.next;
		}
	}
	public void insertAtStart(int data) {
		Node n1 = new Node();
		n1.data = data;
		n1.next = head;
		head = n1;
	}
	public void insertAt(int index , int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		if(index==0) {
			insertAtStart(data);
		}else {
			Node n = head;
			for(int i = 0;i<index-1;i++) {
				n = n.next;
			}
			node.next = n.next;
			n.next = node;
		}
	}
	public void deleteAt(int index) {
		Node node = head;
		Node n1 = null;
		for(int i = 0;i<index-1;i++) {
			node = node.next;
		}
		n1 = node.next;
		node.next = n1.next;
		n1 = null;
	}
	public void get(int index) {
		Node n = head;
		for(int i = 0;i<index-1;i++) {
			n = n.next;
		}
		System.out.println(n.data);
	}
	public void size() {
		int count = 0;
		Node n = head;
		while(n!=null){
			count++;
			n = n.next;
		}
		System.out.println(count);
	}
	public void contains(int data) {
		Node n = head;
		boolean check = false;
		while(n!=null) {
			if(n.data==data) {
				check = true;
				break;
			}else {
				check = false;
			}
			n = n.next;
		}
		if(check) {
			System.out.println("TRUE");
		}else {
			System.out.println("FALSE");
		}
	}
	
}
