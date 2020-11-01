/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet.java.western;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */


public class Test {

    public static int test() {
    boolean a = false;
    Scanner scan = new Scanner(System.in);
    int valeur = 0;
    do{
        System.out.print("sélection: ");
        if(scan.hasNextInt() ){
            valeur= scan.nextInt(); 
            a = true;
        }else{
            scan.nextLine();
            System.out.println("Entrez un chiffre valide !");
        }
    }while(!a);
    
   return valeur;
  }
    
}
    