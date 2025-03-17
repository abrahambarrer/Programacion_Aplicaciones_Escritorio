package ContadorFile;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Contador {

    private int caracteres;
    private int palabras;
    private int lineas;

    public Contador()  {
        this.caracteres = 0;
        this.palabras = 0;
        this.lineas = 0;
    }


    public void contar (String nombreArchivo) {
        
        String cadena;

        try {
            FileReader lector = new FileReader(nombreArchivo);
            BufferedReader buffer = new BufferedReader(lector);

            while ((cadena = buffer.readLine()) != null) {
                contarLineas();
                contarCaracteres(cadena);
                contarPalabras(cadena);
            }
            caracteres  += lineas - 1;
            buffer.close();
        } catch (FileNotFoundException e1) {
            System.out.println("Archivo no encontrado");
        } catch (IOException e2) {
            System.out.println("Error: " + e2);
        }
        
        imprimpirConteo();
    }

    private void contarCaracteres(String cadena) {
        this.caracteres += cadena.length();
    }

    private void contarPalabras(String cadena) {
        String[] numeroPalabras = cadena.split("\\s+");
        palabras += numeroPalabras.length;
    }

    private void contarLineas() {
        lineas++;
    }

    private void imprimpirConteo(){
        System.out.println("El archivo tiene:");
        System.out.println(caracteres + " caracteres");
        System.out.println(palabras + " palabras");
        System.out.println(lineas + " lineas");
    }

}
