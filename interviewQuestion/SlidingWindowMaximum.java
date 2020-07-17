package interviewQuestion;

import java.util.*;

public class SlidingWindowMaximum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
        	int n = sc.nextInt();
        	int k = sc.nextInt();
        	int arr[] = new int[n];
        	for(int i = 0;i<n;i++) {
        		arr[i] = sc.nextInt();
        	}
        	Solution sol = new Solution();
        	int ans[] = sol.maxSlidingWindow(arr, k);
        	for(int e : ans) {
        		System.out.print(e + " ");
        	}
        	System.out.println();
        }
	}

	static class Solution {
	    public int[] maxSlidingWindow(int[] arr, int k) {
	    	int n = arr.length;
	    	if(n == 0) {
	    		return arr;
	    	}
	        Deque<Integer> dq = new LinkedList<>();
	        int ans[] = new int[n - k + 1];
	        int i = 0;
	        for(; i<k;i++) {
	        	while(!dq.isEmpty() && arr[dq.peekLast()]<=arr[i]) {
	        		dq.removeLast();
	        	}
	        	dq.addLast(i);
	        }
	        
	        for(; i < n ; i++) {
	        	ans[i-k] = arr[dq.peekFirst()];
	        	while(!dq.isEmpty() && dq.peekFirst() <= i-k) {
	        		dq.removeFirst();
	        	}
	        	while(!dq.isEmpty() && arr[dq.peekFirst()]<= arr[i]) {
	        		dq.removeLast();
	        	}
	        	dq.addLast(i);
	        }
	        ans[i-k] = arr[dq.peekFirst()];
	        return ans;
	    }
	}
}
