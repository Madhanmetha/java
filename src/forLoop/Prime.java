package forLoop;

import java.util.Scanner;

public class Prime {
	
	static boolean isPrime(int a) {
		if(a!=0||a!=1) {
		for(int i=2;i<a/2;i++) {
			if(a%i==0) return false;
		}}return true;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("start = ");
		int a=sc.nextInt();
		System.out.print("end = ");
		int b=sc.nextInt();

		
		for(int i=a;i<=b;i++) {

			if(isPrime(i)) {
				System.out.print(i+"  ");
			}
		}
	}

}
