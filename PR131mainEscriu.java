import java.io.*;

public class PR131mainEscriu {
    public static void main(String args[]) {
        PR131hashmap hashMap = new PR131hashmap();

        try {
            FileOutputStream fos = new FileOutputStream("./PR131HashMapData.ser");
		    ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(hashMap);

            oos.close();
            fos.close();

        } catch (IOException e) { e.printStackTrace(); }
    }
}
