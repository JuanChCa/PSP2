package hilosSopas;

public class claseRestaurante {
    public final int capacidadTazones=4;
    public int actual_tazones=0;


    public synchronized void prepararSopa () throws InterruptedException {
        while (actual_tazones==capacidadTazones) {
            wait();
        }
        actual_tazones++;
        System.out.println("Preparando Sopa "+actual_tazones);
        notifyAll();
    }

    public synchronized void consumirSopa () throws InterruptedException {
        while(actual_tazones==0){
            System.out.println("Se espera a que la sopa este lista ");
            wait();
        }
        actual_tazones--;
        System.out.println("Consumiendo Sopa " + actual_tazones);
        notifyAll();
    }

}



