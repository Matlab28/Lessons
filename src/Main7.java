import java.util.Arrays;
import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the brand of car: ");
        String brand = scanner.nextLine();
        System.out.print("Enter the model of car: ");
        String model = scanner.nextLine();
        System.out.print("Enter the year of car: ");
        int year = scanner.nextInt();

        int[][] allOfThem = new int[Integer.parseInt(brand)][Integer.parseInt(model)];
        int[] yearOfTheCar = new int[year];

        for (int i = 0; i < allOfThem.length; i++) {
            for (int j = 0; j < allOfThem[i].length; j++) {
                
            }
        }





//        String[][] together = new String[brand.length()][model.length()];
//
//        int[] yearOfCar = new int[year];

//        String[][] both = new String[Integer.parseInt(brand)][Integer.parseInt(model)];
//        int[] yearOfCar = new int[year];

//        for (int i = 0; i < together.length; i++) {
//            for (int j = 0; j < together[i].length; j++) {
//                System.out.println(together[i][j]);
//            }
//        }
//
//            System.out.println();
//
//        for (int i = 0; i < yearOfCar.length; i++) {
//            for (int j = 0; j < yearOfCar[i]; j++) {
//                System.out.println(yearOfCar[i]);
//            }
//        }
//    }

}
