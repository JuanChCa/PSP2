package ejercicioHilos.contadorHilos;

public class Main {
    public static void main(String[] args) {
        SynchronizedCounter cont = new SynchronizedCounter();
        Person[] persona = new Person[10];

       for(int i = 0;i<10;i++){
           persona[i]= new Person(cont);
           persona[i].start();
       }
        for(int i = 0;i<10;i++){
            try {
                persona[i].join();
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }

        System.out.println("Valor Final: " +cont.getCont());
    }
}
