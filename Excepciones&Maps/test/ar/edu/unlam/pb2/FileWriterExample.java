package ar.edu.unlam.pb2;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args) {
        // Ruta del archivo donde se escribirá
        String archivo = "C://tmp//PruebaMiercolesNoche.jpg";

        try {
            // Crear una instancia de FileWriter
            FileWriter escritor = new FileWriter(archivo);

            // Escribir en el archivo
            escritor.write("Hola, este es un ejemplo de FileWriter en Java.\n");
            escritor.write("Puedes escribir múltiples líneas de texto.");

            // Cerrar el FileWriter
            escritor.close();

            System.out.println("Se ha escrito en el archivo exitosamente.");
        } catch (IOException e) {
            System.err.println("Ocurrió un error al escribir en el archivo: " + e.getMessage());
        }
    }
}