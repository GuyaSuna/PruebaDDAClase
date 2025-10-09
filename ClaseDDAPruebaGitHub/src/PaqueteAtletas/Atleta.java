package PaqueteAtletas;

public class Atleta implements InterfazAtleta{
    static int contador = 1;
    private int id = 0;
    private String nombre;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void correr(){
        System.out.println("Corriendo la maratón");
    }

    @Override
    public String toString(){
        return "Atleta: " + this.nombre;
    }
    public Atleta(String nombre){
        this.id = contador++;
        this.nombre = nombre;
    }

}
