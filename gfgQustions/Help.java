package gfgQustions;
import java.util.*;
public class Help {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		boolean check = false;
		while(!check) {
			int i = sc.nextInt();
			if(i>999 && i<10000) {
				check = true;
				int fourdig = i%10;
				int threedig = (i/10)%10;
				int twodig = (i/100)%10;
				int firdig = (i/1000)%10;
				if(fourdig+threedig==twodig+firdig) {
					System.out.println("This is a luckey number");
				}else {
					System.out.println("This is not a luckey number");
				}
			}else {
				System.out.println(i + " is not a four digit number");
				System.out.println("TRY AGAIN");
			}
		}
		
		sc.close();
	}

}
