
package paekpolymorphisme;
abstract class Personne{
    private String cin,nom,prn;
    abstract void faireUneTache();
    public void setCin(String c){
        this.cin=c;
    }
    public String getCin(){
        return this.cin;
    }
    public void setNom(String n){
        this.nom=n;
    }
    public String getNom(){
        return this.nom;
    }
    public void setPrn(String p){
        this.prn=p;
    }
    public String getPrn(){
        return this.prn;
    }
}    
class Etudiant extends Personne{
    private String niveau;
    public void setNiveau(String nv){
        this.niveau=nv;  
    }
    public String getNiveau(){
        return this.niveau;
    }
  public void faireUneTache(){
      System.out.print("J'étudi l'analyse et la concetion orientée objet");
  }   
}
class Professeur extends Personne{
     private String specialite ;
     public void setSpecialite(String sp){
         this.specialite=sp; 
     }
     public String getSpecialite(){
         return this.specialite;
     }
     public void faireUneTache(){
         System.out.print("J'enseigne un module");
     }
}
public class Polymorphisme {
    public static String lire(){
        String st="";
        int c;
        try{
            while((c=System.in.read())!='\n')
                st+=(char)c;
        }catch(java.io.IOException ex){
            
        }
        return st;       
    }
    public static Personne creerPersonne(){
        int nbr;
        System.out.print("\n\n\tEntrer un nombre entier positif :");
        nbr=Integer.parseInt(lire());
        return( nbr %2==0? new Professeur():new Etudiant());
    }
    public static void main(String[] args) {
       creerPersonne().faireUneTache();
    }
    
}
