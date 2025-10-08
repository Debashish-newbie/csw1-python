import java.util.Scanner;

public class Q7 {
	
	static void hanoi(int n,char source,char auxilary,char destination) {
		if(n==1) {
			System.out.println("move disk 1 from "+source+" to "+destination);
			return ;
		}
		
		hanoi(n-1,source,destination,auxilary);
		System.out.println("move disk "+n+" from "+ source+" to "+destination);
		
		hanoi(n-1,auxilary,source,destination);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        hanoi(n,'A','B','c');

		

	}

}
