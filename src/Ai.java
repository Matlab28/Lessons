import java.util.Scanner;

public class Ai {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Create an array of the specified size
        int[] array = new int[size];

        // Prompt the user to enter elements of the array
        System.out.println("Enter the elements of the array:");

        // Use a loop to read elements into the array
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // Calculate the sum of the array elements
        double sum = 0;
        for (int value : array) {
            sum = sum + value;
            // sum += valiue
        }

        // Display the sum
        System.out.println("Sum of the array elements: " + sum);

        double average = sum / array.length;
        System.out.println("Average : " + average );
    }
}
