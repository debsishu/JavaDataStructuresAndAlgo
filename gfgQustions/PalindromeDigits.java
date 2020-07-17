package gfgQustions;
import java.util.*;
public class PalindromeDigits {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int rows = sc.nextInt();
		System.out.println("Enter the number of columns");
		int columns= sc.nextInt();
		if(rows<3 && columns<3) {
			System.out.println("3by3 Martic not allowed");
		}else {
			
			System.out.println("Enter the elements of the array");
			int arr[][] = new int[rows][columns];
			for(int i = 0;i<rows;i++) {
				for(int j = 0;j<columns;j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			int count = 0;
			for(int i = 1;i<=rows-2;i++) {
				for(int j = 1;j<=columns-2;j++) {
					if(arr[i+1][j]==arr[i-1][j] && arr[i][j-1]==arr[i][j+1]) {
						++count;
					}
				}
			}
			System.out.println(count);
		}
		sc.close();
	}

}
