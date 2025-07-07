package ifStatement;

import java.util.Scanner;

public class CaseChange {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char input=sc.next().charAt(0);
		
		int a=input;
		if(a>=97) {
			a=a-32;
			System.out.println((char)a);
			return;
		}
		if(a<=90) {
			a=a+32;
			System.out.println((char)a);
		}
			
	}

}
