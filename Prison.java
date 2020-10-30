/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet.java.western;

import java.util.Random;
import java.util.Scanner;
import static projet.java.western.Personnages.ANSI_RESET;
import static projet.java.western.ProjetJavaWestern.duel;
import static projet.java.western.Saloon.ANSI_GREEN_BACKGROUND;
import static projet.java.western.Saloon.ANSI_WHITE;

/**
 *
 * @author ASUS
 */
public class Prison extends Location implements Move_Location, Menu{
    
    
    
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public static final String ANSI_BLUE = "\u001B[34m";
    
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    
    protected String Name;
    
    public Prison(String Nom,int Danger,String Name){
        super(Nom,Danger);
        this.Name=Name;
    }
    
    
    
    
    
    
    
     
    public void Sherif(Player player){  
        
        System.out.println("");
        System.out.println(ANSI_GREEN+"Sherif : Salut mon petit , tu veux une quete ?"+ANSI_RESET);
        System.out.println("");
        System.out.println("1) oui");
        System.out.println("2) non");
        System.out.println("");
        System.out.print("selection = ");
        Scanner q = new Scanner(System.in);   
        switch (q.nextInt()) 
	{
	    case 1:
                Sherifquete(player);
                break;
  
	    case 2:
                Menu(player);
                break;
  
        
        }  
    }
    
     public void Sherifquete(Player player){
        System.out.println("");
        Brigand brigandquete = Brigand.createBrigand(1,new Eglise("SantaMaria",10),new Arme("Pistolet de seconde main", 10, 1, 80, 10));
        player.setBrigand(brigandquete);
        System.out.println("");
        System.out.println("Partons à la recherche de '"+ brigandquete.getName()+"'");
        System.out.println("");
        System.out.println(ANSI_GREEN+"Sherif : Bon courage petit !"+ANSI_RESET);
        System.out.println("");
        pressenter();
    }
    
    public void Vendre(){
        
    }
    
    public void testevasion(Player player){
        int a=getRandomNumberInRange(0,5);
        if (a==0){
            
        System.out.println(ANSI_GREEN+"Sherif : Ho non ! Le prisonnier s'échappe !"+ANSI_RESET);
        pressenter(); System.out.println("");
        System.out.println(ANSI_GREEN+"Sherif : Eh " + player.getName() + " aide moi à le capturer  !"+ANSI_RESET);
        pressenter(); System.out.println("");
        System.out.println("");
        Brigand Jacob = Brigand.createBrigand(1,new Eglise("SantaMaria",10),new Arme("Pistolet de seconde main", 10, 1, 80, 10));
        duel(player, Jacob);
        recompense(player);
        }
    }
    
    public void recompense(Player player){
        player.add_argent(20, player);
        int HP = player.getHP();
        if (HP <100){
            player.SetHP(100);
        }
    }
    
    
    
    private static int getRandomNumberInRange(int min, int max) {
	if (min >= max) {
		throw new IllegalArgumentException("max must be greater than min");
	}
	Random r = new Random();
	return r.nextInt((max - min) + 1) + min;
    }
    
    
    
    
    
    
      public void display_menu() 
    {
	System.out.println("1) Parler au sherif \n3) Partir");
	System.out.print("Selection: ");  
    }
    
    
    
     public void display_location()
    {
        System.out.println("Selection: ");
        System.out.println("1) Saloon  \n2) Banque \n3) Armurie \n4) Eglise \n5) Sortir de la ville \n5) Rester");
	
    }
    
    @Override
    public void changelocation(Player player) {
        
        Saloon le7iemeciel = new Saloon("Le 7 ième ciel",10,"NULL");
        Armurie Bangout = new Armurie("Bangout",10,"NULL");
        Banque Banque_Populaire = new Banque("Banque Populaire",0,0);
        Eglise SantaMaria = new Eglise("SantaMaria",10);
        
        System.out.println("Où voulez-vous aller ? ?");
        System.out.println("");
        Scanner q = new Scanner(System.in);
        
        display_location();
        
        switch (q.nextInt()) 
	{
   
	    case 1:
                System.out.println();    
                System.out.println ("Vous entrez dans le Saloon." );
                player.SetLocation(le7iemeciel);
                le7iemeciel.Menu(player);
                break;
  
	    case 2:
                System.out.println();
                System.out.println ("Vous entrez dans la Banque.");
                player.SetLocation(Banque_Populaire);
                Banque_Populaire.Menu(player);
                break;
  
	    case 3:
                System.out.println(); 
                System.out.println ( "Vous entrez dans l'Armurerie.");
                player.SetLocation(Bangout);
                Bangout.Menu(player);
                break;
            case 4:
                System.out.println(); 
                System.out.println("Vous entrez dans l'Eglise.");
                player.SetLocation(SantaMaria);
                SantaMaria.Menu(player);
                break;
            case 5:
 
                System.out.println();
                System.err.println ( "Let's capture some bad guy ! " );
                break;
            
            case 6:
 
                System.out.println();
                System.err.println ( "Je vais rester. Peut être qu'un prisonnier va s'échapper." );
                Menu(player);
                break;
              
	}
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

     public static void pressenter(){
        Scanner readinput = new Scanner(System.in);
        String enterkey = "appuyer sur entrer...";
        System.out.print(enterkey);
        enterkey = readinput.nextLine();
        System.out.print(enterkey);
    
    }
    @Override
    public void Menu(Player player) {
        
        System.out.println();
	System.out.println(ANSI_GREEN_BACKGROUND+ ANSI_WHITE+"Vous êtes dans la prison !"+ ANSI_RESET);
        testevasion(player);
	System.out.println("Que voulez vous faire ?");
	Scanner q = new Scanner(System.in);
       
	
        display_menu();
        
	switch (q.nextInt()) 
	{
   
  
	    case 1:
                System.out.println("");    
                System.out.println ("Allons parler au sherif" );
                Sherif(player);
	    break;
  
	    case 2:
                System.out.println("");
                System.out.println ( "PROCHAINE MAJ DU JEU !" );
                Vendre();
	    break;
            case 3:
                System.out.println("");
                System.out.println("Je pars d'ici !");
                changelocation(player);
	    default:
                Menu(player);
                System.out.println("");
                System.err.println ( "Unrecognized option" );
	    break;
              
	}
    }
    
    
    
    
}
