/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet.java.western;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import static projet.java.western.Personnages.ANSI_RESET;
import static projet.java.western.ProjetJavaWestern.ANSI_BLUE;
import static projet.java.western.ProjetJavaWestern.ANSI_RESET;
import static projet.java.western.ProjetJavaWestern.clearScreen;
import static projet.java.western.ProjetJavaWestern.listearme;
import static projet.java.western.Saloon.ANSI_GREEN_BACKGROUND;
import static projet.java.western.Saloon.ANSI_WHITE;

/**
 *
 * @author ASUS
 */
public class Armurie extends Location implements Move_Location, Menu{
    
    
    
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public static final String ANSI_BLUE = "\u001B[34m";
    
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    
    protected String Name;
    
    public Armurie(String Nom,int Danger,String Name){
        super(Nom,Danger);
        this.Name=Name;
    }

     
    public void Acheter(){  
        
        questionAcheterArme();
        
        
    }
    

    
    private static void printList(Arme[] maliste) {
       int compteur=0;
       System.out.print("N*  "+"Nom                       "+"PMAX"+" PMIN"+ "  ACC." + "    Prix" ); 
       clearScreen(2);
       for (Arme Arme1 : maliste) {
           System.out.print(compteur+ ")"+" "); 
           if (compteur<10) {System.out.print(" ");}
           System.out.print(Arme1.getname()+" "); 
           taille(Arme1.getname(),25);taille(String.valueOf(Arme1.getpuissanceMax()),4);
           System.out.print(Arme1.getpuissanceMax()+" "); 
           taille(String.valueOf(Arme1.getpuissanceMin()),4);
           System.out.print(Arme1.getpuissanceMin()+" "); 
           taille(String.valueOf(Arme1.getaccuracy()),4);
           System.out.print(Arme1.getaccuracy()+" "); 
           taille(String.valueOf(Arme1.getprix()),7);
           System.out.print(ANSI_BLUE + Arme1.getprix()+" " +ANSI_RESET); 

           clearScreen(1);
           compteur = compteur + 1;
           
    }   
    }
    
    
      private static void taille(String mot,int max){
        int taillemot=mot.length();
        for (int i = 0; i < max-taillemot; ++i) 
            System.out.print(" ");
    }
   
    public static void clearScreen(int j) {  

        for (int i = 0; i < j; ++i) System.out.println("");

    }
    
    
    
    public void display_menuAcheter() 
    {
        
        /* EN <ARRAY> CA NE MARCHE PAS  */ 
        Arme[] listearme2= {new Arme("Pistolet de seconde main", 10, 1, 80, 10),new Arme("Colt anaconda", 60, 30, 85, 400),new Arme("Calibre .44 PN", 70, 25, 70, 450),new Arme("Colt baby dragon", 80, 10, 80, 600),new Arme("Remington 1875 USA Army", 80, 53, 85, 1000),new Arme("Fusil_Henry", 30, 15, 95, 500),new Arme("fusil Sharps", 35, 10, 97, 550),new Arme("Winchester modele 1873", 20, 5, 99, 600),new Arme("Winchester modele 1887", 35, 20, 100, 700),new Arme("Whinchester modele 1895", 45, 30, 100, 800),new Arme("Whinchester modele 1897", 150, 60, 60, 1520),new Arme("Fusil double canon", 130, 40, 55, 700),new Arme("Fusil a canon scié", 170, 50, 33, 900),new Arme("The Lucky Luke", 200, 1, 50, 1500),new Arme("Couteau", 10, 9, 100, 0)};
        Arrays.sort(listearme2,new Armecomparator());
        clearScreen(2);
        printList(listearme2);
        clearScreen(2);
    }
    
    
    public void listearme2(){

        
        
        
        
        
        
    }
   
    
    
    
    public void questionAcheterArme() 
    {
        System.out.println("");
	System.out.println("Que voulez vous Acheter?");
	Scanner q = new Scanner(System.in);
       

        display_menuAcheter();
        
        System.out.println("");
        System.out.println("selection ?=");
	switch (q.nextInt()) 
	{
   
  
	    case 1:
            System.out.println();    
	    break;
  
	    case 2:
            System.out.println();
	    System.out.println ( "Vendons notre arme..." );
	    break;
            
            default:
            questionAcheterArme();
            System.out.println();
	    System.err.println ( "Unrecognized option" );
	    break;
              
	}
    }
   
    public void questionAcheter(Player player) 
    {
        System.out.println();
	System.out.println("Que voulez vous Acheter?");
	Scanner q = new Scanner(System.in);
       

        display_menu();
        
	switch (q.nextInt()) 
	{
   
  
	    case 1:
            System.out.println();    
            Acheter();
	    break;
  
	    case 2:
            System.out.println();
	    System.out.println ( "Vendons notre arme..." );
	    Vendre();
	    break;
            
            default:
            Menu(player);
            System.out.println();
	    System.err.println ( "Unrecognized option" );
	    break;
              
	}
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public void Vendre(){
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    public void display_menu() 
    {
	System.out.println("1) Acheter  \n2) Vendre \n3) leave");
	System.out.print("Selection: ");  
    }

    
     public void display_location()
    {
        System.out.print("Selection: ");
        System.out.println("1) Townhall  \n2) Bank \n3) Weapon Shop \n4) Outside the town \n5) Stay");
	
    }
    
    @Override
    public void changelocation(Player player) {
        
        System.out.println("Where do you want to go ?");
        Scanner q = new Scanner(System.in);
        
        display_location();
        
        switch (q.nextInt()) 
	{
   
	    case 1:
            System.out.println();    
	    System.out.println ("Let's see if the sheriff has something for us" );
	    break;
  
	    case 2:
            System.out.println();
	    System.out.println ("Need to save my money");
	    break;
  
	    case 3:
	    System.out.println ( "J'ai encore des choses a faire..");
	    break;
            case 4:
 
            System.out.println();
	    System.err.println ( "Let's capture some bad guy ! " );
	    break;
            
            case 5:
 
            System.out.println();
	    System.err.println ( "Let's drink a bit more" );
            Menu(player);
	    break;
              
	}
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Menu(Player player) {
        
        System.out.println();
	System.out.println(ANSI_GREEN_BACKGROUND+ ANSI_WHITE+"Vous êtes dans l'armurie !"+ ANSI_RESET);
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
            Menu(player);
            System.out.println();
	    System.err.println ( "Unrecognized option" );
	    break;
              
	}
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    
}
