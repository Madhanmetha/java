package array;

import java.util.Arrays;
import java.util.Scanner;

public class Sort {

	
		public static void main(String[] args) {
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
			System.out.println(Arrays.toString(arr));

	}

}
