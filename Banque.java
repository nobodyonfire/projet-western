/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet.java.western;
import java.util.Scanner; 
import static projet.java.western.Saloon.ANSI_GREEN_BACKGROUND;
import static projet.java.western.Saloon.ANSI_RESET;
import static projet.java.western.Saloon.ANSI_WHITE;

/**
 *
 * @author Eloi Texier
 */
public class Banque extends Location implements Move_Location, Menu{
    
    
    
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public static final String ANSI_BLUE = "\u001B[34m";
    
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    private static final Banque Banque_Populaire = new Banque("Banque Populaire",0,0);
    
    int Stocke;
    
    public Banque(String Nom,int Danger, int Stocke){
        super(Nom,Danger);
        this.Stocke = Stocke;
    }
 
    public void SetName(String Nom){
        this.Nom = Nom;
    } 
    
    public void SetDanger(int Danger){
        this.Danger = Danger;
    } 
    
    public void SetStocke(int Stocke){
        this.Stocke = Stocke;
    }
    
    public String GetName(){
        return this.Nom;
    }
    
    public int GetDanger(){
        return this.Danger;
    }
    
    public int GetStocke(){
        return this.Stocke;
    }
    
    
    public void Deposer(Player player){
        System.out.println("Combien voulez-vous déposer ?");
        Scanner q = new Scanner(System.in);
        int montant = q.nextInt();
        if (montant > player.getArgent()){
            System.out.println("Vous voulez déposer plus d'argent que vous avez. Je dépose donc tout votre argent sur votre compte.");
            Banque_Populaire.SetStocke(Banque_Populaire.GetStocke() + player.getArgent());
            player.SetArgent(0);
        }
        else{
            System.out.println("Votre dépot de " + montant + " a bien été pris en compte. Merci de nous faire confiance.");
            Banque_Populaire.SetStocke(Banque_Populaire.GetStocke() + montant);
            player.SetArgent(player.getArgent()-montant);
        }
        System.out.println("Vous avez actuellement" + Banque_Populaire.GetStocke() + "$ stocké chez nous.");
        Menu(player);
        
    }
    
    public void Recuperer(Player player){
        System.out.println("Combien voulez-vous récupérer ? Vous avez actuellement " + Banque_Populaire.GetStocke() + "$ en banque.");
        Scanner q = new Scanner(System.in);
        int montant = q.nextInt();
        if (montant > Banque_Populaire.GetStocke()){
            System.out.println("J'imagine que vous voulez tout retirer.");
            player.SetArgent(Banque_Populaire.GetStocke());
            Banque_Populaire.SetStocke(0);
        }
        else{
            player.SetArgent(montant);
            Banque_Populaire.SetStocke(Banque_Populaire.GetStocke() - montant);
        }
        System.out.println("Merci de nous faire confiance. Il vous reste "+ Banque_Populaire.GetStocke() + "$.");
        Menu(player);
    }
    
    public void Monargent(Player player){
        System.out.println("Vous avez " + Banque_Populaire.GetStocke() + "$ sur votre compte");
        Menu(player);
    }
    
    public void display_menu(){
        System.out.println("Selection: ");
        System.out.println("1) Déposer  \n2) Récupérer \n3) Vérifier mon compte \n4) Partir");
    }
    
    public void display_location(){
        
        System.out.println("Selection: ");
        System.out.println("1) Saloon  \n2) Armurerie \n3) Prison \n4) Eglise \n5) Extérieur de la ville \n6) Rester");
    }
    @Override
    public void changelocation(Player player) {
        
        Prison Lockcity = new Prison("Lockcity",50,"NULL");
        Armurie Bangout = new Armurie("Bangout",10,"NULL");
        Eglise SantaMaria = new Eglise("SantaMaria",10);
        Saloon le7iemeciel = new Saloon("le7iemeciel", 10, "NULL");
        
        System.out.println("Où voulez-vous aller ?");
        Scanner q = new Scanner(System.in);
        
        display_location();
        
        switch (q.nextInt()) 
	{
   
	    case 1:
                System.out.println();    
                System.out.println("Vous entrez dans le Saloon.");
                player.SetLocation(le7iemeciel);
                le7iemeciel.Menu(player);
                break;
  
	    case 2:
                System.out.println();
                System.out.println("Vous entrez dans l'armurerie.");
                player.SetLocation(Bangout);
                Bangout.Menu(player);
                break;
  
	    case 3:
                System.out.println(); 
                System.out.println("Vous entrez dans la prison.");
                player.SetLocation(Lockcity);
                Lockcity.Menu(player);
                break;
            case 4:
                System.out.println(); 
                System.out.println("Vous entrez dans l'église Santa Maria.");
                player.SetLocation(SantaMaria);
                SantaMaria.Menu(player);
            case 5:
 
                System.out.println();   
                System.err.println ("Allons à l'aventure !");
                System.out.println("Vous sortez de la ville faites bien attention.");
                break;
            
            case 6:
 
                System.out.println();
                Menu(player);
                break;
              
	}
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Menu(Player player) {
        
        Scanner q = new Scanner(System.in);
        display_menu();
        switch (q.nextInt()) 
	{
   
	    case 1:
                System.out.println();    
                Deposer(player);
                break;
  
	    case 2:
                System.out.println();
                Recuperer(player);
                break;
  
	    case 3:
                System.out.println ( "" );
                Monargent(player);
                break;
            
            case 4:
                System.out.println("");
                changelocation(player);
                break;
                
	    default:
                Menu(player);
                System.out.println();
                System.err.println ( "Unrecognized option" );
                break;
              
	}
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
