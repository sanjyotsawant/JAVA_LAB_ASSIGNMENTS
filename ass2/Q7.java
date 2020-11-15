package ass2;

import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter string to reverse:");
		 Scanner sc = new Scanner(System.in);
		 String str = sc.nextLine();
		String rev = new StringBuilder(str).reverse().toString();

		System.out.println("Reverse of the given string is : " + rev);
	}

}
