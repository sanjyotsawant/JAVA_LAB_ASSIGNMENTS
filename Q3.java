package ass1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Q3 {
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
			
			System.out.println(a1.get(0)+" "+a1.get(N-1));
		}
	}
}
