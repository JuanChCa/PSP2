package ProcessBuilder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ejercicio2_ProcessBuilder {
    public static void main(String[] args) throws IOException {
        if (args.length == 0) {
            System.out.println("Debe proporcionar un comando como argumento.");
            return;
        }

        // Construimos el comando
        ProcessBuilder processBuilder = new ProcessBuilder();
        processBuilder.command("cmd.exe", "/C", String.join(" ", args));

        try {
            // Ejecutamos el comando
            Process process = processBuilder.start();

            // Leemos la salida del proceso
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            // Verificamos si hubo errores en la ejecución del comando
            int exitCode = process.waitFor();
            if (exitCode != 0) {
                System.out.println("Comando finalizado con errores (código de salida: " + exitCode + ")");
            }

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
