package gfgQustions;
public class PrimeNumberFun {

	public static void main(String[] args) {
		primeBetween(10,20);
		
	}
	static boolean isPrime(int n) {
		for(int i = 2;i<=n/2;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
	static void primeBetween(int start,int end) {
		for(int i = start;i<=end;i++) {
			if(isPrime(i)) {
				System.out.print(i+" ");
			}
		}
	}

}
