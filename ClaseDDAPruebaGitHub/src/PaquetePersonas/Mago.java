package PaquetePersonas;

public class Mago extends Persona {

    private int ap;
    public int getAp() {
        return ap;
    }
    public void setAp(int ap) {
        this.ap = ap;
    }
    public int sumar(int a , int b){
        return a + b;
    }
    public int sumar(int a , int b, int c){
        return a + b +c;
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


    public Mago(int vida, String nombre , int ap) {
        super(vida, nombre);
        this.ap = ap;
    }
    public Mago(int vida, String nombre) {
        super(vida, nombre);
        this.ap = 100;
    }


}
