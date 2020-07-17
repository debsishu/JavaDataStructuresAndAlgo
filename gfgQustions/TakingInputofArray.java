package gfgQustions;
import java.util.*;
public class TakingInputofArray {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the size of the array");
			int n = sc.nextInt();
			int arr[] = new int[n];
			System.out.println("The elements of array");
			for(int i = 0;i<n;i++) {
				arr[i] = sc.nextInt();
			}
			System.out.println("The array input is");
			for(int e:arr) {
				System.out.print(e+" ");
			}
			System.out.println();
			sc.close();
	}

}
