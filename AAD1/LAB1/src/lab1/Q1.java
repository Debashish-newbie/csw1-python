package lab1;
import java.util.Scanner;


public class Q1 {
   public static void sumOfn() {
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
   
   public static void fact() {
	   System.out.print("Enter a number to find factorial: ");
	   Scanner sc = new Scanner(System.in);
		int p = sc.nextInt();
		int temp =p;
		int fact = 1;
		while(p>0) {
			fact = fact*p;
			p--;
		}
		System.out.println("Factorial of "+temp+" is: "+fact);
   }
   public static void fibo() {
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
   public static void linearSearch() {
	   Scanner sc = new Scanner(System.in);
		

		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		int arr[] = {2,4,5,73,6,7,9,21,5,12,64}; 
		
		for(int i = 0; i<arr.length; i++) {
			if (arr[i]== num){
			System.out.println("Number found on index: "+(i+1));
			}
			else {
				System.out.println("Number is not present on index: "+(i+1));
			}
		}
   }
  static void  binarySearch() {

	Scanner sc = new Scanner(System.in);
        System.out.print("The number upto which index u want : ");

        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements in sorted order (for binary search):");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the key:");
        int key = sc.nextInt();

    
    
        int low = 0;
        int high = arr.length - 1;
		int newn ;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == key) {
                newn  = mid ;// key found, return index
            } else if (arr[mid] < key) {
                low = mid + 1; // search right half
            } else {
                high = mid - 1; // search left half
            }
        }

        newn = -1; 
 System.out.println("found at index: "+newn);
        
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter what do you want to do: 1 to 5");
		System.out.println("1: Sum on n numbers");
		System.out.println("2: Factorial of a number");
		System.out.println("3: Nth fibonacci series");
		System.out.println("4: Linear Search");
		System.out.println("5: Binary Search");
		System.out.println("0: Exit");
		int pref = sc.nextInt();
		
		switch(pref) {
		default:
			System.out.println("Enter only numbers between 1 ro 5");
		case 1: sumOfn();
		break;
		case 2 : fact();
		break;
		case 3: fibo();
		break;
		case 4: linearSearch();
		break;
		case 5 : binarySearch();
		break;
		case 0: break;
		
			
		}
			
				
		
	

	}

}
