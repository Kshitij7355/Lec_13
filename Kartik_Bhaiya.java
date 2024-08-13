package Lec13;

import java.util.Scanner;

public class Kartik_Bhaiya {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String s1 = s.next();
		int k=s.nextInt();
		int ans1 = Kartik(s1,'a',k);
		int ans2 =Kartik(s1,'b',k);
		System.out.println(Math.max(ans1, ans2));
		

	}
	public static int Kartik(String s1 , char ch,int k) {
		int ans=0;
		int si=0;
		int ei=0;
		int flip=0;
		while(ei<s1.length()) {
			//growing
			if(s1.charAt(ei)==ch) {
				flip++;
			}
			//shrinking
			while(flip>k && si<=ei) {
				if(s1.charAt(si)==ch) {
					flip--;
				}
				si++;
			}
			//ans update
			ans=Math.max(ans,ei-si+1);
			ei++;
		}
		return ans;
	}

}
