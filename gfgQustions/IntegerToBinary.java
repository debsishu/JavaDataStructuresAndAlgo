package gfgQustions;
import java.util.*;
public class IntegerToBinary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = "";
		while(n > 0) {
			int temp = n % 2;
			s = temp + s;
			n = n / 2;
		}
		System.out.println(s);

	}

}
