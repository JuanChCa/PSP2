package productorConsumidor;

import java.util.ArrayList;
import java.util.List;

public class Bufer {
private final List<Integer> espaciosDisponibles;
private final int espaciosTotales;

    public Bufer(int espaciosTotales) {
        this.espaciosTotales = espaciosTotales;
        this.espaciosDisponibles = new ArrayList<>();
    }
    public synchronized void ocuparEspaciosDisponibles(int matricula) throws InterruptedException {
    while (espaciosDisponibles.size() == espaciosTotales) {
        System.out.println("Estacionamiento lleno, el coche " + matricula + " tiene que esperar");
        wait();
    }
    espaciosDisponibles.add(matricula);
    System.out.println("Coche " + matricula + " ha aparcado");
    notifyAll();

    }
    public synchronized void liberarEspaciosDisponibles(int matricula) throws InterruptedException {
        while (espaciosDisponibles.isEmpty()) {
            wait();
        }
        espaciosDisponibles.remove(0);
        System.out.println("Coche " + matricula + " ha dejado un espacio libre.");
        notifyAll();

    }


}
