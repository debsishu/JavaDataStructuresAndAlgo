package javaPractice;
import java.util.*;
public class StringSorting {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String arr[] = s.split(" ");
		String result="";
		for(int i = 0;i<arr.length;i++) {
			String newString =sortString(arr[i]);
			result = result+newString+" ";
		}
		
		System.out.println(result);
		sc.close();
	}
	public static String sortString(String inputString) { 
        char tempArray[] = inputString.toCharArray(); 
        Arrays.sort(tempArray); 
        return new String(tempArray); 
    }

}
