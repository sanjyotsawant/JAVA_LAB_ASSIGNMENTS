package ass2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		char ch[] = s1.toCharArray();
		char ch1[] = new char[s1.length()];
		int count=0;
		for(int i=0;i<ch.length;i++) {
			int j;
			for(j=0; j<i;j++) {
				if(ch[i]==ch[j]) {
					break;
				}
			}
			if(i==j) {
				ch1[count++]=ch[i];
			}
		}
		System.out.println(ch1);
	}
	
}
