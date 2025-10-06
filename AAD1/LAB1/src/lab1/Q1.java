package lab1;
import java.util.Scanner;


public class Q1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number of n: ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		int sum =0;
		
		
		for(int i =0 ; i< arr.length; i++) {
			arr[i]= sc.nextInt();
			sum = sum + arr[i];
			
			System.out.println("Number "+(i+1)+" "+ arr[i]+" Sum: "+sum);
		}
		
		System.out.println("\nSum is: "+sum);

	}

}
