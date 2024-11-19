package hilosSopas;

public class Main {
    public static void main(String[] args) {
        claseRestaurante claserestaurante = new claseRestaurante();

        class Cocinero extends Thread {
            public void run () {
                try {
                    while (true) {
                        claserestaurante.prepararSopa();
                        if(claserestaurante.actual_tazones==claserestaurante.capacidadTazones){
                            System.out.println("El cocinero duerme");
                            Thread.sleep(500);
                        }
                    }
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }

        class Cliente extends Thread {
            public void run () {
                try {
                    claserestaurante.consumirSopa();
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        new Cocinero().start();

        for (int i = 0; i < 40; i++) {
            new Cliente().start();
        }
    }
}



















