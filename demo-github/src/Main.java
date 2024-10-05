import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        System.out.print("Please enter your score: ");

        Scanner scanner = new Scanner(System.in);
        int userScore = scanner.nextInt();

        while (userScore > 100 || userScore < 0) {
            System.out.println("Incorrect value. Please enter a number from 0 to 100 !");
            System.out.print("Please enter your score: ");
            userScore = scanner.nextInt();
        }
        if (userScore >= 90) {
            System.out.println("Your grade is A!");
        } else if (userScore >= 80) {
            System.out.println("Your grade is B!");
        } else if (userScore >= 70) {
            System.out.println("Your grade is C!");
        } else if (userScore >= 60) {
            System.out.println("Your grade is D!");
        } else if (userScore >= 50) {
            System.out.println("Your grade is E!");
        } else {
            System.out.println("Your grade is F!");
        }

        System.out.println("End of Program");
    }


}