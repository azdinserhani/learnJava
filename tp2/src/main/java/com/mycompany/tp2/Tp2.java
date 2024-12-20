package com.mycompany.tp2;

public class Tp2 {
    private String numF,dft;
    private float tht,ttc;
     public void Facture() {
        System.out.println("\tFacture");
        System.out.println("Numero de la Facture         :");
        numF=GetInput();
        System.out.println("Date de la facture           :");
        dft = GetInput();
        System.out.println("Total hors tax               :");
        tht = Float.parseFloat(GetInput());
        ttc = Calculate(tht);
        System.out.println("Total Toutes taxes Comprises :"+ttc);

    }
     public float Calculate(float ht){
         return ht + ht * 0.2f;
     }
     public String GetInput(){
         String st = "";
         int c;
         try {
             while ((c = System.in.read()) != '\n') {                 
                 st += (char)c;
             }
         } catch (Exception e) {
         }
         return st;
     }
    public static void main(String[] args) {
        Tp2 tes = new Tp2();
        tes.Facture();
  
    }
    
    
}
