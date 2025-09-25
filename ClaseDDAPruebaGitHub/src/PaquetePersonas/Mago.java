package PaquetePersonas;

import ItemsPaquete.Bastones;

public class Mago extends Persona {

    private int ap;

    private Bastones baston;

    public int getAp() {
        return ap;
    }
    public void setAp(int ap) {
        this.ap = ap;
    }

    public Bastones getBaston() {
        return baston;
    }
    public void setBaston(Bastones baston) {
        this.baston = baston;
    }

    @Override
    public String toString() {
        return "Mago: " + super.toString() + ", Ap: " + this.ap;
    }

    public int atacar() {
        return this.ap;
    }

    public int recibirAtaque(int daño){
        int vidaRestante = super.getVida() - daño;
        super.setVida(vidaRestante);
        return vidaRestante;
    }


    public Mago(int vida ,String nombre , int ap , Bastones baston ){
        super(vida,nombre);
        this.ap = ap;
        this.baston = baston;
    }

    public Mago(int vida, String nombre , int ap) {
        super(vida, nombre);
        this.ap = ap;
        this.baston = null;
    }
    public Mago(int vida, String nombre) {
        super(vida, nombre);
        this.ap = 100;
        this.baston = null;
    }


}
