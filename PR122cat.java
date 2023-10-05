import java.io.*;
import java.util.Scanner;

public class PR122cat {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the file path to read: ");
        String path = scan.nextLine();
        File folderfile = new File(path);
        int lineNum = 1;
        
        if (folderfile.isDirectory()) {
            System.out.println("El path no correspon a un arxiu, sinó a una carpeta");
        } else {
            try {
                scan = new Scanner(folderfile);
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
}
