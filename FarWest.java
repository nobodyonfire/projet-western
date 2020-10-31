/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet.java.western;
import java.util.Random;
import java.util.Scanner; 
import static projet.java.western.ProjetJavaWestern.clearScreen;
import static projet.java.western.ProjetJavaWestern.duel;
import static projet.java.western.ProjetJavaWestern.sleep;
import static projet.java.western.Saloon.ANSI_GREEN_BACKGROUND;
import static projet.java.western.Saloon.ANSI_RESET;
import static projet.java.western.Saloon.ANSI_WHITE;

/**
 *
 * @author Eloi Texier
 */
public class FarWest extends Location implements Move_Location, Menu{
    
    
    
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public static final String ANSI_BLUE = "\u001B[34m";
    
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    private static final FarWest FarWest = new FarWest("Far West",0);
    
    int Stocke;
    
    public FarWest(String Nom,int Danger){
        super(Nom,Danger);

    }

    public void Explorer (Player player){
        
        clearScreen(50);
        
        int curseur = 50;
        int[] profondeur = {50,0,0,0,0,0};
        int niveau= 1;
        int random = 1;
        int randomnext=1;
                
        int reponse=4;
        
        System.out.println("");
        System.out.println(ANSI_BLUE+"Vous allez Entrer dans le far West "+ANSI_RESET);
        System.out.println("");
        System.out.println(ANSI_GREEN+"X"+ANSI_RESET+" : votre position");
        System.out.println(ANSI_RED+"X"+ANSI_RESET+" : du bruit !");
        System.out.println("");
        map.printchemin(curseur,random);
        

        explorercarte(player,niveau,profondeur,curseur,random,reponse,randomnext);
        
        sleep(5000);
        
    }
    
    public void explorercarte(Player player,int niveau,int[] profondeur,int curseur,int random,int reponse,int randomnext){
        
        
        if (profondeur[5]!=0){
            System.out.println("Vous êtes trop loin ! vous rencontrez le chef de tribu indienne !"); 
        }
        randomnext=random;
        random = getRandomNumberInRange(0,2);
        
        System.out.println("randomnext " + random);
        System.out.println("reponse " + reponse);
        
        System.out.println("");
        System.out.println(ANSI_BLUE+"Vous avez actuellement :"+ player.getHP()+" HP"+ANSI_RESET);
        System.out.println("");
        System.out.println("1) Gauche \n2) Milieu \n3) Droite \n4) Revenir en arriere \n5) Quitter");
        System.out.println("");
        System.out.println("Où voulez-vous aller ?");
        System.out.print("Selection :");
        
        
        Scanner q = new Scanner(System.in);  
        switch (q.nextInt()) 
	{
	    case 1:
                
                clearScreen(50);
                for (int i = 0; i < niveau; ++i) {
                    map.printpartchemin(profondeur[i]);
                }
                
                curseur=curseur-5;
                profondeur[niveau]=curseur;
                niveau=niveau+1;
                reponse=1;
                
                map.printchemin(curseur,random);
                
                if (random+1==reponse){
                actionexplorer(player,randomnext, reponse);
                
                clearScreen(50);
                 for (int i = 0; i < niveau-1; ++i) {
                    map.printpartchemin(profondeur[i]);
                }
                 map.printchemin(curseur+5,random);
                }
                

                explorercarte(player,niveau,profondeur,curseur,random,reponse,randomnext);
                break;  
                
            case 2:
                
                clearScreen(50);
                 for (int i = 0; i < niveau; ++i) {
                    map.printpartchemin(profondeur[i]);
                }
                 
                profondeur[niveau]=curseur;
                niveau=niveau+1;
                reponse=2;
                
                map.printchemin(curseur,random);
                
                if (random+1==reponse){
                actionexplorer(player,randomnext, reponse);
                
                clearScreen(50);
                for (int i = 0; i < niveau-1; ++i) {
                    map.printpartchemin(profondeur[i]);
                }
                 map.printchemin(curseur,random);
                }
                
                
                
                explorercarte(player,niveau,profondeur,curseur,random,reponse,randomnext);
                break;
                
            case 3:
                clearScreen(50);
                 for (int i = 0; i < niveau; ++i) {
                    map.printpartchemin(profondeur[i]);
                }

                profondeur[niveau]=curseur;
                niveau=niveau+1;
                curseur=curseur+5;
                reponse=3;
                
                map.printchemin(curseur,random);
                
                
                if (random+1==reponse){
                actionexplorer(player,randomnext, reponse);
                
                clearScreen(50);
                 for (int i = 0; i < niveau-1; ++i) {
                    map.printpartchemin(profondeur[i]);
                }
                 map.printchemin(curseur-5,random);
                }
                
                

                explorercarte(player,niveau,profondeur,curseur,random,reponse,randomnext);
                break;
                
            case 4:
                if (niveau<1){      
                    explorercarte(player,niveau,profondeur,curseur,random,reponse,randomnext);
                }
                niveau=niveau-1;
                reponse=4;
                
                clearScreen(50);
                 for (int i = 0; i < niveau-1; ++i) {
                    map.printpartchemin(profondeur[i]);
                }
                 
                reponse=3;                
                curseur=profondeur[niveau-1];
                map.printpartchemin(curseur);
                random = getRandomNumberInRange(0,2);
                explorercarte(player,niveau,profondeur,curseur,random,reponse,randomnext);
                break;  
                
            case 5:
                Menu(player);
                break;
  
            default:
                explorercarte(player,niveau,profondeur,curseur,random,reponse,randomnext);
                break;
        }
        
    }
    
    
    public void majcarte(int niveau,int[] profondeur , int curseur,int random){
        
        
    }
    
    public void actionexplorer(Player player,int random, int reponse){
        
        
      
            clearScreen(50);
            int action = getRandomNumberInRange(0,10);
            
            if (action<7){
                System.out.println("");
                System.out.println(ANSI_BLUE+"Il n'y a rien ici ..."+ANSI_RESET);
                System.out.println(ANSI_BLUE+"C'est surrement plus loin"+ANSI_RESET);
                System.out.println("");    
            }
            if (action==7){
                System.out.println("");
                System.out.println(ANSI_BLUE+"Vous rencontrez un indien gentil qui va soigner vos blessures!"+ANSI_RESET);
                System.out.println("");  
                player.soin(10, player);
            }
            
            if (action==8){
                System.out.println("");
                System.out.println(ANSI_BLUE+"Vous vous faites attaquer et vous recevez une flèche dans le corps!"+ANSI_RESET);
                System.out.println("");    
                player.soin(-10, player);
            }
            if (action>8){
                System.out.println("");
                System.out.println(ANSI_BLUE+"Vous rencontrez un brigand!"+ANSI_RESET);
                System.out.println("");  

     

             int brigandrd = getRandomNumberInRange(0,2); 
             
             
             if (brigandrd!=0){
                 
                Brigand brigand=Brigand.createBrigand(1,FarWest,new Arme("Pistolet de seconde main", 10, 1, 80, 10));
                duel(player,brigand);
                System.out.println("");
                System.out.println(ANSI_BLUE+"Vous l'avez terrassé !"+ANSI_RESET);
                player.soin(10, player);
                player.add_argent(20, player);

             }
             
             else {
                Brigand brigand = player.getBrigand();
                System.out.println("");
                System.out.println(ANSI_BLUE+"Le brigand de la quete !"+ANSI_RESET);
                System.out.println("");
                duel(player,brigand);
                System.out.println("");
                System.out.println(ANSI_BLUE+"Vous avez complété la quete du sherif !"+ANSI_RESET);
                System.out.println(ANSI_BLUE+"Voici votre récompense !"+ANSI_RESET);
                player.add_argent(200, player);
                 
                 
             
    

            }
            
            
            
            
            
            
        }
        
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
     private static int getRandomNumberInRange(int min, int max) {
	if (min >= max) {
		throw new IllegalArgumentException("MAX > MIN");
	}
	Random r = new Random();
	return r.nextInt((max - min) + 1) + min;
    }
    
    
    public void display_menu(){
        System.out.println("");
        System.out.println("Selection: ");
        System.out.println("1) Explorer  \n4) Partir");
    }
    
    public void display_location(){
        
        System.out.println("Selection: ");
        System.out.println("1) Saloon  \n2) Armurerie \n3) Prison \n4) Eglise \n5) Banque \n6) Rester");
    }
    @Override
    public void changelocation(Player player) {
        
        Prison Lockcity = new Prison("Lockcity",50,"NULL");
        Armurie Bangout = new Armurie("Bangout",10,"NULL");
        Eglise SantaMaria = new Eglise("SantaMaria",10);
        Saloon le7iemeciel = new Saloon("le7iemeciel", 10, "NULL");
        Banque Banque_Populaire = new Banque("Banque Populaire", 10, 0);
        
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
                System.out.println("Vous allez entrer dans la banque");
                Banque_Populaire.Menu(player);
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
        System.out.println();
        System.out.println(ANSI_GREEN_BACKGROUND+ ANSI_WHITE+"Vous êtes dans au FarWest !"+ ANSI_RESET);
        System.out.println();
        Scanner q = new Scanner(System.in);
        display_menu();
        switch (q.nextInt()) 
	{
   
	    case 1:
                System.out.println();    
                Explorer(player);
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

    private void cleanScreen(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}