package ass2;

import java.util.ArrayList;
import java.util.Scanner;

public class Q15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		ArrayList<Character> a1 = new ArrayList<Character>();
	
		for(int i=0; i<s1.length();i++) {
			a1.add(s1.charAt(i));
		}
		
		System.out.println("Enter Character: ");
		String s = sc.next();
		char c1 = s.charAt(0);
		
		for(int i=0; i<a1.size();i++) {
			if(a1.get(i)==c1) {
				a1.remove(i);
				i--;
			}
		}
		for(int i=0; i<a1.size();i++) {
			System.out.print(a1.get(i));
		}
	}

}
