package menu;

import components.Computer;

import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    public static void startMenu() {
        int userChoice = -1;
        while (userChoice != 0) {
            System.out.println("Press 1 to create new components.Computer\n" +
                    "Press 2 to load previous record\n" +
                    "Press 0 to exit\n------------------\n" +
                    "Make your choice: ");
            Scanner scanner = new Scanner(System.in);
            userChoice = scanner.nextInt();
            switch (userChoice) {
                case 0:
                    System.out.println("End");
                    break;
                case 1:
                    System.out.println("You choose 1");
                    Computer.createNewComputer();
                    break;
                case 2:
                    System.out.println("You choose 2");
                    readFromFile();
                    break;

                default:
                    System.out.println("You input incorrect data ");
            }
        }
    }

    public static void writeToFile(Computer computer) {
        try {
            FileWriter file = new FileWriter("D:\\Java\\HW\\my_new_file.txt");
            file.write(computer.getInfoComputer());
            file.close();
        } catch (IOException e) {
            System.out.println("Sorry, cannot write to file. Full error message: " + e.getMessage());
        }

    }

    public static void readFromFile() {
        ArrayList<String> dataFromFile = new ArrayList<>();
        try {
            File file = new File("D:\\Java\\HW\\my_new_file.txt");
            Scanner fileScanner = new Scanner(file);

            while (fileScanner.hasNext()) {
                dataFromFile.add(fileScanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Sorry, no such file");
        }

        dataFromFile.forEach(System.out::println);

    }
}
