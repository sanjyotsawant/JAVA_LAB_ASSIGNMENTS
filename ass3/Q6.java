// Write a Program to check Armstrong number.

package ass3;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		int m=n;
		int rev=0;
		int a=0;
		while(n!=0) {
			rev=n%10;
			a=a+(rev*rev*rev);
			n=n/10;
		}
		if(a==m) {
			System.out.println("Number is Armstrog.");
		}else {
			System.out.println("Number is not Armstrog.");
		}
	}

}
