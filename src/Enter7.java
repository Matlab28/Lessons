import com.sun.jdi.IntegerValue;

import java.util.Scanner;

public class Enter7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the names of students: ");
        String names = scanner.nextLine();
        System.out.print("Enter the scores of students: ");
        int scores = scanner.nextInt();

        int[][] namesOfStudents = new int[Integer.parseInt(names)][scores];

        for (int i = 0; i < namesOfStudents.length; i++) {
            for (int j = 0; j < namesOfStudents[i].length; j++) {
                System.out.println(namesOfStudents[i][j]);
            }
        }
    }
}
