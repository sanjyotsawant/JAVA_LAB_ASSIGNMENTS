package ass2;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter string to reverse:");
	 	Scanner sc = new Scanner(System.in);
	 	String s = sc.nextLine();
	 	String reverse = "";
	 	for(int i = s.length() - 1; i >= 0; i--)
	 	{
	 		reverse = reverse + s.charAt(i);
	 	}
	 	System.out.println("Reverse String is: "+reverse);
	}

}
