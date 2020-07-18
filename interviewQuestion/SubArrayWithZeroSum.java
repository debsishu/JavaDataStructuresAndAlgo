package interviewQuestion;
import java.util.*;
public class SubArrayWithZeroSum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		Set<Integer> set = new HashSet<>();
		int sum = 0;
		boolean found = false;
		for(int e : arr) {
			set.add(sum);
			sum = sum + e;
			if(set.contains(sum)) {
				found = true;
				break;
			}
		}
		System.out.println("found" + found);
		
	}

}
