import java.io.IOException;
import java.util.*;


public class Main {
  static Scanner in = new Scanner(System.in); // System.in és global


  // Main
  public static void main(String[] args) throws InterruptedException, IOException {
    boolean running = true;
    while (running) {
      String menu = "Escull una opció:";
      menu = menu + "\n 0) PR120ReadFile";
      menu = menu + "\n 1) PR121Files";
      menu = menu + "\n 2) PR122cat";
      menu = menu + "\n 3) PR123append";
      menu = menu + "\n 4) PR123sobreescriu";
      menu = menu + "\n 5) PR124linies";
      menu = menu + "\n 6) PR125cp";
      menu = menu + "\n 7) PR130mainPersonesHashmap";
      menu = menu + "\n 8) PR131mainEscriu";
      menu = menu + "\n 9) PR131mainLlegeix";
      menu = menu + "\n 10) PR132main";
      menu = menu + "\n 11) PR133mainTreballadors";
      menu = menu + "\n 12) PR134estudiants";
      menu = menu + "\n 100) Sortir";
      System.out.println(menu);


      int opcio = Integer.valueOf(llegirLinia("Opció: "));
      try {
        switch (opcio) {
          case 0: PR120ReadFile.main(args); break;
          case 1: PR121Files.main(args); break;
          case 2: PR122cat.main(args); break;
          case 3: PR123append.main(args); break;
          case 4: PR123sobreescriu.main(args); break;
          case 5: PR124linies.main(args); break;
          case 6: PR125cp.main(args); break;
          case 7: PR130mainPersonesHashmap.main(args); break;
          case 8: PR131mainEscriu.main(args); break;
          case 9: PR131mainLlegeix.main(args); break;
          case 10: PR132main.main(args); break;
          case 11: PR133mainTreballadors.main(args); break;
          case 12: PR134estudiants.main(args); break;
          case 100: running = false; break;
          default: break;
        }
      } catch (Exception e) {
          System.out.println(e);
      }
    }
    in.close();
  }


  static public String llegirLinia (String text) {
    System.out.print(text);
    return in.nextLine();
  }
}

