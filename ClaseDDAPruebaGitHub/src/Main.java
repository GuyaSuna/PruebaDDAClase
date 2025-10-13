import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     int opcion = 0;

        System.out.println("Menu de opciones");

        while (opcion != -1){

            System.out.println("Opcion 1: Prueba de Natacion");
            System.out.println("Opcion 2: Preuba de Auto");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion){
                case 1:

                    System.out.println("Paola ");
                    break;
                case 2:


                    System.out.println("Sophie ");
                    break;
                case -1:
                    System.out.println("Saliendo");
                    break;
                default:
                    System.out.println("Mal ahi che");
                    break;
            }

        }

    }
}
