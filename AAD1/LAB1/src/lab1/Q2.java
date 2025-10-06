package lab1;
import java.util.Scanner;
public class Q2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number to find factorial: ");
		
		int n = sc.nextInt();
		int temp =n;
		int fact = 1;
		while(n>0) {
			fact = fact*n;
			n--;
		}
		System.out.println("Factorial of "+temp+" is: "+fact);
	}

}
