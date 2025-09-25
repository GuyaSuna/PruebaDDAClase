package PaquetePersonas;
import ItemsPaquete.Espadas;

public class Guerrero extends Persona{

    private int dañoAtaque;

    private Espadas espada;
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
        return "Guerrero: " + super.toString() + ", DañoAtaque: " + this.dañoAtaque;
    }

    public int atacar() {
        return this.dañoAtaque;
    }

    public int recibirAtaque(int daño){
        int vidaRestante = super.getVida() - daño;
        super.setVida(vidaRestante);
        return vidaRestante;
    }
    public Guerrero(int vida , String nombre, int dañoAtaque){
        super(vida , nombre);
        this.dañoAtaque = dañoAtaque;
        this.espada = null;
    }
    public Guerrero(int vida , String nombre, int dañoAtaque, Espadas espada){
        super(vida , nombre);
        this.dañoAtaque = dañoAtaque;
        this.espada = espada;
    }


}
