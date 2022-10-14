/*Write a Java program to print an array after changing the rows and columns of a given two-dimensional array.
Original Array:
10 20 30
40 50 60
After changing the rows and columns of the said array:
10 40
20 50
30 60*/
public class arrayFlip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Array to be converted
		int[][] twodm = {
			{10, 20, 30},
			{40, 50, 60}
	};
	System.out.print("Original Array:\n");
	print_array(twodm);
	System.out.print("After changing the rows and columns of the said array:\n");
	transpose(twodm);
	}

public static void transpose(int[][] twodm) {
	
	int[][] newtwodm = new int[twodm[0].length][twodm.length];
	//for loop to flip the 2d array into newtwodm array
	for (int i = 0; i < twodm.length; i++) {
		for (int j = 0; j < twodm[0].length; j++) {
			newtwodm[j][i] = twodm[i][j];
		}
	}
	
	print_array(newtwodm);
}
//Function to print new flipped 2d array
public static void print_array(int[][] twodm) {
	for (int i = 0; i < twodm.length; i++) {
		for (int j = 0; j < twodm[0].length; j++) {
			System.out.print(twodm[i][j] + " ");
		}
		System.out.println();
	}
	}

}
