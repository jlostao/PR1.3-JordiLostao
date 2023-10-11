import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PR133mainTreballadors {
    public static void main(String args[]) {
        Scanner scan;
        List<String> csv = UtilsCSV.read("./PR133treballadors.csv");
        int workerId = 0;
        int valueToChange = 0;
        Boolean correctInput = false;
        String[] idArray = UtilsCSV.getColumnData(csv, "Id");
        
        while (!correctInput) {
            scan = new Scanner(System.in);
            System.out.println("\nEnter the id of the worker you want to modify: ");
            if (scan.hasNextInt()) {
                workerId = scan.nextInt();
                for (int i = 1; i < idArray.length; i++) {
                    if (workerId == Integer.parseInt(idArray[i])) {
                        correctInput = true;
                    }
                }
            } else {
                System.out.println("\nThe entered value is invalid");
            }
            if (!correctInput) {
                System.out.println("\nThe entered id does not exist");
            }
        }

        correctInput = false;

        while (!correctInput) {
            scan = new Scanner(System.in);
            System.out.println("\nEnter the number of the field you want to modify: \n1. Nom \n2. Cognom \n3. Departament \n4. Salari");
            if (scan.hasNextInt()) {
                valueToChange = scan.nextInt();
                if (valueToChange > 0 && valueToChange < 5) {
                    correctInput = true;
                } else {System.out.println("The entered selection does not exist.");}
            } else {
                System.out.println("The entered value is invalid.");
            }
        }
        
        correctInput = false;

        if (valueToChange == 1) {
            while (!correctInput) {
                scan = new Scanner(System.in);
                System.out.println("Enter the new name:");
                if (scan.hasNextLine()) {
                    String newName = scan.nextLine();
                    UtilsCSV.update(csv, UtilsCSV.getLineNumber(csv, "Id", Integer.toString(workerId)), "Nom", newName);
                    UtilsCSV.write("./PR133treballadors.csv", csv);
                    correctInput = true;
                } else {
                    System.out.println("The entered value is invalid or empty.");
                }
            } 
        } else if (valueToChange == 2) {
            while (!correctInput) {
                scan = new Scanner(System.in);
                System.out.println("Enter the new surname:");
                if (scan.hasNextLine()) {
                    String newSurname = scan.nextLine();
                    UtilsCSV.update(csv, UtilsCSV.getLineNumber(csv, "Id", Integer.toString(workerId)), "Cognom", newSurname);
                    UtilsCSV.write("./PR133treballadors.csv", csv);
                    correctInput = true;
                } else {
                    System.out.println("The entered value is invalid or empty.");
                }
            }
        } else if (valueToChange == 3) {
            while (!correctInput) {
                scan = new Scanner(System.in);
                System.out.println("Enter the new department:");
                if (scan.hasNextLine()) {
                    String newDepartment = scan.nextLine();
                    UtilsCSV.update(csv, UtilsCSV.getLineNumber(csv, "Id", Integer.toString(workerId)), "Departament", newDepartment);
                    UtilsCSV.write("./PR133treballadors.csv", csv);
                    correctInput = true;
                } else {
                    System.out.println("The entered value is invalid or empty.");
                }
            }
        } else if (valueToChange == 4) {
            while (!correctInput) {
                scan = new Scanner(System.in);
                System.out.println("Enter the new salary:");
                if (scan.hasNextLine()) {
                    String newSalari = scan.nextLine();
                    UtilsCSV.update(csv, UtilsCSV.getLineNumber(csv, "Id", Integer.toString(workerId)), "Salari", newSalari);
                    UtilsCSV.write("./PR133treballadors.csv", csv);
                    correctInput = true;
                } else {
                    System.out.println("The entered value is invalid or empty.");
                }
            }
        }
        
    }
}
