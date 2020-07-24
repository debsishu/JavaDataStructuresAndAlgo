package recursion;

public class GridFinding {

	public static void main(String[] args) {

		System.out.println(pathFind(4, 4));

	}
	
	static int pathFind(int n, int m) {
		if(n == 1 || m == 1) {
			return 1;
		}
		return pathFind(n, m-1) + pathFind(m, n-1);
	}

}
