package ass2;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		int n = s1.length();
		boolean match = false;
		
		if(n != s2.length()) {
			System.out.println("Strings are not rotating");
		}else {
			for(int i=0; i<n; i++) {
				match=true;
				for(int j=0; j<n ;j++) {
					if(s1.charAt((i+j)%n)!= s2.charAt(j)) {
						match = false;
						break;
					}
					
				}
				if(match) {
					System.out.println("Strings are rotating");
					break;
				}
			}
			if(!match) {
				System.out.println("Strings are not rotating");
			}
			
		}
		
		
	}

}
