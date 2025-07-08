package array;

import java.util.*;

public class Duplicate {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("value = ");
		int n=sc.nextInt();
		
		ArrayList<Integer> List=new ArrayList<>();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();

		}  
		
		for(int i=0;i<arr.length;i++) {
			int count=0;
			for(int j=0;j<List.size();j++) {
				if(arr[i]==List.get(j)) {
					count++;
					break;
				}
			}
			if(count==0) List.add(arr[i]);
		}
		System.out.println(List);

	}

}
