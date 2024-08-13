package lec13;

public class Two_2d_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]arr = new int [3][4];
		System.out.println(arr);
		System.out.println(arr[1]);
		System.out.println(arr[0]);
		
		System.out.println(arr[1][2]);
		Display(arr);

	}
	public static void Display(int[][]arr) {
//		int r = arr.length;//row
//		int c = arr[0].length;
	for(int i=0;i<arr.length;i++) {
			for(int j =0;j<arr[0].length;j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		
	}

}
