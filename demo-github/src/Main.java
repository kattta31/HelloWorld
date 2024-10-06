
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        ifClause();
        whileOperator();
        sumOfNumbers();
        remoteControl();
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
        String stopWord = "exit";

//        while (!userInput.equalsIgnoreCase(stopWord)) {
//            System.out.println("You've entered: " + userInput);
//            System.out.println("Please enter something: ");
//            userInput = scanner.nextLine();
//        }
        while (true) {

            System.out.println("You've entered: " + userInput);

            if (userInput.equalsIgnoreCase(stopWord)) {
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

        System.out.printf("Sum of numbers from 0 to %d is %d\n", userInput, sum);
    }

    ///////////////////////Task4////////////////////
    public static void remoteControl() {

        String[] channels = new String[9];
        channels[0] = "MTV";
        channels[1] = "Discovery Channel";
        channels[2] = "Animal Planet";
        channels[3] = "CNN";
        channels[4] = "BBC";
        channels[5] = "Nickelodeon";
        channels[6] = "Disney Channel";
        channels[7] = "Fox News";
        channels[8] = "Fox Sports";

        Scanner scanner = new Scanner(System.in);
        int userChoice;
        System.out.printf("Please enter channel number from 1 to %d: ", channels.length);

        do {
            userChoice = scanner.nextInt();
            switch (userChoice) {
                case 1 -> System.out.println(channels[0]);
                case 2 -> System.out.println(channels[1]);
                case 3 -> System.out.println(channels[2]);
                case 4 -> System.out.println(channels[3]);
                case 5 -> System.out.println(channels[4]);
                case 6 -> System.out.println(channels[5]);
                case 7 -> System.out.println(channels[6]);
                case 8 -> System.out.println(channels[7]);
                case 9 -> System.out.println(channels[8]);
                case 0 -> System.out.println("Exit");
                default -> System.out.println("Sorry, wrong selection. Try again: ");
            }

        } while (!(userChoice == 0));


    }


}


