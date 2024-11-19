package ejercicioHilos.contadorHilos;

public class Person extends Thread {
   private SynchronizedCounter cont;

   public Person(SynchronizedCounter cont) {
       this.cont=cont;

   }
   public void run() {
       for (int i = 0; i < 1000; i++){
           cont.increment();
            }
       }
   }

