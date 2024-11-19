package finalEjercicio;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class finalEjercicio {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe que comando que quieres usar: ");
        String comando = scanner.nextLine();

        System.out.println("Elige entre archivo/pantalla: ");
        String option = scanner.nextLine();

        ProcessBuilder process;

        if (option == "archivo") {
            System.out.println("Introduzca el nombre del archivo: ");
            String archivo = scanner.nextLine();

            process = new ProcessBuilder("C:\\Windows\\System32\\cmd.exe", "/C", comando);
            process.redirectOutput(new File(archivo));

            try {
                Process p = process.start();


                int codigoRetorno = p.waitFor();
                if (codigoRetorno == 0) {
                    System.out.println("Se ha guardado en:  " + archivo);
                } else {
                    System.out.println("Codigo de la ejecucion:  " + codigoRetorno);
                }
            } catch (IOException | InterruptedException e) {
                System.out.println("Error: " + e.getMessage());
            }

        } else if (option== "pantalla") {
            process = new ProcessBuilder("C:\\Windows\\System32\\cmd.exe","/C", comando);

            try {
                Process p = process.start();
                BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }

                int codigoRetorno = p.waitFor();
                if (codigoRetorno == 0) {
                    System.out.println("Ejecución correcta");
                } else {
                    System.out.println("Se ha ejecutado incorrectamente: " + codigoRetorno);
                }
            } catch (IOException | InterruptedException e) {
                System.out.println("Error al ejecutar el comando: " + e.getMessage());
            }
        } else {
            System.out.println("Opción no válida.");
        }
    }
}
