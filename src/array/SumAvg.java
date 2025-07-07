package array;

import java.util.Scanner;

public class SumAvg {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("value = ");
		int n=sc.nextInt();
		int sum=0;
		float avg=0;

		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			sum+=arr[i];
			
		}
		avg=(float)sum/n;
		System.out.println("Sum = "+sum);
		System.out.println("Avg = "+avg );
	}

}
