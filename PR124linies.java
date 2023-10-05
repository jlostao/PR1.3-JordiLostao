import java.io.*;
import java.util.Random;

public class PR124linies {
    public static void main(String args[]) throws IOException {
        File numFile = new File("./numeros.txt");
        if (numFile.createNewFile()) {
            PrintWriter writer = new PrintWriter("./numeros.txt");
            int random_num;
            Random rand = new Random();

            for (int i = 0; i < 10; i++) {
                random_num = rand.nextInt(99) + 1;
                writer.write(random_num + "\n");
            }
            writer.close(); 
        } else {
            System.out.println("numeros.txt could not be created");
        }
    }
}
