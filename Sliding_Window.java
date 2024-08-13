package Lec13;

import java.util.Scanner;

public class Sliding_Window {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n =s.nextInt();
		int[]arr= new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=s.nextInt();
		}
		int k=s.nextInt();
		System.out.println(Sum(arr,k));

	}
	public static int Sum(int[]arr ,int k) {
		int sum=0;
		int ans=Integer.MIN_VALUE;
		for(int i=0;i<k;i++) {
			sum+=arr[i];
		}
		ans=sum;
		for(int i=k;i<arr.length;i++) {
			sum+=arr[i];
			sum-=arr[i-k];
			ans=Math.max(ans, sum);
		}
		return ans;
	}

}
