import java.util.HashMap;
import java.io.*;


public class PR130mainPersonesHashmap {
    public static void main(String args[]) {
        HashMap<String, Integer> people = new HashMap<>();
        people.put("Sara", 28);
        people.put("David", 42);
        people.put("Emilia", 35);
        people.put("Micael", 50);
        people.put("Olivia", 19);

        try {
            FileOutputStream fos = new FileOutputStream("./PR130persones.dat");
            DataOutputStream dos = new DataOutputStream(fos);

            writeSerializableObject(people, dos);

            dos.flush();
            fos.close();
            dos.close();

            FileInputStream fis = new FileInputStream("./PR130persones.dat");
            DataInputStream dis = new DataInputStream(fis);

            HashMap<String, Integer> peopleInput = (HashMap) readSerializableObject(dis);

            for (HashMap.Entry<String, Integer> entry : peopleInput.entrySet()) {
                System.out.println(entry.getKey() + " té " + entry.getValue());
            }

            fis.close();
            dis.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    static void writeSerializableObject (Object obj, DataOutputStream dos) {
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(obj);
            oos.flush();
            byte [] data = bos.toByteArray();

            dos.writeInt(data.length);
            
            dos.write(data);

        } catch (IOException e) { e.printStackTrace(); }
    }

    static Object readSerializableObject (DataInputStream dis) {
        try {
            int lgth = dis.readInt();
            byte[] data = new byte [lgth];

            dis.readFully(data, 0, lgth);

            ByteArrayInputStream in = new ByteArrayInputStream(data);
            ObjectInputStream is = new ObjectInputStream(in);
            return is.readObject();

        } catch (ClassNotFoundException e) { e.printStackTrace();
        } catch (UnsupportedEncodingException e) { e.printStackTrace();
        } catch (IOException e) { e.printStackTrace(); }
        return new java.lang.AbstractMethodError();
    }
}
