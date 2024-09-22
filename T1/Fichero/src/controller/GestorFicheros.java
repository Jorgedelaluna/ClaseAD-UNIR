package controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class GestorFicheros {

    // src/resources/directorio
    public void lecturaDirectorios(String path) {}

    public void lecturaRecursiva(String path) {}

    // RECURSIVIDAD -> EJECUCION QUE SE LLAMA A ELLA MISMA, CON CUIDADO TENGA UNA SALIDA
    private void lecturaSubdirectorios(File fichero) {}

    public void lecturaTextoPlano(String path) {
        // FILE -> FILEREADER -> Cuando se terminan SE CIERRAN
        File file = new File(path);
        FileReader fileReader = null;

        if (file.exists() && file.isFile()) {
            // existe y ademas es un fichero
            // trata la excepcion aqui
            try {
                fileReader = new FileReader(file);
                int lectura = fileReader.read(); // int -> UNICODE ASCI
                System.out.println(lectura);

            } catch (FileNotFoundException e){
                System.out.println("Fallo en la lectura del fichero");
                System.out.println(e.getMessage());
            } catch (IOException e){
                System.out.println("Error en la escritura, fallo de permisos");
            } finally {
                // se ejecuta SI o SI
                try {
                    fileReader.close(); // NULLPOINTEXCEPTION
                } catch (IOException e) {
                    System.out.println("Error en el cerrado del flujo");
                    System.out.println(e.getMessage());
                    // por favor introduce una ruta valida
                } catch (Exception e){
                    System.out.println("Error en el cerrado por ser nulo");
                }
            }
        }
    }
}
