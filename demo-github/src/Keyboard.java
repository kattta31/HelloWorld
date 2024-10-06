public class Keyboard {
    String keyboardBrand;
    String keyboardModel;
    String typeOfKeyboard; //wired/wireless
    double keyboardPrice;

    public Keyboard(String keyboardBrand, String keyboardModel, String typeOfKeyboard, double keyboardPrice) {
        this.keyboardBrand = keyboardBrand;
        this.keyboardModel = keyboardModel;
        this.typeOfKeyboard = typeOfKeyboard;
        this.keyboardPrice = keyboardPrice;
    }

    public Keyboard() {

    }

    public void showInfoKeyboard() {
        System.out.printf("\n=================%s====================", this.getClass().getName().toUpperCase());
        System.out.printf("\nInformation about keyboard: \nBrand: %s\nModel: %s\nType of keyboard: %s\nPrice: %.2f$\n",
                keyboardBrand, keyboardModel, typeOfKeyboard, keyboardPrice);
    }
}