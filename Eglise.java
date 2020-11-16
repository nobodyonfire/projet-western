/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet.java.western;

import java.util.Scanner;
import static projet.java.western.ProjetJavaWestern.pressenter;


/**
 *
 * @author ASUS
 */
public class Eglise extends Location implements Move_Location, Menu{
    
    
    
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_CYAN = "\u001B[36m";
    
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    
    
    public Eglise(String Nom,int Danger){
        super(Nom,Danger);
    }

     
    public void Save(Banque banque,Player player){  
        
        player.playersave(banque);
        Menu(player);

    }
    
    private void Quitter(){
        System.out.println("Vous quittez la partie.");
        pressenter();
        System.exit(0); 
    }
    
    
    
    
    
     public void display_location()
    {
        System.out.println("Sélection: ");
        System.out.println("1) Saloon  \n2) Banque \n3) Armurerie \n4) Prison \n5) Extérieur de la ville \n6) Rester");
	
    }
    
     @Override
    public void changelocation(Player player) {
        
        Prison Lockcity = new Prison("Lockcity",50,"NULL");
        Armurie Bangout = new Armurie("Bangout",10,"NULL");
        Banque Banque_Populaire = new Banque("Banque Populaire", 10, 0);
        Saloon le7iemeciel = new Saloon("Le 7 ième ciel",10,"le7iemeciel");
        FarWest Farwest = new FarWest("Farwest", 0);
        
        System.out.println("Où voulez-vous aller ?");

        
        display_location();
        int q = Test.test();
        switch (q) 
	{
   
	    case 1:
                System.out.println(); 
                System.out.println("Vous entrez dans le Saloon");    
                player.SetLocation(le7iemeciel);
                le7iemeciel.Menu(player);
                break;
  
	    case 2:
                System.out.println(); 
                System.out.println("Vous entrez dans la Banque.");
                player.SetLocation(Banque_Populaire);
                Banque_Populaire.Menu(player);
                break;
  
	    case 3:
                System.out.println(); 
                System.out.println ("Vous entrez dans l'armurerie.");
                player.SetLocation(Bangout);
                Bangout.Menu(player);
                break;
                
            case 4:
                System.out.println(); 
                System.out.println("Vous entrez dans la prison.");   
                player.SetLocation(Lockcity);
                Lockcity.Menu(player);
                break;
                
            case 5:
                System.out.println(); 
                System.out.println("Vous entrer dans le Far west. Faites attention! Le danger rôde.");
                player.SetLocation(Farwest);
                Farwest.Menu(player);
                break;
                
            case 6:
                System.out.println("");
                Menu(player);
                break;  
                
            default:
                System.out.println("");
                System.err.println ( "Erreur" );
                changelocation(player);
	    break;
	}
        
        throw new UnsupportedOperationException("Erreur"); 
    }
    
    public void display_menu(){
        System.out.println("Sélection: ");
        System.out.println("1) Sauvegarder  \n2) Quitter le jeu \n3) Partir");
    }
    

    @Override
    public void Menu(Player player) {
        System.out.println();
        System.out.println(ANSI_GREEN_BACKGROUND+ ANSI_WHITE+"Vous êtes dans l'église !"+ ANSI_RESET);
        System.out.println();
        Banque Banque_Populaire = new Banque("Banque Populaire", 10, 0);
        display_menu();
        int q = Test.test();
        switch (q) 
	{
   
	    case 1:
                System.out.println();    
                Save(Banque_Populaire,player);
                break;
  
	    case 2:
                System.out.println();
                Quitter();
                break;
  
	    case 3:
                System.out.println ( "" );
                changelocation(player);
                break;
                
	    default:
                Menu(player);
                System.out.println();
                System.err.println ( "Erreur" );
                break;
              
	}
        
        throw new UnsupportedOperationException("Erreur"); 
    }
    
    
    
    
}
