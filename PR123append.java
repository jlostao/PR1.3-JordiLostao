import java.io.*;

public class PR123append {
    public static void main(String args[]) {
        try {
            FileWriter fw = new FileWriter("./frasesMatrix.txt", true);
            fw.write("\nYo solo puedo mostrarte la puerta" +  "\nTu eres quien la tiene que atravesar");
            fw.close();
            System.out.println("Text has been appended to frasesMatrix.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
