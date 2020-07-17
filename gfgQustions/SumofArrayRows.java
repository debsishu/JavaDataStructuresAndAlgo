package gfgQustions;
import java.util.*;
public class SumofArrayRows {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows and coloms");
		int rows = sc.nextInt();
		int col = sc.nextInt();
		System.out.println("Enter the array elements");
		int arr[][] = new int[rows][col];
		for(int i = 0;i<rows;i++) {
			for(int j = 0;j<col;j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		theArraySum(arr,rows,col);
		sc.close();
	}
	public static void theArraySum(int arr[][] , int rows , int col) {
		for(int i =0;i<rows;i++) {
			int sum = 0;
			for(int j = 0;j<col;j++) {
				sum = sum + arr[i][j];
			}
			System.out.println(sum);
		}
	}
}
