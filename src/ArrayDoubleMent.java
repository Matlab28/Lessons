import java.util.Scanner;

public class ArrayDoubleMent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int row = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();

        int[][] array = new int[row][columns];


        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Enter element at position: (" + i +", " + j +")" + ": " );
                array[i][j] = scanner.nextInt();
            }
        }

        System.out.println("The array you entered is:");
//
//        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i]);
//
//        }
//
//
//
//        System.out.println();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println(array[i][j]+ " ");
            }
            System.out.println();
        }


    }
}
