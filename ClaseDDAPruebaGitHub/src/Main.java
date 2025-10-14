import java.time.format.DateTimeParseException;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

     int opcion = 0;

        System.out.println("Menu de opciones");

        while (opcion != -1){

            System.out.println("Opcion 1: Jugar Partida");
            System.out.println("Opcion 2: Agenda una partida");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion){
                case 1:
                    System.out.println("Juego de truco ");

                    break;
                case 2:
                    System.out.println("Agenda una partida");
                    System.out.println("Ingresa una fecha dd/mm/yyyy hh/mm");

                    String fechaString = sc.nextLine();
                    try {
                        LocalDateTime fecha = LocalDateTime.parse(fechaString, formato);

                        if(fecha.isBefore(LocalDateTime.now())) {
                            System.out.println("Error: la fecha no puede no ser hoy");
                        } else {
                            System.out.println("Partida agendada correctamente para: " + fecha.format(formato));
                        }

                    } catch (DateTimeParseException e) {
                        System.out.println("Error: formato de fecha inváñido. Usa dd/mm/yyyy hh:mm");
                    }

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
