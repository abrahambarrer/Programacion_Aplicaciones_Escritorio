// Ingresar texto por consola y almacene en un .txt

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class EscribirEnArchivo {
    final private Scanner consola = new Scanner(System.in); 

    public static void main(String[] args) throws Exception {
        EscribirEnArchivo escritor = new EscribirEnArchivo();
        
        escritor.escribirArchivo();
        escritor.cerrarConsola();
    }

    public String leerCadena() {
        System.out.print("Ingresa cadena: ");
        return consola.nextLine();
    }

    public void cerrarConsola() {
        consola.close();
    }

    public void escribirArchivo() {
        String cadena = leerCadena();
        try {
            FileWriter escritor = new FileWriter("archivo.txt", true);
            BufferedWriter bufferEscritor = new BufferedWriter(escritor);

            bufferEscritor.write(cadena);
            bufferEscritor.newLine();

            bufferEscritor.close();
            System.out.println("Archivo editado correctamente...");
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
