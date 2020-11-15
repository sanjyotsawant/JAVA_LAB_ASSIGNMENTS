// Write a Program to remove all white spaces from a string without using replace().

package ass3;

import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char[] a1 = s.toCharArray();
		String s1="";
		
		for(int i=0; i<a1.length; i++) {
			if(a1[i]==' ') {
				continue;
			}else {
				s1=s1+a1[i];
			}
		}
		System.out.println(s1);
	}

}
