package javaPractice;
import java.util.*;
public class StringSorting3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char charArray[] = s.toCharArray();
		int temp;
		int size = charArray.length;
		for(int i = 0; i < size; i++ ) {
	         for(int j = i+1; j < size; j++) {
	            if(charArray[i]>charArray[j]) {
	               temp = charArray[i];
	               charArray[i] = charArray[j];
	               charArray[j] = (char) temp;
	            }
	         }
	      }
		for(char e:charArray) {
			if(e!=' ') {
				System.out.print(e);
			}
		}

	}

}
