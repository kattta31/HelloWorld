package components;

import java.util.Scanner;

public class Mouse extends Component implements Showable {

    int mouseQuantityButtons;
    String mouseColour;
    String typeOfMouse; //wired/wireless

    public Mouse(String brand, String model, int mouseQuantityButtons, String mouseColour, String typeOfMouse, double price) {
        this.brand = brand;
        this.model = model;
        this.mouseQuantityButtons = mouseQuantityButtons;
        this.mouseColour = mouseColour;
        this.typeOfMouse = typeOfMouse;
        this.price = price;

    }

    public Mouse() {
    }

    public void showInfo() {
        System.out.printf("\n=================%s======================", this.getClass().getName().toUpperCase());
        System.out.printf("\nInformation about mouse: \nBrand: %s\nModel: %s\nQuantity of buttons: %d\nColour: %s\nType of mouse: %s\nPrice: %.2f$\n",
                brand, model, mouseQuantityButtons, mouseColour, typeOfMouse, price);
    }
    public static Mouse createNewMouse() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter mouse specifications: \nBrand: " );
        String brand = scanner.nextLine();
        System.out.println("Model: ");
        String model = scanner.nextLine();
        System.out.println("Quantity of buttons: ");
        int mouseQuantityButtons = scanner.nextInt();
        System.out.println("Colour: ");
        String mouseColour = scanner.nextLine();
        System.out.println("Type of mouse: ");
        String typeOfMouse = scanner.nextLine();
        System.out.println("Price: ");
        double price = scanner.nextDouble();
        Mouse mouse = new Mouse(brand, model, mouseQuantityButtons, mouseColour, typeOfMouse, price);
        return mouse;
    }

    public String getInfo() {
        String info = String.format("\n=================%s======================"
        + "\nInformation about mouse: \nBrand: %s\nModel: %s\nQuantity of buttons: %d\nColour: %s\nType of mouse: %s\nPrice: %.2f$\n",
                this.getClass().getName().toUpperCase(), brand, model, mouseQuantityButtons, mouseColour, typeOfMouse, price);
        return info;
    }

}
