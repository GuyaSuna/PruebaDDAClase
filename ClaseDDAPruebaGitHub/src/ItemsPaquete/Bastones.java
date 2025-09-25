package ItemsPaquete;

public class Bastones extends Item {

     private int largo;



    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    @Override
    public String toString() {
        return super.toString() + " Poder Magico: " + this.largo;
    }

    public Bastones(int daño , String nombre , int largo){
        super(daño,nombre);
        this.largo = largo;
    }


}
