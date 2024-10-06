

public class Computer {

    Tower tower;
    Monitor monitor;
    Mouse mouse;
    Keyboard keyboard;
    double computerPrice;

    public Computer(Tower tower, Monitor monitor, Mouse mouse, Keyboard keyboard) {
        this.tower = tower;
        this.monitor = monitor;
        this.mouse = mouse;
        this.keyboard = keyboard;
        this.computerPrice = tower.towerPrice + monitor.monitorPrice + mouse.mousePrice + keyboard.keyboardPrice;
    }

    public Computer() {
    }

    public void showInfoComputer() {
        System.out.printf("\n=================%s=======================\n", this.getClass().getName().toUpperCase());

        System.out.println("\nThis computer assembly consists of the following components: ");
        tower.showInfoTower();
        monitor.showInfoAboutMonitor();
        mouse.showInfoMouse();
        keyboard.showInfoKeyboard();

        System.out.println("\n==========================FINAL PRICE=============================");
        System.out.printf("The total cost of assembling the computer is equal to - %.2f$", computerPrice);
        System.out.println("\n==================================================================");
    }

}
