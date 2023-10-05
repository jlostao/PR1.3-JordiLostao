import java.io.*;
import java.util.Scanner;


public class PR120ReadFile {
   public static void main(String args[]) {
       int lineNum = 1;
       File text = new File("./PR120ReadFile.java");
       Scanner scan;
       try {
           scan = new Scanner(text);
           while(scan.hasNextLine()){
               String line = scan.nextLine();
               System.out.println("Line " + lineNum + " :" + line);
               lineNum++;
           }
       } catch (FileNotFoundException e) {
           e.printStackTrace();
       }
   }
}
