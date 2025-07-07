package ifStatement;

import java.util.Scanner;

public class CharOrder {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.next().charAt(0);
		int b=sc.next().charAt(0);
		
//		System.out.println(a);
//		System.out.println(b);
		
		if(a>b) System.out.println((char)b+", "+(char)a);
		else System.out.println((char)a+", "+(char)b);


	}

}
