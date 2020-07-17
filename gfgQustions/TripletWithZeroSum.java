package gfgQustions;
import java.util.*;
public class TripletWithZeroSum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt();
			int arr[] = new int[n];
			for(int i = 0;i<n;i++) {
				arr[i] = sc.nextInt();
			}
			Arrays.sort(arr);
			for(int i = 0;i<n-2;i++) {
				if(twoSum(arr, arr[i], i)) {
					System.out.println("1");
				}else {
					System.out.println("0");
				}
			}
		}
		
	}
	
	static boolean twoSum(int arr[], int x, int i) {
		
		int j = arr.length-1;
		while(j>i) {
			if(arr[i]+arr[j]<x) {
				i++;
			}else if(arr[i]+arr[j]>x) {
				j--;
			}else {
				return true;
			}
		}
		return false;
		
	}

}
