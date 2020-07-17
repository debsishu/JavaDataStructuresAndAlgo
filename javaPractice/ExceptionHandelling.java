package javaPractice;

public class ExceptionHandelling {

	public static void main(String[] args) {
		
//		try {
//			int a = 5;
//			int b = 0;
//			int c = a/b;
//			System.out.println(c);
//		}catch(ArithmeticException e) {
//			System.out.println(e.getLocalizedMessage()+" error occurred please check the code");
//		}finally {
//			System.out.println("sorry for the inconvenience ");
//		}
//		System.out.println("This is the very important code");
//		System.out.println("This needs to run");
		fun1();

	}
	static void fun1() {
		int a = 5;
		int b = 3;
		int c = a/b;
		System.out.println(c);
		boolean check = true;
		if(check) {
			throw new ArrayIndexOutOfBoundsException("Danger is close");
		}
	}

}
