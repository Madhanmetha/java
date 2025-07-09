package forLoop;
import java.util.*;

public class ReverseArray {

	public static void main(String[] args) {
		int arr[][]=new int[2][2];

		int k=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=Integer.parseInt(args[k]);
				k++;
			}
			
			
		}
		
		int temp=arr[1][1];
		arr[1][1]=arr[0][0];
		arr[0][0]=temp;
		
		int temp1=arr[0][1];
		arr[0][1]=arr[1][0];
		arr[1][0]=temp1;
		
		
		for(int i[]:arr) {
			System.out.println(Arrays.toString(i));
			
		}
	}
}
