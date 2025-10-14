package Players;

import Cartas.Carta;

import javax.smartcardio.Card;
import java.util.ArrayList;

public class Player {
    String nombre;
    ArrayList<Carta> mano;
    int victoriasManos;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Carta> getMano() {
        return mano;
    }

    public void setMano(ArrayList<Carta> mano) {
        this.mano = mano;
    }

    public int getVictoriasManos() {
        return victoriasManos;
    }

    public void setVictoriasManos(int victoriasManos) {
        this.victoriasManos = victoriasManos;
    }

    @Override
    public String toString() {
        return "Player{" +
                "nombre='" + nombre + '\'' +
                ", mano=" + mano +
                ", victoriasManos=" + victoriasManos +
                '}';
    }

    public Player(String nombre, ArrayList<Carta> mano, int victoriasManos){
        this.nombre = nombre;
        this.mano = mano;
        this.victoriasManos = victoriasManos;
    }
}
