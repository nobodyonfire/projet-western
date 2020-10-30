/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet.java.western;

import java.util.Scanner;
import static projet.java.western.Personnages.ANSI_RESET;
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
        System.out.println(ANSI_BLUE+"Salut mon petit , tu veux une quete ?"+ANSI_RESET);
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
        pressenter();
    }
    
    public void Vendre(){
        
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
        
        System.out.println("Where do you want to go ?");
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
	System.out.println("Que voulez vous faire ?");
	Scanner q = new Scanner(System.in);
       
	
        display_menu();
        
	switch (q.nextInt()) 
	{
   
  
	    case 1:
                System.out.println();    
                System.out.println ("Allons parler au sherif" );
                Sherif(player);
	    break;
  
	    case 2:
                System.out.println();
                System.out.println ( "Vendons notre arme..." );
                Vendre();
	    break;
            case 3:
                System.out.println("I'm gonna leave this place");
                changelocation(player);
	    default:
                Menu(player);
                System.out.println();
                System.err.println ( "Unrecognized option" );
	    break;
              
	}
    }
    
    
    
    
}
