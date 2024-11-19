package ud1_procesos;

public class ejemplo3 {
    Runtime r=Runtime.getRuntime();;

    void mostrarInfo(){
         r.availableProcessors();
        System.out.println(r.availableProcessors());
    }

    void mostraEntorno() {
        r.totalMemory();
        System.out.println("Mem Total: " + r.totalMemory());

        r.freeMemory();
        System.out.println("Mem Libre: " + r.freeMemory());
    }

    void NetejaFem(){
            this.r.gc();
        }


        public static void main(String[] args) throws Exception {

          //  RuntimeDemo rd=new Runtimedemo;

          // rd.mostrarInfo();
            System.out.println("\nEstado inicial..");

            //Llenamos la memoria
          //  rd.mostraEntorno();
            for(int i=0;i<=10000;i++){
                new Object();
            }

            System.out.println("\nEstado después de crear 10.000 objects");
           // rd.mostraEntorno();

            // Llamamos al colector de basura
         //  rd.NetejaFem();

            System.out.println("\nEstado colector de basura");
            //rd.mostraEntorn();
        }
    }


