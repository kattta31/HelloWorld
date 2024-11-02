package components;

import java.util.Scanner;

public class Tower extends Component implements Showable {

    int ramMemorySize;
    String operationSystem;

    public Tower(String brand, String model, int ramMemorySize, String operationSystem, double price) {
        this.brand = brand;
        this.model = model;
        this.ramMemorySize = ramMemorySize;
        this.operationSystem = operationSystem;
        this.price = price;
    }

    public Tower() {
    }

    public void showInfo() {
        System.out.printf("\n=================%s=======================", this.getClass().getName().toUpperCase());
        System.out.printf("\nInformation about tower: \nBrand: %s\nModel: %s\nRAM memory size: %d\nOperation system: %s\nPrice: %.2f$\n",
                brand, model, ramMemorySize, operationSystem, price);
    }

    public static Tower createNewTower() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter tower specifications: \nBrand: ");
        String brand = scanner.nextLine();
        System.out.println("Model: ");
        String model = scanner.nextLine();
        System.out.println("RAM memory size: ");
        int ramMemorySize = scanner.nextInt();
        System.out.println("Operation system: ");
        String operationSystem = scanner.nextLine();
        System.out.println("Price: ");
        double price = scanner.nextDouble();
        Tower tower = new Tower(brand, model, ramMemorySize, operationSystem, price);
        return tower;
    }

    public String getInfo() {
        String info = String.format("\n=================%s======================="
                        + "\nInformation about tower: \nBrand: %s\nModel: %s\nRAM memory size: %d\nOperation system: %s\nPrice: %.2f$\n",
                this.getClass().getName().toUpperCase(), brand, model, ramMemorySize, operationSystem, price);
        return info;
    }
}
