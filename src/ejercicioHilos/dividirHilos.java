package ejercicioHilos;

public class dividirHilos {
    public static void main(String[] args) {
        Hilo hilo1 = new Hilo(10, 5, "suma");
        Hilo hilo2 = new Hilo(10, 5, "resta");
        Hilo hilo3 = new Hilo(10, 5, "multiplicacion");



        hilo1.start();
        hilo2.start();
        hilo3.start();
    }

}

class Hilo extends Thread {
    private int num1, num2;
    private String operacion;

    public Hilo(int num1, int num2, String operacion) {
        this.num1 = num1;
        this.num2 = num2;
        this.operacion = operacion;

    }

    @Override
    public void run() {
        switch (operacion) {
            case "suma":
                System.out.println("Suma= " + (num1+num2));
            break;
            case "resta":
                System.out.println("Resta=: " + (num1-num2));
            break;
            case "multiplicacion":
                System.out.println("Multiplicacion: " + (num1*num2));
                break;
        }
    }

}

