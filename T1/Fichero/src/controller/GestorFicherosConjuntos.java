package controller;

import java.io.*;
import java.util.Scanner;

public class GestorFicherosConjuntos {

    public void lecturaEscritura(String path){
        Scanner scanner = new Scanner(System.in);
        File file = new File(path);
        FileWriter fileWriter = null;

        System.out.println("Por favor, introduce el mensaje que quieres guarda");
        String mensaje = scanner.nextLine();
        // este es el contenido del exmane

        try {
            fileWriter = new FileWriter(file, false);
            for (int i = 0; i < mensaje.length(); i++) {
                char letra = mensaje.charAt(i);
                // fileWriter.write(letra+"\n");
                int codigo = (int) letra;
                // System.out.println("codigo = " codigo);
                // fileWriter.write("123");
                fileWriter.write(String.valueOf(codigo * 5) + "\n");
            }
        } catch (IOException e) {
            System.out.println("Error en los permisos");
        } finally {
            try {
                fileWriter.close();
            } catch (IOException | NullPointerException e) {
                System.out.println("Fallo en el cerrado");
            }
        }
    }
    public void cifrado(String path){
        Scanner scanner = new Scanner(System.in);
        File file = new File(path);
        FileWriter fileWriter = null;

        System.out.println("Por favor, introduce el mensaje que quieres guarda");
        String mensaje = scanner.nextLine();
        // este es el contenido del exmane

        try {
            fileWriter = new FileWriter(file, false);
            for (int i = 0; i < mensaje.length(); i++) {
                char letra = mensaje.charAt(i);
                // fileWriter.write(letra+"\n");
                int codigo = (int) letra;
                // System.out.println("codigo = " codigo);
                // fileWriter.write("123");
                fileWriter.write(String.valueOf(codigo * 5) + "\n");
            }
        } catch (IOException e) {
            System.out.println("Error en los permisos");
        } finally {
            try {
                fileWriter.close();
            } catch (IOException | NullPointerException e) {
                System.out.println("Fallo en el cerrado");
            }
        }
    }

    public void descifrado(String path){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor indica la fase descifrado");
        int fase = scanner.nextInt();

        File file = new File(path);
        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader(file));
            String lectura = null;
            while ((lectura= br.readLine())!=null)
                // lectura
                System.out.println(lectura);
            }
        } catch (IOException e) {
            System.out.println("Error en los permisos");
        } finally {
            try {
                fileWriter.close();
            } catch (IOException | NullPointerException e) {
                System.out.println("Fallo en el cerrado");
            }
        }
    }
}
