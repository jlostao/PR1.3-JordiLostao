import java.io.*;

public class PR123sobreescriu {
    public static void main(String args[]) { 
        try {
            PrintWriter writer = new PrintWriter("./frasesMatrix.txt");
            writer.close();
            System.out.println("frasesMatrix.txt content has been deleted.");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
