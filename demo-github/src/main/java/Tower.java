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
}
