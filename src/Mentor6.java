import java.util.Scanner;
import java.util.concurrent.ScheduledExecutorService;

public class Mentor6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the lower bound of number: ");
        int number1 = scanner.nextInt();
        System.out.print("Enter the higher bound of number: ");
        int number2 = scanner.nextInt();

        for (int i = number1; i < number2; i++) {
            boolean checker = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    checker = false;
                    break;
                }
            }

            if (checker) {
                System.out.print(i + ", ");
            }
        }
    }
}
