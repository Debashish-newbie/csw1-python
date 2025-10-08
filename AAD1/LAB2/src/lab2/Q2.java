package lab2;

public class Q2{
	public static void decHex(int n) {
		if(n==0)return;
		decHex(n/16);
		int rem = n%16;
		if(rem < 10) System.out.println(rem);
		else System.out.println((char)('A'+ rem-10));
		
	}

	public static void main(String[] args) {
		decHex(17);

	}

}
