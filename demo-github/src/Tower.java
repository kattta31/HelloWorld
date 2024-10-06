public class Tower {
    String towerBrand;
    String towerModel;
    int ramMemorySize;
    String operationSystem;
    double towerPrice;

    public Tower(String towerBrand, String towerModel, int ramMemorySize, String operationSystem, double towerPrice) {
        this.towerBrand = towerBrand;
        this.towerModel = towerModel;
        this.ramMemorySize = ramMemorySize;
        this.operationSystem = operationSystem;
        this.towerPrice = towerPrice;
    }

    public Tower() {
    }

    public void showInfoTower() {
        System.out.printf("\n=================%s=======================", this.getClass().getName().toUpperCase());
        System.out.printf("\nInformation about tower: \nBrand: %s\nModel: %s\nRAM memory size: %d\nOperation system: %s\nPrice: %.2f$\n",
                towerBrand, towerModel, ramMemorySize, operationSystem, towerPrice);
    }
}
