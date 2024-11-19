   /* package ejEstudiantes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RegistroEstudiantes reg = new RegistroEstudiantes();
        int opcion;

        do{
            System.out.println("Menu");
            System.out.println("1.Agregar Estudiante");
            System.out.println("2.Mostrar Estudiante");
            System.out.println("3.Buscar Estudiante");
            System.out.println("4.Eliminar Estudiante");
            System.out.println("5.Salir");

            System.out.println("Introduce la opción deseada: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch(opcion){
                case 1:
                    System.out.println("Ingrese el nombre del estudiante: ");
                    String nombre = sc.nextLine();
                    System.out.println("Ingrese la edad del estudiante: ");
                    int edad = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Ingrese la matricula del estudiante: ");
                    String matricula = sc.nextLine();
                    reg.agregarEstudiantes(nombre, edad, matricula);
                        break;
                    case 2:
                        reg.mostrarEstudiantes();
                        break;
                    case 3:
                        System.out.println("Ingresa la matricula del estudiante: " );
                        String matriculaBuscar = sc.nextLine();
                        reg.buscarEstudiantes(matriculaBuscar);
                        break;
                    case 4:
                        System.out.println("Ingresa la matricula del estudiante para eliminar: " );
                        String matriculaEliminar = sc.nextLine();
                        reg.EliminarEstudiantes(matriculaEliminar);
                        System.out.println("Estudiante eliminados");
                        break;
                    case 5:
                        System.out.println("Saliendo del programa...");
                        break;
                        default:
                            System.out.println("Opcion no valida");

            }


        }while (opcion!= 5);
        sc.close();

    }
}
*/