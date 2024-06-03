package analizador_main;

import analizador.*;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.FileNotFoundException;

/**
 *
 * @author Mario Pineda
 */
public class Analizador_sintactico {
    public static void main(String[] args) {
        // Ruta del archivo a analizar
        String filePath = "./src/analizador_main/arch_prueba.txt";

        try {
            // Abre un flujo de entrada desde el archivo especificado
            InputStream inputStream = new FileInputStream(filePath);
            
            // Crea una instancia del analizador y le pasa el flujo de entrada
            JavaScriptParser parser = new JavaScriptParser(inputStream);

            try {
                // Intenta analizar el archivo como un programa válido
                parser.Program();
                System.out.println("La sintaxis del archivo es correcta.");
            } catch (ParseException e) {
                // Si se lanza una ParseException, la sintaxis es incorrecta
                System.out.println("Error de sintaxis en el archivo: " + e.getMessage());
            }

        } catch (FileNotFoundException e) {
            // Si el archivo no se encuentra, se maneja esta excepción
            System.out.println("El archivo no se encontró :c ");
        }
    }

}
