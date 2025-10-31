package l3;

public class Q2 {
	 public static void checkArray(int[] arr) {
	        if (arr.length < 2) {
	            System.out.println("Array is too small to determine order.");
	            return;
	        }

	        boolean ascending = true;
	        boolean descending = true;

	        for (int i = 0; i < arr.length - 1; i++) {
	            if (arr[i] < arr[i + 1]) {
	                descending = false;
	              
	            } else if (arr[i] > arr[i + 1]) {
	                ascending = false;
	               
	            }
	            System.out.println(i+" and "+i+1);
	            System.out.println("ascending: "+ascending);
	            System.out.println("descending: "+descending+"\n");
	        }

	        if (ascending) {
	            System.out.println("Array is sorted in ascending order.\n");
	        } else if (descending) {
	            System.out.println("Array is sorted in descending order.\n");
	        } else {
	            System.out.println("Array is not sorted.");
	        }
	 }
	
	    public static void main(String[] args) {
	        int[] arr1 = {1, 2, 3, 4, 5};
	        int[] arr2 = {9, 7, 1};
	        int[] arr3 = {3, 5, 2, 8};

	        checkArray(arr1);
	        checkArray(arr2);
	        checkArray(arr3);
	    }

	   
	    }
	
