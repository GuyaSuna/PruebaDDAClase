package Partida;

import java.time.LocalDateTime;

public class Match {

    private LocalDateTime fechaPartida;


    public LocalDateTime getFechaPartida() {
        return fechaPartida;
    }

    public void setFechaPartida(LocalDateTime fechaPartida) {
        this.fechaPartida = fechaPartida;
    }


    public Match(LocalDateTime fechaPartida){
        this.fechaPartida = fechaPartida;
    }
}
