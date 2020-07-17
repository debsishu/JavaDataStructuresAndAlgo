package gfgQustions;
import java.util.*;
public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the upper and lower limit");
		int up = sc.nextInt();
		int low = sc.nextInt();
		int flag = 0;
		System.out.println("The prime numbers of this range is");
		for(int i = low;i<=up;i++) {
			flag = 0;
			for(int j = 2;j<=i/2;j++) {
				if(i%j==0) {
					flag++;
					break;
				}
			}
			if(flag==0) {
				System.out.print(i+" ");
			}
		}
	}

}
