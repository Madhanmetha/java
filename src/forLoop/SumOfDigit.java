package forLoop;

import java.util.Scanner;

public class SumOfDigit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("value = ");
		int a=sc.nextInt();
		int sum=0;
		for(;a>0;a/=10) {
			int rem=a%10;
			sum+=rem;
		}
		System.out.println(sum);
	}

}
