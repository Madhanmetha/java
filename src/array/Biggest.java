package array;

public class Biggest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr=new int[3][3];
		int k=0;
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=Integer.parseInt(args[k++]);
				if(arr[i][j]>max) max=arr[i][j];
			}
		}System.out.println(max);
		
	}

}
