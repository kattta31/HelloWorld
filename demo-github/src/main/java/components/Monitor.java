package components;

import java.util.Scanner;

public class Monitor extends Component implements Showable {

    double monitorSize;
    int refreshRate;


    public Monitor(String brand, String model, double monitorSize, int refreshRate, double price) {
        this.brand = brand;
        this.model = model;
        this.monitorSize = monitorSize;
        this.refreshRate = refreshRate;
        this.price = price;

    }
    public Monitor() {

    }
    public void showInfo(){
        System.out.printf("\n=================%s====================", this.getClass().getName().toUpperCase());
        System.out.printf("\nInformation about monitor: \nBrand: %s\nModel: %s\nSize of screen: %.1f\nRefresh rate: %d\nPrice: %.2f$\n",
                brand, model, monitorSize, refreshRate, price);
    }
    public static Monitor createNewMonitor() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter monitor specifications: \nBrand: " );
        String brand = scanner.nextLine();
        System.out.println("Model: ");
        String model = scanner.nextLine();
        System.out.println("Size of screen: ");
        int monitorSize = scanner.nextInt();
        System.out.println("Refresh rate: ");
        int refreshRate = scanner.nextInt();
        System.out.println("Price: ");
        double price = scanner.nextDouble();
        Monitor monitor = new Monitor(brand, model, monitorSize, refreshRate, price);
        return monitor;
    }

    public String getInfo(){

        String info = String.format("\n=================%s====================" +
        "\nInformation about monitor: \nBrand: %s\nModel: %s\nSize of screen: %.1f\nRefresh rate: %d\nPrice: %.2f$\n",
                this.getClass().getName().toUpperCase(), brand, model, monitorSize, refreshRate, price);
        return info;
    }

}



