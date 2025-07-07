package ifStatement;
import java.util.*;

public class PositiveNegativeZero {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		int a=sc.nextInt();
		
		if(a>0) System.out.println("Positive");
		else if(a<0) System.out.println("Negative");
		else if(a==0) System.out.println("zero");
		
	}

}
