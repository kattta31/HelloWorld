public class Monitor {

    String monitorBrand;
    String monitorModel;
    double monitorSize;
    int refreshRate;
    double monitorPrice;
    String resolutionStandart; //HD/FHD/QHD/2K/4K

    public Monitor(String monitorBrand, String monitorModel, double monitorSize, int refreshRate, double monitorPrice, String resolutionStandart) {
        this.monitorBrand = monitorBrand;
        this.monitorModel = monitorModel;
        this.monitorSize = monitorSize;
        this.refreshRate = refreshRate;
        this.monitorPrice = monitorPrice;
        this.resolutionStandart = resolutionStandart;
    }
    public Monitor() {

    }
    public void showInfoAboutMonitor(){
        System.out.printf("\n=================%s====================", this.getClass().getName().toUpperCase());
        System.out.printf("\nInformation about monitor: \nBrand: %s\nModel: %s\nSize of screen: %.1f\nRefresh rate: %d\nResolution standart: %s\nPrice: %.2f$\n",
                monitorBrand, monitorModel, monitorSize, refreshRate, resolutionStandart, monitorPrice);
    }
}


