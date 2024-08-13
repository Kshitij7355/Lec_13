package lec13;
import java.util.*;

import Lec_4.For_loop_demo;
public class User_Input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int r = s.nextInt();
		int c = s.nextInt();
		int [][]arr = new int[r][c];
		for(int i=0;i<arr.length;i++) {
			for(int j =0;j<arr[0].length;j++) {
				arr[i][j]=s.nextInt();
			}
		}
		Display(arr);
	}
	public static void Display(int[][]arr) {
//		int r = arr.length;//row
//		int c = arr[0].length;
	for(int i=0;i<arr.length;i++) {
			for(int j =0;j<arr[0].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
