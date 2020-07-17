package gfgQustions;
import java.util.*;
public class Rabindra {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String s = sc.nextLine();
		String str[] = s.split(" ");
		String result = "";
		for(int i = 0;i<str.length;i++) {
			String temp = str[i];
			if(temp.charAt(0)=='R'||temp.charAt(0)=='r') {
				result = result+"R. ";
			}else if(temp.charAt(0)=='N'||temp.charAt(0)=='n'){
				result = result +"N. ";
			}else if(temp.charAt(0)=='T'||temp.charAt(0)=='t') {
				result = result+"Tagore";
			}
		}
		System.out.println(result);
		sc.close();
	}

}
