package gfgQustions;
import java.util.*;
public class NameToShortName {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String s = sc.nextLine();
		s = s.toUpperCase();
		String str[] = s.split(" ");
		String result = "";
		for(int i = 0;i<str.length;i++) {
			if(i == str.length-1) {
				String temp = str[i];
				String temp1 = temp.substring(1);
				String temp2 = temp1.toLowerCase();
				result = result+temp.charAt(0)+temp2;
			}else {
				String temp = str[i];
				char temp1 = temp.charAt(0);
				result = result+temp1+". ";
			}
		}
		System.out.println(result);
		sc.close();
	}

}
