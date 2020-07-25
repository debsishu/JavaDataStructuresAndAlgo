package recursion;

public class FloodFill {

	public static void main(String[] args) {

		int arr[][] = {{1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 0, 0},
                {1, 0, 0, 1, 1, 0, 1, 1},
                {1, 2, 2, 2, 2, 0, 1, 0},
                {1, 1, 1, 2, 2, 0, 1, 0},
                {1, 1, 1, 2, 2, 2, 2, 0},
                {1, 1, 1, 1, 1, 2, 1, 1},
                {1, 1, 1, 1, 1, 2, 2, 1},
                };
		floodFill(arr, 4, 3, 3, 2);
		printMatrix(arr);
						

	}
	
	static void floodFill(int arr[][] , int r , int c , int toFill , int prevFill) {
		
		int rows = arr.length;
		int cols = arr[0].length;
		//this is the base condition
		if(r < 0 || r >= rows || c < 0 || c >= cols ) {
			return;
		}
		//this is the check of the right question
		if(arr[r][c] != prevFill) {
			return;
		}
		arr[r][c] = toFill;
		//here I'm doing recursive function calling
		floodFill(arr, r-1, c, toFill, prevFill);
		floodFill(arr, r, c-1, toFill, prevFill);
		floodFill(arr, r+1, c, toFill, prevFill);
		floodFill(arr, r, c+1, toFill, prevFill);
		
	}
	

	//this is how you can print a 2d matrix using for each loop
	static void printMatrix(int a[][]) {
		for(int[] array: a) {
			for(int element: array) {
				System.out.print(element +" ");
			}
			System.out.println();
		}
	}

}
