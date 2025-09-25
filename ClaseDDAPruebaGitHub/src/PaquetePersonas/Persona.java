package PaquetePersonas;

public abstract class Persona {

    private static int contador = 0;
    private int id;
    private int vida;
    private String nombre;


    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getVida() {
        return vida;
    }
    public void setVida(int vida) {
        this.vida = vida;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return
                "id: " + id +
                ", vida: " + vida +
                ", nombre: " + nombre;
    }

    public abstract int atacar();

    public abstract int recibirAtaque(int daño);

    public Persona(int vida , String nombre){
        this.id = ++contador;
        this.vida = vida;
        this.nombre = nombre;
    }


}
