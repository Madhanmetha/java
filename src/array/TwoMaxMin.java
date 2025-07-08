package array;

import java.util.Scanner;

public class TwoMaxMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("value = ");

		int n=sc.nextInt();
		
		int arr []= new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			for(int j=0;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			
		}
		System.out.println("smaller = "+arr[0]+" "+arr[1]);
		System.out.println("largest = "+arr[n-1]+" "+arr[n-2]);


	}

}
