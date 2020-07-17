package javaPractice;
public class Runner {

	public static void main(String[] args){
		LinkedList1 list = new LinkedList1();
		list.insert(4);
		list.insert(14);
		list.insert(14);
		list.insert(10);
		list.insert(7);
		list.insert(14);
		list.deleteAt(3);
		list.print();
	}

}
