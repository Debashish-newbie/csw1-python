import java.util.Scanner;

public class Q1 {

	static int sum(int n) {
		if(n==0) return 0;
		return n+sum(n-1);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.print("The number upto which u want it's sum: ");
		int n= sc.nextInt();
		
		System.out.print("Sum is: "+sum(n));
		

	}

}
