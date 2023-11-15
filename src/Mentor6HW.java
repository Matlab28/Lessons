import java.util.Scanner;

public class Mentor6HW {
    public static void main(String[] args) {
      Scanner scanner =new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int[] array = new int[scanner.nextInt()];


        int count=0;

        for (int i = 0; i < array.length; i++) {
            System.out.println(count+"-ci elementi daxil et: ");
           array[i]=scanner.nextInt();
           count++;

        }
        for (int elements : array) {
            System.out.println(elements);
        }

        int max=0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max)
                max=array[i];
        }
        System.out.println("Max element in the array: "+max);

        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Minimum element: " + min);


    }
}
