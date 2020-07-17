package gfgQustions;
import java.util.*;
public class BalanceParanthesis {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            
            String s = sc.next();
            char arr[] = s.toCharArray();
            Stack <Character> stack = new Stack<>();
            for(int i = 0;i<s.length();i++){
                if(arr[i] == '[' || arr[i] == '{' || arr[i] == '('){
                    stack.push(arr[i]);
                }
                
                if(arr[i] == ']' || arr[i] == '}' || arr[i] == ')'){
                    stack.pop();
                }
            }
            if(stack.empty()){
                System.out.println("balanced");
            }else{
                System.out.println("not balanced");
            }
            
        }

	}

}
