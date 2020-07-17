package gfgQustions;

import java.util.Scanner;

public class ReverseAString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
   	 int t = sc.nextInt();
   	 while(t-->0){
   	     String s = sc.next();
   	     String sa[] = s.split(".");
   	     for(String e:sa){
   	         System.out.print(e);
   	     }
   	   //  for(int i = sa.length-1;i>=0;i--){
   	   //      if(i==0){
   	   //          System.out.print(sa[i]);
   	   //      }else{
   	   //         System.out.print(sa[i]+".");
   	   //      }
   	   //  }
   	 }

	}

}
