package L7;
import java.util.Scanner;
import java.util.Arrays;

public class q3 {

    static class ArrayStack {
        private int[] arr;
        private int top;
        private int capacity;

        public ArrayStack(int size) {
            arr = new int[size];
            capacity = size;
            top = -1;
        }

        public void push(int value) {
            if (isFull()) {
                System.out.println("Stack Overflow!");
                return;
            }
            arr[++top] = value;
        }

        public int pop() {
            if (isEmpty()) {
                System.out.println("Stack Underflow!");
                return -1;
            }
            return arr[top--];
        }

        public boolean isEmpty() {
            return top == -1;
        }

        public boolean isFull() {
            return top == capacity - 1;
        }

        public void display() {
            if (isEmpty()) {
                System.out.println("Stack is Empty!");
                return;
            }
            System.out.print("Stack (top -> bottom): ");
            for (int i = top; i >= 0; i--) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }

        public int[] toArray() {
            int[] temp = new int[top + 1];
            for (int i = 0; i <= top; i++) {
                temp[i] = arr[i];
            }
            return temp;
        }

        public void clear() {
            top = -1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of stack: ");
        int n = sc.nextInt();

        ArrayStack stack = new ArrayStack(n);

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            stack.push(sc.nextInt());
        }

        System.out.println("\nOriginal Stack:");
        stack.display();

        // Convert to array and sort in descending order
        int[] arr = stack.toArray();
        Arrays.sort(arr);
        // Reverse array for descending order
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }

        // Clear stack and push sorted elements
        stack.clear();
        for (int value : arr) {
            stack.push(value);
        }

        System.out.println("\nStack Sorted in Descending Order:");
        stack.display();

        // Insert 2 into descending stack                   
        int[] newArr = new int[arr.length + 1];
        boolean inserted = false;
        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (!inserted && 2 > arr[i]) { // insert where 2 > current element
                newArr[idx++] = 2;
                inserted = true;
            }
            newArr[idx++] = arr[i];
        }
        if (!inserted) {
            newArr[idx] = 2; // insert at end if smallest
        }

        // Clear stack and push new sorted elements
        stack = new ArrayStack(newArr.length);
        for (int value : newArr) {
            stack.push(value);
        }

        System.out.println("\nStack after inserting 2 (descending):");
        stack.display();
    }
}
