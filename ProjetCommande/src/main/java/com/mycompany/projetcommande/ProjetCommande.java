package com.mycompany.projetcommande;


public class ProjetCommande {
    String num,date,nom,prenom;
    float montantC,montantR,totalMontant;
    public String lire(){
    int c;
    String st = "";
    
        try {
            while ((c = System.in.read()) != '\n') {
                st = st+(char)c;
            }
        } catch (Exception e) {
        }
        return st;
    }
    public void affichage(){
        System.out.println("\tCommande des clients");        
        System.out.println("numero de commande :");
        num = lire();
        System.out.println("date de commande   :");
        date = lire();
        System.out.println("Nom des client     :");
        nom = lire();
        System.out.println("prenom de client   :");
        prenom = lire();
        System.out.println("Monatnt de la commande :");
        montantC = Float.parseFloat(lire());
        montantR = montantC * calculerRemise(montantC);
        System.out.println("Montant de la remise   :"+montantR+" DH");
        float ttt = montantC - montantR;
        System.out.println("Total a payer          :"+ ttt +"DH");
    }
    public float calculerRemise(float montant){
        float f =0f;
        if (montant < 1000) {
            f = 0;
        }else if(montant < 5000 && montant >= 1000)  {
            f = 0.03f;
        }else if (montant < 10000 && montant >= 5000) {
            f = 0.05f;
        }else if(montant >= 10000){
            f= 0.7f;
        }
       return f;
    }
    public static void main(String[] args) {
        ProjetCommande projet = new ProjetCommande();
        projet.affichage();
    }
}
