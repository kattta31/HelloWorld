

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
        this.computerPrice = tower.price + monitor.price + mouse.price + keyboard.price;
    }

    public Computer() {
    }

    public void showInfoComputer() {
        System.out.printf("\n=================%s=======================\n", this.getClass().getName().toUpperCase());

        System.out.println("\nThis computer assembly consists of the following components: ");
        tower.showInfo();
        monitor.showInfo();
        mouse.showInfo();
        keyboard.showInfo();

        System.out.println("\n==========================FINAL PRICE=============================");
        System.out.printf("The total cost of assembling the computer is equal to - %.2f$", computerPrice);
        System.out.println("\n==================================================================");

    }

    public static void addUpShowInfo(Showable... compons) {
        System.out.println("\nInformation about all components: ");

        double sum = 0;
        for (Showable compon : compons) {
            compon.showInfo();
            sum += compon.getPrice();

        }
        System.out.println("\n==========================FINAL PRICE=============================");
        System.out.printf("The total cost of assembling the computer is equal to - %.2f$", sum);
        System.out.println("\n==================================================================");

    }

}
