package lab1;
import java.util.*;
import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
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

	}


