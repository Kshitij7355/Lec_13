package Lec13;

import java.util.Scanner;

public class Subarray_product_Less_Than_K {

	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n =s.nextInt();
        int[]arr = new int[n];
        for(int i=0;i<arr.length;i++) {
        	arr[i]=s.nextInt();
        }
        int k=s.nextInt();
        System.out.println(Count_Subarray(arr,k));
	}
	public static int Count_Subarray(int[]arr,int k) {
		int si=0;
		int ei=0;
		int p=1;
		int ans=0;
		while(ei<arr.length) {
			//growing
			p*=arr[ei];
			
			//shrinking
			while(p>=k && si<=ei) {
				p/=arr[si];
				si++;
			}
			//update
			ans+=(ei-si+1);
			ei++;
		}
		return ans;
	}
}













