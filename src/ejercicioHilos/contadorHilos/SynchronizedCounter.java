package ejercicioHilos.contadorHilos;

public class SynchronizedCounter {
    private int contador=0;

    public synchronized void increment(){
            synchronized(this){
                contador++;
            }
    }
    public int getCont() {
        return contador;
    }

}
