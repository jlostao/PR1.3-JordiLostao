import java.io.*;


public class PR132main {
    public static void main(String args[]) {
        PR132persona maria = new PR132persona();
        maria.setNom("Maria");
        maria.setCognom("López");
        maria.setEdat(36);

        PR132persona gustavo = new PR132persona();
        gustavo.setNom("Gustavo");
        gustavo.setCognom("Ponts");
        gustavo.setEdat(63);

        PR132persona irene = new PR132persona();
        irene.setNom("Irene");
        irene.setCognom("Sales");
        irene.setEdat(54);

        try {
            FileOutputStream fos = new FileOutputStream("./PR132people.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(maria);
            oos.writeObject(gustavo);
            oos.writeObject(irene);
            oos.close();
            fos.close();

            FileInputStream fis = new FileInputStream("./PR132people.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);
            PR132persona persona1 = (PR132persona) ois.readObject();
            PR132persona persona2 = (PR132persona) ois.readObject();
            PR132persona persona3 = (PR132persona) ois.readObject();

            System.out.println(persona1.toString());
            System.out.println(persona2.toString());
            System.out.println(persona3.toString());


        } catch (IOException e) { e.printStackTrace(); 
        } catch (ClassNotFoundException e) { e.printStackTrace(); }
    }
}
