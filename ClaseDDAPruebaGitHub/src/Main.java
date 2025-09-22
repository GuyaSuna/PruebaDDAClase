import PaquetePersonas.Persona;

public class Main {
    public static void main(String[] args) {

        Persona persona  = new Persona(100, "Nahuel");
        Persona persona2  = new Persona(100, "Paola");
        Persona persona3  = new Persona(100, "Alejo");

        System.out.println(persona.toString());
        System.out.println(persona2.toString());
        System.out.println(persona3.toString());


    }
}