import ItemsPaquete.Bastones;
import ItemsPaquete.Espadas;
import ItemsPaquete.Item;
import PaquetePersonas.Guerrero;
import PaquetePersonas.Persona;
import PaquetePersonas.Mago;
import vehiculos.Auto;

import java.util.ArrayList;
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
                    System.out.println("Paola");
                    break;
                case 2:
                    Auto auto = new Auto("Fiat" , "1" ,2003, 50.00,"Azul");

                    System.out.println("Sophie " + auto);
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

//
//        ArrayList<Item> listaItem = new ArrayList<>();
//        Item piedra = new Item(1 , "Piedra");
//        Bastones baston = new Bastones(80 , "Baston loco" , 150);
//        Espadas espada = new Espadas("Matadora B)" ,50 , 100,7 );
//
//        listaItem.add(piedra);
//        listaItem.add(baston);
//        listaItem.add(espada);
//
//        Mago mago = new Mago(200 , "Nahuel" , 40);
//        Guerrero guerrero = new Guerrero(400 , "Guerrero1" , 20 , listaItem);
//        System.out.println(guerrero);
//
//
//        System.out.println(baston);
//        System.out.println(espada);
//
//        guerrero.setEspada(espada);
//        mago.setBaston(baston);
//
//        boolean ganador = false;
//        int dañoAtaque;
//        while (!ganador){
//
//            int turno = (int) (Math.random()*2) +1;
//
//            if(turno == 1){
//                dañoAtaque = guerrero.atacar();
//                mago.recibirAtaque(dañoAtaque);
//                System.out.println("El guerrero pego: " + dañoAtaque);
//            }else {
//                dañoAtaque = mago.atacar();
//                guerrero.recibirAtaque(dañoAtaque);
//                System.out.println("El mago pego: " + dañoAtaque);
//            }
//
//            System.out.println("Vida restante de mago: " + mago.getVida());
//            System.out.println("Vida restante de guerrero: " + guerrero.getVida());
//
//            if(mago.getVida() < 1 || guerrero.getVida() < 1){
//                ganador = true;
//            }
//        }
//
