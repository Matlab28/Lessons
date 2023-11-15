public class Eassy7 {
    public static void main(String[] args) {
        System.out.println("Names of students and their scores:");

        String[][] name1 = {
                {"Farhad", "56", "78", "98"},
                {"Fuad", "99", "35", "89"},
                {"Rufat", "45", "76", "88"}
        };

        for (int i = 0; i < name1.length; i++) {
            for (int j = 0; j < name1[i].length; j++) {
                System.out.println(name1[i][j]);
            }
            System.out.println("------------");
        }

    }
}
