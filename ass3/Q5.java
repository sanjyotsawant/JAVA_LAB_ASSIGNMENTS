// Write a Program to find the second highest number in an array.

package ass3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		for(int i=0;i<N;i++) {
			int n = sc.nextInt();
			a1.add(n);
		}
//		 int max=0;
//		 int max1=0;
//		 for(int i=0;i<N;i++) {
//			 for(int j=i;j<N;j++) {
//				 if(a1.get(i)>a1.get(j)) {
//					 max1=max;
//					 max=a1.get(i);
//				 }
//			 }
//		 }
//		System.out.println(max);
		Collections.sort(a1);
		//System.out.println(a1);
		System.out.println(a1.get(N-2));
	}

}
