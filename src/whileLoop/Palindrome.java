package whileLoop;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("value = ");
		int a=sc.nextInt();
		int temp=a;
		int rev=0;
		int rem=0;
		
		while(a>0) {
			rem=a%10;
			rev=rev*10+rem;
			a/=10;
		}

		if(temp==rev) System.out.println("its Palindrome");
		
		else System.out.println("not a Palindrome");
	}

}
