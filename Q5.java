package ass1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x=sc.nextInt();
		for(int i=0;i<x;i++) {
			int N = sc.nextInt();
			ArrayList<Integer> a1 = new ArrayList<Integer>();
			for(int j=0;j<N;j++) {
				int n = sc.nextInt();
				a1.add(n);
			}
			Collections.sort(a1);
			for(int j=N-1;j>=0;j--) {
				System.out.print(a1.get(j)+" ");
			}
		}	
	}

}
