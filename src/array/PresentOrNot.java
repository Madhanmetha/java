package array;

import java.util.Scanner;

public class PresentOrNot {

	public static int check(int[] arr,int val) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==val)return i;
		}return -1;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("value = ");
		int n=sc.nextInt();
		System.out.print("Search =");
		int val=sc.nextInt();
		
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();	
		}
		int ans=check(arr,val);
		System.out.println(ans);
		

	}

}
