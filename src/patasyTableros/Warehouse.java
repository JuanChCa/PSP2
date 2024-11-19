package patasyTableros;

public class Warehouse {
    private final int MAX_LEGS = 6;
    private final int MAX_TABLETOPS = 2;
    private int actual_legs = 0;
    private int actual_tabletops = 0;


    public synchronized void storeLeg () throws InterruptedException {
        while (actual_legs == MAX_LEGS) {
            wait();
        }
        actual_legs++;
        System.out.println("Pata  almacenada " + actual_legs);
        notifyAll();
    }

    public synchronized void storeTabletop () throws InterruptedException {
        while (actual_tabletops == MAX_TABLETOPS) {
            wait();
        }
        actual_tabletops++;
        System.out.println("Tablero almacenado " + actual_tabletops);
        notifyAll();
    }

    public synchronized void buildTable () throws InterruptedException {
        while (actual_legs < 4 || actual_tabletops < 1) {
            wait();
        }
        actual_legs -= 4;
        actual_tabletops -= 1;
        System.out.println("Construyendo mesa...Quedan " + actual_legs + " patas y " + actual_tabletops + " tableros");
        notifyAll();


    }
}