package ud1_procesos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ejemplo2 {
    public static void main(String[] args) throws IOException {
        Process process= Runtime.getRuntime().exec("ping www.google.com");
        BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
        String linea="";
        while ((linea=reader.readLine())!= null){
            System.out.println(linea);
        }
        System.out.println("Tu sistema operativo es: "+System.getProperty("os.name"));
    }
}
