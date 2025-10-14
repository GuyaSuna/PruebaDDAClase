package Cartas;

public class Carta {
    private final int numero;
    private final Palo palo;
    private final int fuerza;

    public Carta(int numero, Palo palo) {
        this.numero = numero;
        this.palo = palo;
        this.fuerza = calcularFuerza();
    }

    private int calcularFuerza() {
        if (numero == 1 && palo == Palo.ESPADAS) return 14;
        if (numero == 1 && palo == Palo.BASTOS) return 13;
        if (numero == 7 && palo == Palo.ESPADAS) return 12;
        if (numero == 7 && palo == Palo.OROS) return 11;
        if (numero == 3) return 10;
        if (numero == 2) return 9;
        if (numero == 1) return 8;
        if (numero == 12) return 7;
        if (numero == 11) return 6;
        if (numero == 10) return 5;
        if (numero == 7) return 4;
        if (numero == 6) return 3;
        if (numero == 5) return 2;
        return 1;
    }

    public int getNumero() { return numero; }
    public Palo getPalo() { return palo; }
    public int getFuerza() { return fuerza; }


    @Override
    public String toString() {
        return numero + " de " + palo + " (fuerza: " + fuerza + ")";
    }




}
