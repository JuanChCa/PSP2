package productorConsumidor;

public class claseCar extends Thread {

    private int matricula;
    private Bufer bufer;

    public claseCar(int matricula, Bufer bufer) {
        this.matricula = matricula;
        this.bufer = bufer;
    }


@Override
    public void run() {
        try {
            bufer.ocuparEspaciosDisponibles(matricula);
            Thread.sleep(getRandomParkingTime());
            bufer.liberarEspaciosDisponibles(matricula);



        } catch (InterruptedException e) {
            System.out.println("Coche " + matricula + " ha sido interrumpido.");
        }
    }
    private int getRandomParkingTime() {

        return (int)(Math.random() * 4000) + 1000;  // Tiempo entre 1000 y 5000 ms
    }
}




