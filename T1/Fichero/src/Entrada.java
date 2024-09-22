import java.io.File;
import java.net.URI;

public class Entrada {

    public static void main(String[] args) {
        //FILE -> fichero logico -> fisico
        // fichero logico
        // File ficheroSinPuntero = new File( pathname:"C:\Users\jdela\GitHub\ClaseAD-UNIR\T1\Fichero");
        File ficheroSinPuntero = new File( pathname:"src/resources/directorio/ejemplo_fichero.md");
        System.out.println(ficheroSinPuntero.getName());
        System.out.println(ficheroSinPuntero.getParent());
        System.out.println(ficheroSinPuntero.length());
        //System.out.println(ficheroSinPuntero.isDirectory());
    }
}
