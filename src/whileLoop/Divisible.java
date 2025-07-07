package whileLoop;


public class Divisible {

	public static void main(String[] args) {
		int a=1;
		int count=0;
		
		while(count <= 5) {
		
			if(a%2==0 && a%3==0 && a%5==0) {
				System.out.println(a);
				count++;
				}
			a++;
		
		}

	}

}
