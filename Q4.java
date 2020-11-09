package ass1;

import java.util.ArrayList;
import java.util.Scanner;
public class Q4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x=sc.nextInt();
		for(int i=0;i<x;i++) {
			int N = sc.nextInt();
			ArrayList<Integer> a1 = new ArrayList<Integer>();
			for(int j=0;j<N;j++) {
				int n = sc.nextInt();
				a1.add(n);
			}
			int sum=0;
			for(int j=0;j<N;j++) {
				sum+=a1.get(j);
			}

			System.out.println(sum);
		}


	}

}
