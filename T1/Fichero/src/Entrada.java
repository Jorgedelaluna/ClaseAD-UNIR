import org.w3c.dom.xpath.XPathNamespace;

import java.io.File;
import java.io.IOException;

public class Entrada {

    public static void main(String[] args) {
        //FILE -> fichero logico -> fisico
        // fichero logico
        // File ficheroSinPuntero = new File( pathname:"C:\Users\jdela\GitHub\ClaseAD-UNIR\T1\Fichero");
        File ficheroSinPuntero = new File( "src/resources/directorio/ejemplo_fichero.md");
        //System.out.println(ficheroSinPuntero.getName());
        //System.out.println(ficheroSinPuntero.getParent());
        //System.out.println(ficheroSinPuntero.length());

        // 1. Obtener todos los nombres de los ficheros del directorio llamado directorio
        File directorio = new File("src/resources/directorio");
        System.out.println("Nombre de todos los ficheros del directorio:");
        listarFicheros(directorio);

        // 2. Crear una subcarpeta en el directorio llamado directorio y crear en ella un fichero
        File subDirectorio = new File(directorio, "directorio");
        if (!subDirectorio.exists()) {
            subDirectorio.mkdir();  // Crear subcarpeta
            System.out.println("Subcarpeta creada: " + subDirectorio.getName());
        }

        File nuevoFichero = new File(subDirectorio, "nuevofichero.txt");
        try {
            if (nuevoFichero.createNewFile()) {
                System.out.println("Fichero creado en subdcarpeta: " + nuevoFichero.getName());
            } else {
                System.out.println("El fichero ya existe.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 3. Obtener todos los nombres de los ficheros del directorio llamado directorio y el subdirectorio creado
        System.out.println("Ficheros en el directorio y subdirectorio:");
        listarFicherosRecursivo(directorio);
    }
        // Método para listar ficheros en un directorio (sin subdirectorios)
        private static void listarFicheros(File directorio) {
            File[] ficheros = directorio.listFiles();
                if (ficheros != null) {
                    for (File fichero : ficheros) {
                    if (fichero.isFile()) {
                        System.out.println(fichero.getName());
                    }
                }
            }
        }

        // Método para listar ficheros en un directorio y sus subdirectorios (recursivamente)
        private static void listarFicherosRecursivo(File directorio) {
            File[] ficheros = directorio.listFiles();
                if (ficheros != null) {
                    for (File fichero : ficheros) {
                        if (fichero.isFile()) {
                            System.out.println(fichero.getAbsolutePath());
                        } else if (fichero.isDirectory()) {
                            listarFicherosRecursivo(fichero);  // Llamada recursiva para subdirectorios
                        }
                    }
                }
            }
        }
