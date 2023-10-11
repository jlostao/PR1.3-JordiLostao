import java.io.RandomAccessFile;


public class PR134estudiants {
    private static final int ID_SIZE = 4; 
    private static final int CHAR_SIZE = 2; 
    private static final int NAME_SIZE = 50;


    public static void main(String[] args) {
        try (RandomAccessFile raf = new RandomAccessFile("estudiants.dat", "rw")) {
            afegirEstudiant(raf, 1, "Fernando", 86);
            afegirEstudiant(raf, 2, "Laia", 73);


            mostrarestudiant(raf, 1, "Original");
            mostrarestudiant(raf, 2, "Original");


            actualitzarNotaEstudiant(raf, 1, 54);
            actualitzarNotaEstudiant(raf, 2, 98);


            mostrarestudiant(raf, 1, "Actualitzat");
            mostrarestudiant(raf, 2, "Actualitzat");


            actualitzarNotaEstudiant(raf, 1, 35);
            mostrarestudiant(raf, 1, "Re-actualitzat");


        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void afegirEstudiant(RandomAccessFile raf, int id, String nom, float nota) throws Exception {
        raf.seek(raf.length());
        raf.writeInt(id);
        raf.writeChars(getPaddedName(nom));
        raf.writeFloat(nota);
    }


    public static String consultarEstudiant(RandomAccessFile raf, int id) throws Exception {
        raf.seek(getSeekPosition(id));
        raf.readInt();
        char[] chars = new char[NAME_SIZE];
        for (int i = 0; i < NAME_SIZE; i++) {
            chars[i] = raf.readChar();
        }
        return new String(chars).trim();
    }


    public static void actualitzarNotaEstudiant(RandomAccessFile raf, int id, float novanota) throws Exception {
        raf.seek(getSeekPosition(id) + ID_SIZE);
        raf.writeFloat(novanota);;
    }


    public static void mostrarestudiant(RandomAccessFile raf, int id, String msg) throws Exception {
        System.out.println(msg + " " + id + ": " + consultarEstudiant(raf, id));
    }


    private static long getSeekPosition(int id) {
        return (id - 1) * (ID_SIZE + NAME_SIZE * CHAR_SIZE);
    }

    private static String getPaddedName(String name) {
        if (name.length() > NAME_SIZE) {
            return name.substring(0, NAME_SIZE);
        }
        return String.format("%1$-" + NAME_SIZE + "s", name);
    }
}

