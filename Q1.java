package ass1;

import java.util.ArrayList;
import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i=0; i<T; i++){
			int N = sc.nextInt();
			ArrayList<Integer> a1 = new ArrayList<>();
			
			for(int j=0;j<N;j++) {
				int n = sc.nextInt();
				a1.add(n);
				
			}
			
			int X = sc.nextInt();
			
			int count = 0;
			for(int j=0;j<N;j++) {
				if( a1.get(j) <= X) {
					count++;
				}
			}
			System.out.println(count);
		}

	}

}
