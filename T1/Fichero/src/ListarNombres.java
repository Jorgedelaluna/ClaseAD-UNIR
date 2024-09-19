public class ListarNombres {
    private static void ListarNombres(File directorio) {
        File[] ficheros = directorio.listFiles();
        if (ficheros != null) { //caso base
            for (File fichero : ficheros) {
                System.out.println(fichero.getAbsolutePath());
                if(fichero.isDirectory()) {
                    ListarNombres(fichero);
                }
            }
    }
}
