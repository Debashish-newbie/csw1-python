import java.util.Scanner;

public class Q5 {

    // Binary search method
    static int binarySearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == key) {
                return mid; // key found, return index
            } else if (arr[mid] < key) {
                low = mid + 1; // search right half
            } else {
                high = mid - 1; // search left half
            }
        }

        return -1; // key not found
    }

    public static void main(String[] args) {
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

        

        int result=binarySearch(arr,key);
        System.out.println("found at index: "+result);
        sc.close();

        	}
}
