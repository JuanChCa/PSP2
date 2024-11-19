package ejercicioHilos;

public class TicTac {
    public static void main(String[] args) {
        Tic tic=new Tic();
        Tac tac=new Tac();

        tic.start();
        tac.start();
    }
}

class Tic extends Thread{
    @Override
    public void run() {
        try{
            while(true){
                System.out.println("Tic");
                Thread.sleep(500);
            }

        }catch(InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Tac extends Thread{
    @Override
    public void run() {
        try{
            while(true){
                System.out.println("Tac");
                Thread.sleep(500);
            }

        }catch(InterruptedException e) {
            e.printStackTrace();
        }
    }
}
