package maps;

import java.util.*;
import java.util.Map.Entry;

public class MainClass {

	public static void main(String[] args) {

		Map<String, Integer> numbers = new HashMap<>();
		
//		numbers.put("One", 1);
//		numbers.put("two", 2);
//		numbers.put("three", 3);
//		numbers.put("four", 4);
//		numbers.put("five", 5);
//		numbers.putIfAbsent("One", 10);
//		numbers.remove("two");
//		
//		Set<Entry<String, Integer>> entries = numbers.entrySet();
//		for(Entry<String, Integer> entry : entries){
//			entry.setValue(entry.getValue() * 100);
//		}
//		System.out.println(numbers);

		System.out.println(getHash("BALL"));
	}

	public static int getHash(String s) {
		int hash = 0;
		for(int i = 0 ;i<s.length();i++) {
			hash+=s.charAt(i);
		}
		return hash;
	}
	
}
