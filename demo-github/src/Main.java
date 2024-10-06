import java.net.SocketTimeoutException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        //  ifClause();
        //  whileOperator();
        sumOfNumbers();
    }

    ///////////////////////Task1////////////////////
    public static void ifClause() {
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
    }

    ///////////////////////Task2////////////////////
    public static void whileOperator() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter something: ");
        String userInput = scanner.nextLine();
        String stopword = "exit";

//        while (!userInput.equalsIgnoreCase(stopword)) {
//            System.out.println("You've entered: " + userInput);
//            System.out.println("Please enter something: ");
//            userInput = scanner.nextLine();
//        }
        while (true) {

            System.out.println("You've entered: " + userInput);

            if (userInput.equalsIgnoreCase(stopword)) {
                break;
            }
            System.out.println("Please enter something: ");
            userInput = scanner.nextLine();
        }
        System.out.println("You are out of the loop.");
    }

    ///////////////////////Task3////////////////////
    public static void sumOfNumbers() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int userInput = scanner.nextInt();
        int sum = 0;


//        for (int i = 0; i <= Math.abs(userInput); i++) {
//            if (userInput < 0) {
//                sum -= i;
//            } else {
//                sum += i;
//            }
//        }

//        if (userInput < 0) {
//            for (int i = 0; i >= userInput; i--) {
//                sum += i;
//            }
//        } else {
//            for (int i = 0; i <= userInput; i++) {
//                sum += i;
//            }
//        }

        if (userInput < 0) {
            for (int i = userInput; i <= 0; i++) {
                sum += i;
            }
        } else {
            for (int i = 0; i <= userInput; i++) {
                sum += i;
            }
        }

        System.out.printf("Sum of numbers from 0 to %d is %d", userInput, sum);
    }


}


