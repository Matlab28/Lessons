import java.util.Scanner;

public class Length {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");

        String words = scanner.nextLine();

        int count = 0;

        for (int i = 0; i < words.length(); i++) {
            count++;
        }

        System.out.println("The length of word" + count);
    }
}
