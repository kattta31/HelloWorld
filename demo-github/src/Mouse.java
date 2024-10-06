public class Mouse {
    String mouseBrand;
    String mouseModel;
    int mouseQuantityButtons;
    String mouseColour;
    String typeOfMouse; //wired/wireless
    double mousePrice;

    public Mouse(String mouseBrand, String mouseModel, int mouseQuantityButtons, String mouseColour, String typeOfMouse, double mousePrice) {
        this.mouseBrand = mouseBrand;
        this.mouseModel = mouseModel;
        this.mouseQuantityButtons = mouseQuantityButtons;
        this.mouseColour = mouseColour;
        this.typeOfMouse = typeOfMouse;
        this.mousePrice = mousePrice;

    }

    public Mouse() {
    }

    public void showInfoMouse() {
        System.out.printf("\n=================%s======================", this.getClass().getName().toUpperCase());
        System.out.printf("\nInformation about mouse: \nBrand: %s\nModel: %s\nQuantity of buttons: %d\nColour: %s\nType of mouse: %s\nPrice: %.2f$\n",
                mouseBrand, mouseModel, mouseQuantityButtons, mouseColour, typeOfMouse, mousePrice);
    }
}
