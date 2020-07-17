package javaPractice;
import java.util.*;
public class StirngSorting2 {

	public static void main(String[] args) {
		  int temp;
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Enter a string value: ");
	      String str = sc.nextLine();
	      char charArray[] = str.toCharArray();
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
      		System.out.print(e);
      	}
	}


}
