package PaquetePersonas;

public class Guerrero extends Persona{

    private int dañoAtaque;
    public int getDañoAtaque(){
        return  this.dañoAtaque;
    }
    public void setDañoAtaque(int dañoAtaque){
        this.dañoAtaque = dañoAtaque;
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
    }



}
