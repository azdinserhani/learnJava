/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projetcollectionmaptp2;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileWriter;


/**
 *
 * @author azdine
 */
public class ProjetCollectionMApTp2 {

     public static class Etd{
          String name,lastName;
          Etd(String name,String lastName){
              this.name = name;
              this.lastName = lastName;
                      
          }
          private String getValue(){
              String value = this.name +" "+this.lastName+"\n";
              return value;
          }
      }
    public static void main(String[] args) {
     
        Etd etd1= new Etd("azdine","serhani");
        
        try {
        FileWriter file = new FileWriter("test.txt",true);
        File myFile = new File("test.txt");
        Scanner myReader = new Scanner(myFile);
            file.write(etd1.getValue());
            file.close();
            System.out.println("sucuss");
            while(myReader.hasNext()){
                String data = myReader.nextLine();
                System.out.println(data);
            }
        } catch (IOException e) {
            System.out.println("error in "+e.getMessage());
        }
        
        
    }
    
}
