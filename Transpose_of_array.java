package lec13;

import java.util.Scanner;

public class Transpose_of_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[][]arr = new int[n][n];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				arr[i][j]=s.nextInt();
			}
			System.out.println();
		}
		Transpose(arr);
		for(int i =0;i<arr.length;i++) {
			for(int j =0;j<arr[0].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		

	}
	public static void Transpose(int[][]arr) {
		for(int i =0;i<arr.length;i++) {
			for(int j =i+1;j<arr.length;j++) {
				int temp = arr[i][j];
				arr[i][j]=arr[j][i];
				arr[j][i]=temp;
			}
			
		}
	}

}
