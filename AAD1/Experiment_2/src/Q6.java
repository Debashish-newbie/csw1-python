import java.util.Scanner;

public class Q6 {
static void token(int n) {
	if(n==0)
		return;
	token(n/16);
	int rem =n%16;
	if(rem<10)
		System.out.println(rem);
	else
		System.out.println((char)('A'+ rem-10));
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner sc = new Scanner(System.in);
		 int n=sc.nextInt();
		 if(n==0)
			 System.out.println("0");
		 else
			 token(n);
		 System.out.println();

	}

}
