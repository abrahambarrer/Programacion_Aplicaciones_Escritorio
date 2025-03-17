import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.*;

public class eliminarCadena {
    public static void main(String[] args) throws Exception {

        borrarCadena(args[0], args[1]);

    }

    public static void borrarCadena(String cadena, String nombreArchivo) throws FileNotFoundException{
        String linea;
        List<String> lineasEditadas = new ArrayList<>();

        Pattern expresion = Pattern.compile("\\b" + cadena + "\\b");
        Matcher matcher;

        try {
            FileReader lector = new FileReader(nombreArchivo);
            BufferedReader buffer = new BufferedReader(lector);

            while ((linea = buffer.readLine()) != null) {
                matcher = expresion.matcher(linea);
                lineasEditadas.add(matcher.replaceAll(""));
            }

            buffer.close();
        } catch (FileNotFoundException e1) {
            System.out.println("Archivo no encontrado");
        } catch (IOException e2) {
            System.out.println("Error de lectura: " + e2);
        }

        sobrescribir(nombreArchivo, lineasEditadas);

        System.out.println("Archivo editado correctamente");
    }

    private static void sobrescribir(String nombreArchivo, List<String> lineasEditadas){
        try {
            FileWriter editor = new FileWriter(nombreArchivo);
            BufferedWriter bufferEditor = new BufferedWriter(editor);

            int numeroLineas = lineasEditadas.size();

            for (int i = 0; i < numeroLineas; i++){
                bufferEditor.write(lineasEditadas.get(i));
                if (i < numeroLineas - 1)
                    bufferEditor.newLine();
            }
            bufferEditor.close();
        } catch (IOException e) {
            System.out.println("Error de lectura: " + e);
        }
        
    }
}
