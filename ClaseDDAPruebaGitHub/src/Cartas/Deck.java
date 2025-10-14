package Cartas;
import java.util.ArrayList;

public class Deck {

    //lo hice yo solito
    public static ArrayList<Carta> generarMazo() {
        ArrayList<Carta> mazo = new ArrayList<>();

        for (Palo palo : Palo.values()) {
            for (int numero = 1; numero <= 12; numero++) {
                if (numero <= 7 || (numero >= 10 && numero <= 12)) {
                    mazo.add(new Carta(numero, palo));
                }
            }
        }

        return mazo;
    }

}
