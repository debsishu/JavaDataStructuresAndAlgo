package gfgQustions;
import java.util.*;
public class PalindromeString {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		String s = sc.next();
		sc.close();
		boolean check = true;
//		int i = 0;
//		int j = s.length()-1;
//		while(i<j) {
//			if(s.charAt(i)!=s.charAt(j)) {
//				check = false;
//				break;
//			}
//			i++;
//			j--;
//		}
		for(int i = 0, j = s.length()-1;i<j;i++, j--) {
			if(s.charAt(i)!=s.charAt(j)) {
				check = false;
				break;
			}
		}
		
		if(check) {
			System.out.println("Palindrome");
		}else
			System.out.println("Not Palindrome");


	}

}
