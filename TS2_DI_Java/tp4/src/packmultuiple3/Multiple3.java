
package packmultuiple3;
public class Multiple3 {
    public static void affichermultiple3(){
      for (int i = 93; i <= 507; i++) {
            if(i % 3 ==0){
                System.out.print("\t"+i);
            } 
            if(i%15==0)
                System.out.print("\n");
        }
    }
    public static void main(String[] args) {
        Multiple3 mult3 = new Multiple3();
        mult3.affichermultiple3();
    }    
}
