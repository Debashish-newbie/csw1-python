import java.util.Scanner;

public class Q3 {

	static int fib(int n) {
		if(n==0) return 0;
		if(n==1) return 1;
		return fib(n-1)+fib(n-2);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.print("The number upto which u want it's fibonacci series: ");
		int n= sc.nextInt();
		
//		System.out.print(fib(0)+" "+fib(1));
		System.out.print(fib(n));
		

	}

}
