package arrayList;
import java.util.*;
public class myArrayList {

	public static void main(String[] args) {

		List<Integer> fruit = new ArrayList<Integer>();
		fruit.add(23);
		fruit.add(56);
		fruit.add(45);
		fruit.add(25);
		fruit.add(44);
		fruit.set(1, 4);
		int d = fruit.get(2);
		fruit.remove(3);
		List<Integer> toRemove = new ArrayList<Integer>();
		toRemove.add(23);
		toRemove.add(45);
		fruit.removeAll(toRemove);
		System.out.println(fruit+" "+d);
		Generics<String,Integer> p1 = new Generics<String,Integer>("Debsishu", 25 , true);
		p1.print();
		
	}

}
