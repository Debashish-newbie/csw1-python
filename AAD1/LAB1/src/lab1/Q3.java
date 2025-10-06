package lab1;
import java.util.Scanner;
public class Q3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the nth number: ");
		int d = sc.nextInt();
		int f = 0;
		int s = 1;
		int n = 0;
		
		for(int i  =0; i<d; i++) {
			System.out.print(f+" ");
			n = s+f;
			f=s;
			s=n;
			
			
			
		}
		
			
		}

	}


