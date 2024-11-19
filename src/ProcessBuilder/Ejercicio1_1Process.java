package ProcessBuilder;

import java.io.IOException;

public class Ejercicio1_1Process {
    public static void main(String[] args) throws IOException {
    ProcessBuilder pb = new ProcessBuilder();
        pb.command("notepad.exe");
        pb.start();
    }
}
