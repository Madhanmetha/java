package forLoop;

import java.util.Scanner;

public class FloydTriangle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("value = ");
		int a=sc.nextInt();
		int k=1;
		
		for(int i=1;i<a;i++) {
			for(int j=1;j<i+1;j++) {
				System.out.print(k+"  ");
				k++;
			}
			System.out.println("");
		}
	}

}
