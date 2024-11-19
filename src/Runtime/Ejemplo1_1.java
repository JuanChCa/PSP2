package Runtime;

public class Ejemplo1_1 {
    public static void main(String[] args) {
        Runtime rt = Runtime.getRuntime();
        String comando="Notepad";
        Process p;

        try{
            p= rt.exec(comando);
            p.waitFor();
            System.out.println("Termine con los deberes");

        }catch(Exception e){
            System.out.println("Error en" +comando);
            e.printStackTrace();
        }
    }
}
