package recursion;

import java.util.*;

public class PermutationPrintingOfString {

	static Set<String> set = new HashSet<>();
	
	public static void main(String[] args) {

		permutationStirng("abc", 0, 2);

	}

	static void permutationStirng(String s, int l, int r) {
		
		if(l == r) {
			if(set.contains(s)) {
				return;
			}
			set.add(s);
			System.out.println(s);
			return; 
		}
		
		for(int i = l; i <= r ;i++) {
			s = interchange(s, l, i);
			permutationStirng(s, l+1, r);
			s = interchange(s, l, i);
		}
		
	}
	
	static String interchange(String s , int a, int b) {
		char arr[] = s.toCharArray();
		char temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
		return String.valueOf(arr);
	}
	
}
