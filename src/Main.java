import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
        public static void main(String[] args){
        /*Example*/

                List<Persona> ListaPersonas;

                ListaPersonas = Arrays.asList(
                        new Persona ("martin",11000000,11),
                        new Persona("jorge",21000000, 21),
                        new Persona( "pablo",  31000000,  31),
                        new Persona( "rogelio",  41000000,  41),
                        new Persona( "guillermo",  51000000,  51));

                System.out.println(String.format("Personas: %s",ListaPersonas));

                System.out.println(String.format("Mayores a 21: %s",ListaPersonas.stream()
                .filter(Persona->Persona.getEdad()>21)
                .collect(Collectors.toList())));

                System.out.println(String.format("Menores a 18: %s",ListaPersonas.stream()
                        .filter(Persona->Persona.getEdad()<18)
                        .collect(Collectors.toList())));

                System.out.println(String.format("Mayores a 21 y DNI mayor a 20.000.0000: %s",ListaPersonas.stream()
                        .filter(Persona->Persona.getEdad()>21)
                        .filter(Persona->Persona.getDni()>20000000)
                        .collect(Collectors.toList())));

        }

}
