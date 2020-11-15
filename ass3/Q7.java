// Write a Program to remove all white spaces from a string with using replace().

package ass3;

import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		//System.out.println(s);
		s = s.replaceAll("\\s", "");
		System.out.println(s);
	}

}
