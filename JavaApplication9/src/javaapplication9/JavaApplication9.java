
package javaapplication9;

abstract class Personne{
    private String numero,nom,prenom;
    abstract public void faireUneTache();
       public String getNumero(){
        return this.numero;
    }
     public String getNom(){
        return this.nom;
    }
      public void setNumero(String s){
        this.numero = s;
    }
      public void setNom(String s){
        this.nom = s;
    }
      public String getPrenom(String s){
        return this.prenom;
    }
      public void setPrenom(String s){
         this.prenom = s;
    }
}
class Etudiant extends Personne{
    String niveau;
  public String getNiveau(String s){
        return this.niveau;
    }
      public void setPrenom(String s){
         this.niveau = s;
    }

    @Override
    public void faireUneTache() {
        System.out.println("J'etude l'analyse");
    }
}
class Prof extends Personne{
   
    @Override
    public void faireUneTache() {
        System.out.println("J'ensiene une model");
    }
}
public class JavaApplication9 {
     public static String lire(){
        int c;
        String st="";
        try{
        while((c=System.in.read())!='\n')
            st=st+(char)c;
        }catch(java.io.IOException ex){
            ex.toString();
        }
        return st;
    }
    static  Personne creePersonne(){
        System.out.println("Entre un nombre :");
        int nbr = Integer.parseInt(lire());
        return (nbr % 2 == 0 ? new Prof() : new Etudiant());
    }
    
    public static void main(String[] args) {
        creePersonne().faireUneTache();
    }
    
}
