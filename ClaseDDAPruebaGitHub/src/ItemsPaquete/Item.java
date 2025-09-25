package ItemsPaquete;

public class Item {

    static int contador = 0;
    private int id;

    private String nombre;
    private int daño;

    public int getId(){
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDaño(){
        return this.daño;
    }
    public void setDaño(int daño){
        this.daño = daño;
    }

    @Override
    public String toString(){
        return "Id: " + this.id + " Nombre: "+ this.nombre + " Daño: " + this.daño;
    }

    public Item(int daño){
        this.id = ++contador;
        this.daño = daño;
        this.nombre = "Sin nombre";
    }

    public Item(int daño , String nombre){
        this.id = ++contador;
        this.daño = daño;
        this.nombre = nombre;
    }



}
