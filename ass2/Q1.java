package ass2;

import java.util.Arrays;
import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char ch[] = s.toCharArray();
		
		char ch1 = 'a' ;
		char ch2 = 'a';
		int max = 0;
		for(int i=0;i<ch.length;i++) {
			int count=0;
			ch1=ch[i];
			for(int j=i+1;j<ch.length;j++) {
				
				if(ch[i]==ch[j]) {
					count++;
					//System.out.println(count);
				}
			}
			if(max < count) {
				max=count;
				ch2=ch1;
			}
		}
		System.out.println(ch2);
	}

}
