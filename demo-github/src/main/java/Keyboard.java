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
}