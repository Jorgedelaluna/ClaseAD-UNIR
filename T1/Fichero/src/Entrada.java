import java.io.File;

public class Entrada {

    public static void main(String[] args) {
        //FILE -> fichero logico -> fisico
        // fichero logico
        // File ficheroSinPuntero = new File( pathname:"C:\\Users\\jdela\\GitHub\\ClaseAD-UNIR\\T1\\Fichero\\src\\resources\\directorio\\ejemplo_fichero.txt");
        File ficheroSinPuntero = new File( pathname:"src/resources/directorio/ejemplo_fichero.txt");
        System.out.println(ficheroSinPuntero.getName());
        System.out.println(ficheroSinPuntero.getParent());
        System.out.println(ficheroSinPuntero.length());
        System.out.println(ficheroSinPuntero.isDirectory());
        // File [] -> todos los FICHEROS que estan dentro del directorio
        ficheroSinPuntero.listFiles();
        // String[] -> todos las rutas de los FICHEROS que estan dentro del directorio
        ficheroSinPuntero.list();

    }
}
