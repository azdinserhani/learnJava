
package packfacture;


public class Facture {
    public void affichage(){
        System.out.print("\n\n\n\t\t\tFacture");
        System.out.print("\n\n\tNumero de la Facture :");
        System.out.print("\n\n\tDate de la Facture   :");
        System.out.print("\n\n\tTotal de la Facture  :");
    }

    
    public static void main(String[] args) {
        Facture fact = new Facture();
        fact.affichage();
        
    }
    
}
