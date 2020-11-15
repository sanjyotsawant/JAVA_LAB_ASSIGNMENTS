package ass2;

import java.util.ArrayList;
import java.util.Scanner;

public class Q4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		char ch1[] = s1.toCharArray();
		String s2 = sc.next();
		char ch2[] = s2.toCharArray();
		
		ArrayList<Character> char1 = new ArrayList<Character>();
		for(char c:ch1) {
			char1.add(c);
		}
		
		//System.out.println(char1);
		
		ArrayList<Character> char2 = new ArrayList<Character>();
		for(char c:ch2) {
			char2.add(c);
		}
//		System.out.println(char2);
		
		
//		char ch3[] = new char[s2.length()];
//		int k=0;
		for(int i=0;i<char1.size();i++) {
			for(int j=0;j<char2.size();j++) {
				if(char1.get(i)==char2.get(j)) {
					char1.remove(i);
				}
//				else {
//					ch3[k]=ch2[j];
//					k++;
//					
//				}
			}
//			ch3[k]='\0';
//			k=0;
//			ch2=ch3;
		}
		for(char c:char1) {
			System.out.print(c);
		}
	}

}
