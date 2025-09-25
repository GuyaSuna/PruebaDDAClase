package ItemsPaquete;

public class Bastones extends Item {

     private int poderMagico;


    public int getPoderMagico() {
        return poderMagico;
    }

    public void setPoderMagico(int poderMagico) {
        this.poderMagico = poderMagico;
    }

    @Override
    public String toString() {
        return super.toString() + " Poder Magico: " + this.poderMagico;
    }

    public Bastones(int daño , String nombre , int poderMagico){
        super(daño,nombre);
        this.poderMagico = poderMagico;
    }


}
