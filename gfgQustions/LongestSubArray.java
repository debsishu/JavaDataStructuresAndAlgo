package gfgQustions;
import java.util.*;
public class LongestSubArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {

			int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i = 0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            int result = 0;
            for(int i = 0;i<n;i++){
                int count = 0;
                while(i<n && arr[i]>=0){
                    count++;
                    i++;
                }
                result = Math.max(count,result);
            }
            System.out.println(result);
			
		}
	}
}
