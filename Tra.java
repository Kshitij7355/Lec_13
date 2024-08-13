package lec13;

import java.util.Scanner;

public class Tra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int r = s.nextInt();
		int c = s.nextInt();
		int[][]arr = new int[r][c];
		for(int i = 0; i<arr.length;i++) {
			for(int j =0; j<arr[0].length;j++) {
				arr[i][j]=s.nextInt();
			}
		}
		int [][]ar = new int[r][c];
		Transpose(arr,ar,r,c);
		
		for(int i = 0; i<ar.length;i++) {
			for(int j =0; j<ar[0].length;j++) {
				System.out.print(ar[i][j]+" ");
			}
			System.out.println();
		}
		

	}
	public static void Transpose(int[][]arr,int[][]ar,int r,int c) {
		for(int i = 0; i<arr.length;i++) {
			for(int j =0; j<arr[0].length;j++) {
				ar[i][j]=arr[j][i];
			}
		}
	}

}
