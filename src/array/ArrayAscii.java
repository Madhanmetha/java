package array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayAscii {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("value = ");

		int n=sc.nextInt();
		
		int arr []= new int[n];
		char[] ascii=new char[n];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			ascii[i]=(char)arr[i];
			
		}
		System.out.println(Arrays.toString(ascii));

	}

}
