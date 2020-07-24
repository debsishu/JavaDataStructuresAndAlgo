package recursion;

public class MainClass {
	static int count = 0;
	public static void main(String [] args) {
		
		System.out.println(sum(5));
		System.out.println(power(5, 3));
		System.out.println(count);
//		count = 0;
		System.out.println(fastPow(5, 3));
		System.out.println(count);
		
	}
	
	static int power(int a , int b) {
		
		if(b == 0) {
			return 1;
		}
		return a*power(a , b-1);
		
	}
	
	static int sum(int n) {
		count++;
		if(n == 1) {
			return 1;
		}
		return n+sum(n-1);
		
	}
	
	static int fastPow(int a, int b) {
		count++;
		if(b == 0) {
			return 1;
		}
		if(b%2 == 0) {
			return fastPow(a*a, b/2);
		}
		return a*fastPow(a, b-1);
	}
	
}
