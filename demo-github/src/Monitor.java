public class Monitor extends Component implements Showable {

    double monitorSize;
    int refreshRate;
    String resolutionStandart; //HD/FHD/QHD/2K/4K

    public Monitor(String brand, String model, double monitorSize, int refreshRate, double price, String resolutionStandart) {
        this.brand = brand;
        this.model = model;
        this.monitorSize = monitorSize;
        this.refreshRate = refreshRate;
        this.price = price;
        this.resolutionStandart = resolutionStandart;
    }
    public Monitor() {

    }
    public void showInfo(){
        System.out.printf("\n=================%s====================", this.getClass().getName().toUpperCase());
        System.out.printf("\nInformation about monitor: \nBrand: %s\nModel: %s\nSize of screen: %.1f\nRefresh rate: %d\nResolution standart: %s\nPrice: %.2f$\n",
                brand, model, monitorSize, refreshRate, resolutionStandart, price);
    }
}


