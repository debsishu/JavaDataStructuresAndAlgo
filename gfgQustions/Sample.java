package gfgQustions;

import java.util.*;

public class Sample {

	public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
        	
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i = 0;i<n;i++) {
            	arr[i] = sc.nextInt();
            }
            int f = sc.nextInt();
            System.out.println(index(arr,f));
            
        }
	}
	
	public static int index(int arr[],int f){
	    int n = arr.length;
	    for(int i = 0;i<n;i++){
                if(f == arr[i]){
                	int index = i;
                    return index;
                }else
                	continue;
            }
        return -1;
	    
	}

}
