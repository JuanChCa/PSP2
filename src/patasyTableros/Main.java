package patasyTableros;

public class Main {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();


        class productorLegs extends Thread{
            public void run() {
                try{
                 while (true){
                     warehouse.storeLeg();
                     Thread.sleep(500);

                    }
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
        }

        class tabletopProducer extends Thread{
            public void run() {
                try {
                    while (true){
                        warehouse.storeTabletop();
                        Thread.sleep(2000);
                    }
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        }
        class tableBuilder extends Thread{
            public void run() {
                try{
                    while (true){
                        warehouse.buildTable();
                        Thread.sleep(2500);
                    }
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        }

        new productorLegs().start();
        new tabletopProducer().start();
        new tableBuilder().start();
    }
}
