package basic;

public class CommandlineArguments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length!=2) {
			System.out.println("error in input");
			return;
		}
		
		String a=args[0];
		String b=args[1];
		System.out.println(a+" Technologies "+b);

		
	}

}
