package Players;

public class Player {
    String nombre;
    int victoriasManos;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVictoriasManos() {
        return victoriasManos;
    }

    public void setVictoriasManos(int victoriasManos) {
        this.victoriasManos = victoriasManos;
    }

    @Override
    public String toString() {
        return "Player{" +
                "nombre='" + nombre + '\'' +
                ", victoriasManos=" + victoriasManos +
                '}';
    }

    public Player(String nombre, int victoriasManos){
        this.nombre = nombre;
        this.victoriasManos = victoriasManos;
    }
}
