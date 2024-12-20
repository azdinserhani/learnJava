
package pack_age;


public class Age {

    String nom,prenom;
    int an,aa,age;
    public String lire(){
        int c;
        String st="";
        try {
         while((c=System.in.read())!='\n')
            st=st+(char)c;
        }catch(java.io.IOException ox){
        }
        return st;
    }
    public int calculer(int n,int a){
        return a-n;
    }
    public void afficher(){
        System.out.print("\n\n\n\t\t\tl'age d'un personne");
        System.out.print("\n\n\tNom de la perssone  :");
        nom=lire();
        System.out.print("\n\n\tPrénom de la perssone  :");
        prenom=lire();
        System.out.print("\n\n\tAnné de naissance  :");
        an=Integer.parseInt(lire());
       System.out.print("\n\n\tAnne actuelle  :");
       aa=Integer.parseInt(lire());
       age = calculer( an, aa);
       System.out.print("\n\n\tAge de personne :"+age);
        
    }   
    
    public static void main(String[] args) {
         Age ag =new Age();
         ag.afficher();
            }
     }
