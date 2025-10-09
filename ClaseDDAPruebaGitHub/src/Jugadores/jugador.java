package Jugadores;

public class jugador {
    private int idJugador;
    private String nombre;
    private int dorsal;

    public int getIdJugador() {
        return idJugador;
    }

    public void setIdJugador(int idJugador) {
        this.idJugador = idJugador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public jugador(int idJugador, String nombre, int dorsal) {
        this.idJugador = idJugador;
        this.nombre = nombre;
        this.dorsal = dorsal;
    }

    @Override
    public String toString() {
        return "jugador{" +
                "idJugador=" + idJugador +
                ", nombre='" + nombre + ',' +
                ", dorsal=" + dorsal +
                '}';
    }
}
