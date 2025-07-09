package array;
import java.util.*;

public class SumOfArray6_7 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.print("Total elements = ");
		int n=sc.nextInt();
		int a=0;
		int b=0;
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		int sum=0;
		boolean skip=false;
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]==6) skip=true;
			
			
			if(skip==false) sum+=arr[i];
			
			if(arr[i]==7) skip=false;

						
		}System.out.println(sum);
		
		
	}

}
