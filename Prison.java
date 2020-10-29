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
public class Prison extends Location implements Move_Location{
    
    
    
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
        introduction(Nom);
    }
    
    public void introduction(String Nom){
        System.out.println();
        System.out.println(ANSI_RED + "La nouvelle Prison : " + Nom +", viens d'apparaitre dans la ville"+ANSI_RESET);
        System.out.println();
    }
    
    
    
    
    
    
     
    public void Acheter(){  
        
    }
    public void Vendre(){
        
    }
    
      public void display_menu() 
    {
	System.out.println("1) Acheter  \n2) Vendre \n3) leave");
	System.out.print("Selection: ");  
    }
    
    
    
    public void question(Player player) 
    {
        System.out.println();
	System.out.println(ANSI_GREEN_BACKGROUND+ ANSI_WHITE+"Vous êtes dans la prison !"+ ANSI_RESET);
	System.out.println("Que voulez vous faire ?");
	Scanner q = new Scanner(System.in);
       
	
        display_menu();
        
	switch (q.nextInt()) 
	{
   
  
	    case 1:
                System.out.println();    
                System.out.println ("Achetons une nouvelle arme !" );
                Acheter();
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
                question(player);
                System.out.println();
                System.err.println ( "Unrecognized option" );
	    break;
              
	}
    }
    
    
     public void display_location()
    {
        System.out.println("Selection: ");
        System.out.println("1) Saloon  \n2) Banque \n3) Armurie \n4) Sortir de la ville \n5) Rester");
	
    }
    
    @Override
    public void changelocation(Player player) {
        
        Saloon le7iemeciel = new Saloon("Le 7 ième ciel",10,"NULL");
        Prison Lockcity = new Prison("Lockcity",50,"NULL");
        Armurie Bangout = new Armurie("Bangout",10,"NULL");
        
        System.out.println("Where do you want to go ?");
        Scanner q = new Scanner(System.in);
        
        display_location();
        
        switch (q.nextInt()) 
	{
   
	    case 1:
                System.out.println();    
                System.out.println ("Je vais aller au bar, envie de m'amuser un petit peu." );
                player.SetLocation(le7iemeciel);
                le7iemeciel.question(player);
                break;
  
	    case 2:
                System.out.println();
                System.out.println ("Need to save my money");
                break;
  
	    case 3:
                System.out.println ( "J'ai besoin d'une nouvelle arme. Elle a souffert lors de mon dernier affrontement.");
                player.setLocation(Bangout);
                Bangout.question(player);
                break;
            case 4:
 
                System.out.println();
                System.err.println ( "Let's capture some bad guy ! " );
                break;
            
            case 5:
 
                System.out.println();
                System.err.println ( "Je vais rester. Peut être qu'un prisonnier va s'échapper." );
                question(player);
	    break;
              
	}
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
