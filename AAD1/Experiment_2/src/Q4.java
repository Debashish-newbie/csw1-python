import java.util.Scanner;
public class Q4 {
	
	static int search(int[]arr,int key) {
		

		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==key) {
				return i;
			}
			
		}
		return -1;
		
	}

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.print("The number upto which index u want : ");

		int n=sc.nextInt();
		int[]arr=new int[n];
		
        System.out.println("Enter the elements in sorted order (for binary search):");
        
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		 System.out.println("Enter the key:");
		int key=sc.nextInt();
		
		
int result=search(arr,key);
System.out.println("found at index: "+result);
sc.close();

	}

}
