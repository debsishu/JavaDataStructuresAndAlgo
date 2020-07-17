package javaPractice;
import java.util.*;
public class LinkedListImplement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		List <Integer> ll = new LinkedList<>();
//		System.out.println("Enter the number of elements");
//		int n = sc.nextInt();
//		for(int i = 0;i<n;i++) {
//			ll.add(sc.nextInt());
//		}
//		System.out.println(ll.get(2));
		MyLinkedList ll = new MyLinkedList();
		ll.add(12);
		ll.add(14);
		ll.print();
	}

}
