package mydeque;
import java.util.*;
public class MainClass {

	public static void main(String[] args) {
		
		MyDeque<Integer> ad = new MyDeque<Integer>();
		ad.addToHead(12);
		ad.addToHead(68);
		ad.addToHead(58);
		ad.addToHead(14);
		System.out.println(ad.removeLast());
		System.out.println(ad.removeLast());
		System.out.println(ad.removeLast());
		System.out.println(ad.removeLast());
		

	}

}
