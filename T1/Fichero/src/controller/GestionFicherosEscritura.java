package controller;

import java.io.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class GestionFicherosEscritura {

    public void escribirFichero(String path) {
        //FILE -> FILEWRITER -> BUFFERWRITER -> PRINTWRITER -> CERRAR
        File file = new File(path);
        FileWriter fileWriter = null;

        try {
            fileWriter = new FileWriter(file, false); // append -> anexar o no la escritura
            //fileWriter.write("\nEsta es la tercera linea de la escritura");

        } catch (IOException e) {
            System.out.println("Error en la escritura del fichero, por permisos");

        } finally {
            try {
                fileWriter.close();
            } catch (IOException | NullPointerException e) {
                System.out.println("Error en el cierre del flujo");
            }
        }
    }
}
