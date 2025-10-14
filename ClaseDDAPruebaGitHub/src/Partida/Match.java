package Partida;

import Players.Player;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Match {

    private LocalDateTime fechaPartida;
    private ArrayList<Player> players;


    public LocalDateTime getFechaPartida() {
        return fechaPartida;
    }

    public void setFechaPartida(LocalDateTime fechaPartida) {
        this.fechaPartida = fechaPartida;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }

    public Match(LocalDateTime fechaPartida , ArrayList<Player> listaJugadores){
        this.fechaPartida = fechaPartida;
        this.players = listaJugadores;
    }

    public Match(LocalDateTime fechaPartida){
        this.fechaPartida = fechaPartida;
    }


    @Override
    public String toString() {
        return "Match{" +
                "fechaPartida=" + fechaPartida +
                ", players=" + players +
                '}';
    }






}
