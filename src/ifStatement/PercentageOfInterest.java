package ifStatement;

import java.util.Scanner;

public class PercentageOfInterest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Gender = ");
		char a=sc.next().charAt(0);
		
		System.out.print("Age = ");
		int age=sc.nextInt();

		if(a=='F'||a=='f') {
			if(age>=1 && age<=58) {
				System.out.println("8.2% Interest");
			}else if(age>58 && age<=100) {
				System.out.println("9.2% Interest");
				
			}
		}if(a=='M'||a=='m') {
			if(age>=1 && age<=58) {
				System.out.println("8.4% Interest");
			}else if(age>58 && age<=100) {
				System.out.println("10.5% Interest");
				
			}
		}
	}

}
