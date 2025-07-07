package array;

public class AsciiToChar {

	public static void main(String[] args) {
		int[] arr = new int[26] ;
		int a=0;
		
        for (int i = 65; i < arr.length+65; i++) {
        	arr[a]=i;
        	System.out.print((char) arr[a]); 
        	a++;
        }
    }	
}