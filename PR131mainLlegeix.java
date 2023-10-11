import java.io.*;

public class PR131mainLlegeix {
    public static void main(String args[]) {
        try {
            FileInputStream fis = new FileInputStream("./PR131HashMapData.ser");
		    ObjectInputStream ois = new ObjectInputStream(fis);

            PR131hashmap hashMap = (PR131hashmap) ois.readObject();
            System.out.println(hashMap);
            
        } catch (IOException e) { e.printStackTrace(); 
        } catch (ClassNotFoundException e) { e.printStackTrace(); }
    }
    
}
