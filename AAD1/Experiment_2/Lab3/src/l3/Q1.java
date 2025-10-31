package l3;
import java.util.Arrays;

public class Q1 {
	
	
    public static void main(String[] args) {
        int[] arr = {3,2,1};
        int[] arr1 = {7,5,2,1};

     
        if (isSorted(arr1)) {
            System.out.println("The array is sorted.");
            if(arr[0]>arr[1]) {
        		System.out.println("Descending Order");
        	}
            else
            	System.out.println("Ascending  Order");
        } 
        else {
            System.out.println("The array is NOT sorted.");
        }
    }
    


    public static boolean isSorted(int[] arr) {
    
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false; 
            }
        }
 
        return true; 
    }
    
    }



	


