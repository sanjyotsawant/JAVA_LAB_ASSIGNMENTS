// Write a Program to iterate ArrayList using for-loop, while-loop


package ass3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			a1.add(sc.nextInt());
		}
		System.out.println("BY USING FOR LOOP");
		for(Integer a : a1) {
			System.out.print(a+" ");
		}
		System.out.println("");
		
		System.out.println("BY USING WHILE LOOP");
		Iterator it = a1.iterator();
		
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
			

	}

}
