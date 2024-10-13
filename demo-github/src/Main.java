import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Mouse workMouse = new Mouse("Logitech", "G102", 6, "black",
                "wired", 24.99);
        Mouse gameMouse = new Mouse("Razer", "RZ01-03850100-R3M1", 5, "black",
                "wired", 35);
        // workMouse.showInfoMouse();

        Monitor workMonitor = new Monitor("LG", "32GP850", 31.5, 165,
                399, "QHD");
        //  workMonitor.showInfoAboutMonitor();

        Keyboard workKeyboard = new Keyboard("A4Tech", "B140N", "wired", 21.99);
        // workKeyboard.showInfoKeyboard();

        Tower workTower = new Tower("Jet", "9i10900FD", 32, "Windows 11 pro", 1200.99);
        // workTower.showInfoTower();

        Computer workComputer = new Computer(workTower, workMonitor, workMouse, workKeyboard);
        workComputer.showInfoComputer();
        Computer.addUpShowInfo(workMouse, gameMouse, workMonitor, workKeyboard, workTower);


    }


}




