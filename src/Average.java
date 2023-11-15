import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        int count=0;

        for (int i = 0; i < array.length; i++) {
            System.out.println(count+"-ci elementi daxil et: ");
            array[i]=scanner.nextInt();
            count++;

        }
        for (int elements : array) {
            System.out.println(elements);
        }






    }
}
