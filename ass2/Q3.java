package ass2;

import java.util.Arrays;
import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		char ch[] = s1.toCharArray();
		Arrays.sort(ch);
		char ch1[] = new char[s1.length()];
		int count=0;
		for(int i=0; i<ch.length; i++) {
			
			for(int j=i+1; j<ch.length;j++) {
				
				if(ch[i]==ch[j]) {
					ch1[count++]=ch[i];
					i++;
				}
				
			}
		}
		System.out.println(ch1);

	}

}
