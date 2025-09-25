import ItemsPaquete.Item;
import PaquetePersonas.Guerrero;
import PaquetePersonas.Persona;
import PaquetePersonas.Mago;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {





        Mago mago = new Mago(200 , "Nahuel" , 40);
        Guerrero guerrero = new Guerrero(400 , "Guerrero1" , 20);

        Item baston = new Item(80 , "Baston");
        Item espada = new Item(50);

        System.out.println(baston);
        System.out.println(espada);



        boolean ganador = false;

        while (!ganador){

            int turno = (int) (Math.random()*2) +1;

            System.out.println(turno);

            if(turno == 1){
                mago.recibirAtaque(guerrero.atacar());
            }else {
                guerrero.recibirAtaque(mago.atacar());
            }

            if(mago.getVida() < 1 || guerrero.getVida() < 1){
                ganador = true;
            }
        }

        System.out.println(guerrero.toString());
        System.out.println(mago.toString());

    }
}