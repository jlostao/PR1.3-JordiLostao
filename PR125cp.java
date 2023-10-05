import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;


public class PR125cp {
    public static void main(String args[]) throws IOException {
        Scanner scan = new Scanner(System.in);

        System.out.println("Introdueix la ruta de l'arxiu a copiar:");
        Path origen = Paths.get(scan.nextLine());

        System.out.println("Introdueix la ruta del destí de la copia:");
        Path destination = Paths.get(scan.nextLine());

        Files.copy(origen, destination);
    }
}
