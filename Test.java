package projet.java.western;

import java.util.Scanner;

/* Classe test pour éviter les erreurs */
public class Test {

    /* Méthode qui permet de demander un chiffre valable lors des questions à l'utilisateur */
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
    