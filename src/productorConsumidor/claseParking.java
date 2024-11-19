package productorConsumidor;

public class claseParking {
    public static void main(String[] args) {
        int numeroEspacios = 10;
        int numCoches = 15;

        Bufer bufer = new Bufer(numeroEspacios);

        for (int i = 1; i <= numCoches; i++) {
            new claseCar(i, bufer).start();
        }
    }


}

