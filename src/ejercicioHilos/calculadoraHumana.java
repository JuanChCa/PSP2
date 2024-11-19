package ejercicioHilos;


import java.util.Random;
import java.util.Scanner;

public class calculadoraHumana {
    public static void main(String[] args) {
        TareaCalcu calcu= new TareaCalcu();
        calcu.start();

        for(int i=10; i> 0;i--){

            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        calcu.StopTarea();

        System.out.println("\nFin del juego, puntuacion: "+calcu.getScore());
    }
}


class TareaCalcu extends Thread{

    int score=0;
    boolean continuar=true;

    public int getScore() {
        return score;
    }

    public void StopTarea(){
        continuar=false;
    }

    @Override
    public void run(){
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Comienzo de la calculadora Humana en . . . 3 2 1 Empezamos");
        while(continuar){
        int num1 = random.nextInt(10)+1;
        int num2 = random.nextInt(10)+1;
        int respuestaCorrecta= num1+num2;

            System.out.println("¿Cuanto es " +num1+ " + "+num2+" ? ");
            int respuestaUsuario= sc.nextInt();

            if(respuestaUsuario==respuestaCorrecta){
                score++;
                System.out.println("Correcto!");
            }else {
                System.out.println("Respuesta Incorrecta!!");

            }
        }
        sc.close();
    }
}