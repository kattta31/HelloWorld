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
}
