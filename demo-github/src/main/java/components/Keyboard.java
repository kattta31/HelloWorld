package components;

import java.util.Scanner;

public class Keyboard extends Component implements Showable {

    String typeOfKeyboard; //wired/wireless

    public Keyboard(String brand, String model, String typeOfKeyboard, double price) {
        this.brand = brand;
        this.model = model;
        this.typeOfKeyboard = typeOfKeyboard;
        this.price = price;
    }

    public Keyboard() {

    }

    public void showInfo() {
        System.out.printf("\n=================%s====================", this.getClass().getName().toUpperCase());
        System.out.printf("\nInformation about keyboard: \nBrand: %s\nModel: %s\nType of keyboard: %s\nPrice: %.2f$\n",
                brand, model, typeOfKeyboard, price);
    }
    public static Keyboard createNewKeyboard() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter keyboard specifications: \nBrand: " );
        String brand = scanner.nextLine();
        System.out.println("Model: ");
        String model = scanner.nextLine();
        System.out.println("Type of keyboard: ");
        String typeOfKeyboard = scanner.nextLine();
        System.out.println("Price: ");
        double price = scanner.nextDouble();
        Keyboard keyboard = new Keyboard(brand, model, typeOfKeyboard, price);
        return keyboard;
    }

    public String getInfo() {
        String info = String.format("\n=================%s===================="
        + "\nInformation about keyboard: \nBrand: %s\nModel: %s\nType of keyboard: %s\nPrice: %.2f$\n",
                this.getClass().getName().toUpperCase(), brand, model, typeOfKeyboard, price);
        return info;
    }
}