import java.io.Serializable;

public class PR132persona implements Serializable{
    
    private String nom;
    private String cognom;
    private int edat;

    public void setNom(String n) {this.nom = n;}
    public String getNom() {return nom;}
    public void setCognom(String n) {this.cognom = n;}
    public String getCognom() {return cognom;}
    public void setEdat(int n) {this.edat = n;}
    public int getEdat() {return edat;}

    @Override
    public String toString() {
        return "Nom = " + this.nom + " | Cognom = " + this.cognom + " | Edat = " + this.edat;
    }
 
}
