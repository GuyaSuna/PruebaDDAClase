import Personas.Persona;

import java.io.*;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {

        ArrayList<Persona> listaPersona = new ArrayList<>();

        listaPersona.add( new Persona(1,"Jorge" , 25));
        listaPersona.add( new Persona(2,"Nahuel" , 23));
        listaPersona.add( new Persona(3,"Alfonsina" , 26));

        try(FileWriter fr = new FileWriter("personas.txt")){

            PrintWriter pr = new PrintWriter(fr);

            for(Persona per : listaPersona){
                pr.println(per.getId() + " ; " + per.getNombre() + " ; " + per.getEdad());
            }

            pr.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

//        ArrayList<Persona> listaPersonas = tomarDatosPerosna();
//        System.out.println(listaPersonas);
    }

    public static ArrayList<Persona> tomarDatosPerosna(){

        try {
            ArrayList<Persona> listaPersonas = new ArrayList<>();
            String linea;
            int id;
            String nombre;
            int edad;

            BufferedReader br = new BufferedReader(new FileReader("personas.txt"));

            while( (linea = br.readLine()) != null){
                if (linea.isBlank()) continue;

                String[] partes = linea.split(";");
                if(partes.length < 3) continue;

                id = Integer.parseInt(partes[0].trim());
                nombre = partes[1].trim();
                edad = Integer.parseInt(partes[2].trim());

                listaPersonas.add(new Persona(id,nombre,edad));
            }
            br.close();
            return listaPersonas;

        }catch (FileNotFoundException e){
            System.out.println("Archivo no se encuentra :"+ e.getMessage());
            return new ArrayList<>();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}