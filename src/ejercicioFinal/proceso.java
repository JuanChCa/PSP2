package ejercicioFinal;

import java.io.*;
import java.util.Scanner;

public class proceso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el comando o programa a ejecutar:");
        String comando = scanner.nextLine();

        ProcessBuilder processBuilder = new ProcessBuilder(comando.split(" "));

        try {
            Process process = processBuilder.start();

            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            StringBuilder output = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                output.append(line);
            }

            int exitCode = process.waitFor();
            if (exitCode == 0) {
                System.out.println("El programa se ejecutó correctamente.");
            } else {
                System.out.println("Hubo un error en la ejecución del programa. Código de salida: " + exitCode);
            }

            System.out.println("¿Quieres guardar la salida en un archivo de texto o imprimirla por pantalla? (archivo/pantalla):");
            String opcion = scanner.nextLine();

            if (opcion.equalsIgnoreCase("archivo")) {
                System.out.println("Introduce el nombre del archivo:");
                String nombreArchivo = scanner.nextLine();
                guardarEnArchivo(output.toString(), nombreArchivo);
                System.out.println("Salida guardada en " + nombreArchivo);
            } else {
                System.out.println("Salida del programa:");
                System.out.println(output);
            }

        } catch (IOException e) {
            System.out.println("Error al ejecutar el programa: " + e.getMessage());
        } catch (InterruptedException e) {
            System.out.println("El proceso fue interrumpido: " + e.getMessage());
        }
    }

    private static void guardarEnArchivo(String contenido, String nombreArchivo) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivo))) {
            writer.write(contenido);
        } catch (IOException e) {
            System.out.println("Error al guardar en el archivo: " + e.getMessage());
        }
    }
}
