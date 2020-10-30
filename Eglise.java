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
public class Eglise extends Location implements Move_Location{
    
    
    
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_CYAN = "\u001B[36m";
    
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    
    protected String Name;
    
    public Eglise(String Nom,int Danger,String Name){
        super(Nom,Danger);
        this.Name=Name;
    }

     
    public void Save(Player player){  
        
        player.playersave();

    }
    
    
    
    
    
    
    
     public void display_location()
    {
        System.out.println("Selection: ");
        System.out.println("1) Prison  \n2) Banque \n3) Armurie \n4) Far West ");
	
    }
    
     @Override
    public void changelocation(Player player) {
        
        Prison Lockcity = new Prison("Lockcity",50,"NULL");
        Armurie Bangout = new Armurie("Bangout",10,"NULL");
        Banque Banque_Populaire = new Banque("Banque Populaire", 10, 0);
        
        System.out.println("Où voulez-vous aller ?");
        Scanner q = new Scanner(System.in);
        
        display_location();
        
        switch (q.nextInt()) 
	{
   
	    case 1:
                System.out.println();    
                System.out.println ("Allons voir si le sherif à de nouvelles choses.." );
                System.out.println("Vous entrez dans la prison");
                player.SetLocation(Lockcity);
                Lockcity.Menu(player);
                break;
  
	    case 2:
                System.out.println();
                System.out.println ("Allons faire un tour à la banque..");
                System.out.println("Vous entrez dans la banque.");
                player.SetLocation(Banque_Populaire);
                Banque_Populaire.Menu(player);
                break;
  
	    case 3:
                System.out.println ( "Allons acheter une nouvelle arme..");
                System.out.println("Vous entrez dans l'armurie.");
                Bangout.Menu(player);
                break;
            case 4:
 
                System.out.println();   
                System.err.println ("Allons à l'aventure !");
                System.out.println("Vous sortez de la ville faites bien attention.");

                break;
        
              
	}
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
