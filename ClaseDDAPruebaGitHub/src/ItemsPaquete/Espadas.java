package ItemsPaquete;

public class Espadas extends Item{
    private int largo;
    private int peso;
    public int getLargo() {
        return largo;
    }
    public void setLargo(int largo) {
        this.largo = largo;
    }
    public void setPeso(int peso) {
        this.peso = peso;
    }
    public int getPeso(){
        return this.peso;
    }

    @Override
    public String toString(){
        return super.toString() + " Largo: " + this.largo + " Peso: " + this.peso;
    }

    public Espadas(String nombre , int daño, int largo , int peso){
        super(daño,nombre);
        this.largo = largo;
        this.peso = peso;
    }


}
