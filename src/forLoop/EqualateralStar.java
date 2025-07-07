package forLoop;

import java.util.Scanner;

public class EqualateralStar {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("value = ");
		int a=sc.nextInt();

		for(int i=1;i<=a;i++) {
			for(int space=1;space<=a-i;space++) {
				System.out.print(" ");
			}
			for(int star=1;star<=i;star++) {
				System.out.print("* ");
			}System.out.println();
		}
	}

}
