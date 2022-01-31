package desdeLasHorasExtras.log4Shell.ejemplo2;

import org.apache.log4j.PropertyConfigurator;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        //Creola clase encargada de las bitacoras
        Logger logger = LogManager.getLogger(Main.class);

        //Creo la clase para leer stdin
        Scanner in = new Scanner(System.in);

        //Presetacion de la aplicación
        System.out.println("Bienvenido a la aplicación, por favor indique su usuario.");
        System.out.println();

        //Solictud de usuario
        System.out.print("Usuario: ");
        String usuario = in.nextLine();

        // ....

        //Se avisa que el usuario no es correcto y se guarda un evento en la bitacora
        System.out.println("Su usuario es incorrecto.");
        logger.error("El usuario '%s' es incorrecto.".formatted(usuario));

    }
}
