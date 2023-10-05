import java.io.*;


public class PR121Files {
    public static void main(String args[]) throws IOException {
        File folder = new File("./myFiles");
        if (folder.mkdir()) {
            System.out.println("The folder has been created succesfully.");
        } else {
            System.out.println("The folder has not been created.");
        }

        File file1 = new File("./myFiles/file1.txt");
        File file2 = new File("./myFiles/file2.txt");
        if (file1.createNewFile() && file2.createNewFile()) {
            System.out.println("Files have been created.");
        } else {
            System.out.println("Files cannot be created.");
        }

        File rename = new File("./myFiles/renamedFile.java");
        boolean renamed = file2.renameTo(rename);
        if (renamed) {
            System.out.println("File2 has been renamed.");
        } else {
            System.out.println("File2 could not be renamed.");
        }

        String content[] = folder.list();
        System.out.println("\nFiles in the myFiles folder:");
        for (int i = 0; i < content.length; i++) {
            System.out.println("- " + content[i]);
        }

        if (file1.delete()) {
            System.out.println("\nFile1 has been deleted.");
        } else {
            System.out.println("\nFile1 has not been deleted.");
        }

        content = folder.list();
        System.out.println("\nEls arxius de la carpeta son:");
        for (int i = 0; i < content.length; i++) {
            System.out.println("- " + content[i]);
        }
    }
}
