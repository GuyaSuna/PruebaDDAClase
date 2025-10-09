package PaquetePersonas;
import ItemsPaquete.Espadas;
import ItemsPaquete.Item;

import java.util.ArrayList;

public class Guerrero extends Persona{

    private int dañoAtaque;

    private Espadas espada;

    private ArrayList<Item> listaItems;


    public ArrayList<Item> getListaItems() {
        return this.listaItems;
    }

    public void setListaItems(ArrayList<Item> listaItems) {
        this.listaItems = listaItems;
    }



    public int getDañoAtaque(){
        return  this.dañoAtaque;
    }
    public void setDañoAtaque(int dañoAtaque){
        this.dañoAtaque = dañoAtaque;
    }

    public Espadas getEspada() {
        return espada;
    }
    public void setEspada(Espadas espada) {
        this.espada = espada;
    }

    @Override
    public String toString() {
        return "Guerrero: " + super.toString() + ", DañoAtaque: " + this.dañoAtaque + " Lista Objetos :" + this.listaItems.toString();
    }

    public int atacar() {
        if(this.espada != null){
            return this.dañoAtaque + espada.getDaño();
        }else {
            return this.dañoAtaque;
        }
    }

    public int recibirAtaque(int daño){
        int vidaRestante = super.getVida() - daño;
        super.setVida(vidaRestante);
        return vidaRestante;
    }
    public Guerrero(int vida , String nombre, int dañoAtaque , ArrayList<Item> listaItems ){
        super(vida , nombre);
        this.dañoAtaque = dañoAtaque;
        this.espada = null;
        this.listaItems = listaItems;
    }
    public Guerrero(int vida , String nombre, int dañoAtaque, Espadas espada , ArrayList<Item> listaItem){
        super(vida , nombre);
        this.dañoAtaque = dañoAtaque;
        this.espada = espada;
        this.listaItems = listaItem;
    }


}
