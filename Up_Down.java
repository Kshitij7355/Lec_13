package lec13;

import java.util.Arrays;
import java.util.Scanner;

public class Up_Down {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int cow=sc.nextInt();
		int [] ar=new int[n];
		for(int i=0;i<n;i++) {
			ar[i]=sc.nextInt();
		}
		Arrays.sort(ar);
		System.out.println(FindMaxDist(ar, cow));
		}
	public static int FindMaxDist(int [] stall, int cow) {
		int lo=0;
		int hi=stall[stall.length-1];
		int ans=-1;
		while(lo<=hi) {
			int mid=(lo+hi)/2;
			if(isitpossible(stall, cow, mid)==true) {
				ans=mid;
				lo=mid+1;
			}
			else {
				hi=mid-1;
			}
		}
		return ans;
	}
	public static boolean isitpossible(int [] stall, int cow, int mid) {
		int i=0;
		int j=1;
		int pcow=1;
		while(j<stall.length) {
			if(stall[j]-stall[i]>=mid) {
				pcow++;
				i=j;
			}
			j++;
		}
		if(pcow>=cow) {
			return true;
		}
		
			return false;
	}

}


