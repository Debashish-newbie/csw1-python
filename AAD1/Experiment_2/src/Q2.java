import java.util.Scanner;

public class Q2 {

	static long factorial(int n) {
		if(n==0 || n==1) return 1;
		return n*factorial(n-1);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.print("The number upto which u want it's factorial: ");
		int n= sc.nextInt();
		
		System.out.print("Factorial is: "+factorial(n));
		

	}

}
