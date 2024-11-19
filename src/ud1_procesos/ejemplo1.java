package ud1_procesos;

import java.io.IOException;

import static java.lang.Runtime.*;

public class ejemplo1 {
    public static void main(String[] args)  {
        try {
            Process proceso = getRuntime().exec("Notepad.exe notas.txt");
            int codigoRetorno = proceso.waitFor();
            System.out.println("Fin de la ejecucion"+ codigoRetorno);
        } catch (IOException  |  InterruptedException e){
            throw new RuntimeException(e);
        }
    }
}
