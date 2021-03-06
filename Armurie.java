package projet.java.western;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import static projet.java.western.Arme.sleep;
import static projet.java.western.Personnages.ANSI_RESET;
import static projet.java.western.ProjetJavaWestern.ANSI_BLUE;
import static projet.java.western.ProjetJavaWestern.ANSI_RESET;
import static projet.java.western.ProjetJavaWestern.clearScreen;
import static projet.java.western.ProjetJavaWestern.listearme;
import static projet.java.western.Saloon.ANSI_GREEN_BACKGROUND;
import static projet.java.western.Saloon.ANSI_WHITE;


/* Classe de la location Armurie */
public class Armurie extends Location implements Move_Location, Menu{
    
    /* Initialisation des valeurs */
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_CYAN = "\u001B[36m";
    
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    
    protected String Name;
    
    /* Constructeur */
    public Armurie(String Nom,int Danger,String Name){
        super(Nom,Danger);
        this.Name=Name;
    }

    /* Méthode du menu de l'armurie*/
    public void Acheter(Player player){  
        
        questionAcheterArme(player,1);

    }
    
    /* Méthode du menu de l'armurie permettant de vendre son arme*/
    public void Vendre(Player player){
        System.out.println("");
        System.out.println(ANSI_BLUE+"Vous possédez actuellement un "+ player.Gun.getname()+ " qui vaut " + player.Gun.getprix()+" $"+ ANSI_RESET);
        System.out.println("Voulez-vous le vendre ?");
        System.out.println("");
        System.out.println("1) Oui");
        System.out.println("2) Non");
        System.out.println("");
        int q = Test.test();
	switch (q) 
	{  
	    case 1: 
            player.add_argent(player.Gun.getprix(),player);
            Arme Couteau = new Arme("Couteau", 10, 9, 100, 0);
            player.SetGun( Couteau );
            pressenter();
	    break;
            case 2:  
            Menu(player);
	    break;
            default:
            Vendre(player);
            System.out.println();
	    System.err.println ( "Erreur" );
	    break;
             }
           Menu(player); 
    }
    
    /* Méthode qui permet d'afficher la liste des armes trier en fonction du choix de l'utilisateur*/
    private static void printList(Arme[] maliste) {
       int compteur=0;
       System.out.print("N*  "+"Nom                       "+"PMAX"+" PMIN"+ "  ACC." + "   Prix" ); 
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
        System.out.println("");
        System.out.println(ANSI_CYAN+compteur+ ")"+" "+"TRIER par Prix"+ANSI_RESET); compteur = compteur + 1;    
        System.out.println(ANSI_CYAN+compteur+ ")"+" "+"TRIER par Accuracy"+ANSI_RESET); compteur = compteur + 1;  
        System.out.println(ANSI_CYAN+compteur+ ")"+" "+"TRIER par Puissance Maximum"+ANSI_RESET); compteur = compteur + 1;  
        System.out.println(ANSI_CYAN+compteur+ ")"+" "+"TRIER par Puissance Minimal"+ANSI_RESET); compteur = compteur + 1;  clearScreen(1);
        System.out.println(compteur+ ")"+" "+"Quitter"); compteur = compteur + 1;
    }
    
    
    /* Méthode qui permet de fabriquer le contenu du magasin, et de trier la liste qui sera afficher*/
    public Arme[]  display_menuAcheter(int tri) 
    {
        
        /* EN <ARRAY> CA NE MARCHE PAS  */ 
        Arme[] listearme2= {new Arme("Pistolet de seconde main", 10, 1, 80, 10),new Arme("Colt anaconda", 60, 30, 85, 400),new Arme("Calibre .44 PN", 70, 25, 70, 450),new Arme("Colt baby dragon", 80, 10, 80, 600),new Arme("Remington 1875 USA Army", 80, 53, 85, 1000),new Arme("Fusil_Henry", 30, 15, 95, 500),new Arme("fusil Sharps", 35, 10, 97, 550),new Arme("Winchester modele 1873", 20, 5, 99, 600),new Arme("Winchester modele 1887", 35, 20, 100, 700),new Arme("Whinchester modele 1895", 45, 30, 100, 800),new Arme("Whinchester modele 1897", 150, 60, 60, 1520),new Arme("Fusil double canon", 130, 40, 55, 700),new Arme("Fusil a canon scié", 170, 50, 33, 900),new Arme("The Lucky Luke", 200, 1, 50, 1500),new Arme("Couteau", 10, 9, 100, 0)};
        if (tri ==1){
            Arrays.sort(listearme2,new Armecomparator());
        }
        if (tri ==2){
            Arrays.sort(listearme2,new ArmecomparatorAcc());
        }
        if (tri ==3){
            Arrays.sort(listearme2,new ArmecomparatorMax());
        }
        if (tri ==4){
            Arrays.sort(listearme2,new ArmecomparatorMin());
        }
        clearScreen(2);
        printList(listearme2);
        clearScreen(2);
        return listearme2;
    }


    /* Méthode qui permet de demander à l'utilisateur le choix de l'arme qu'il veut faire 
    ou le choix du tri des armes*/
    /* NB : l'arme acheté n'a pas de position fixe , c'est a dire que quelque soit le choix 
    de l'utilisateur , l'arme acheté correspondra au numéro à coté de manière dynamique*/
    public void questionAcheterArme(Player player, int i ) 
    {
        clearScreen(20);
        System.out.println(ANSI_BLUE+"Vous avez actuellement " + player.getArgent()+ " $"+ANSI_RESET);
        System.out.println("");
	System.out.println("Que voulez vous Acheter?");
 
        Arme[]  listearme2=display_menuAcheter(i);
         int tri=1;
        System.out.println("");
        
        int a=0;
        
        int q = Test.test();
	switch (q) 
	{
   
  
	    case 0:
             System.out.println("");  
                a = player.getArgent()-listearme2[0].getprix();
                player.add_argent(-listearme2[0].getprix(), player);
                if (a>-1){
                    player.SetGun(listearme2[0]);   }
                else {
                    sleep(1000);
                }
                Acheter(player);
            System.out.println("");    
	    break;
            
            case 1:
             System.out.println(""); 
             a = player.getArgent()-listearme2[1].getprix();
                player.add_argent(-listearme2[1].getprix(), player);
                if (a>-1){
                    player.SetGun(listearme2[1]); }
                else {
                    sleep(1000);
                }
                Acheter(player);
            System.out.println("");    
	    break;
            
            case 2:
             System.out.println("");
             a = player.getArgent()-listearme2[2].getprix();
                player.add_argent(-listearme2[2].getprix(), player);
                System.out.println("a= "+a);
                if (a>-1){
                    player.SetGun(listearme2[2]); }
                else {
                    sleep(1000);
                }
                Acheter(player);
            System.out.println("");    
	    break;
            
            case 3:
             System.out.println("");  
             a = player.getArgent()-listearme2[3].getprix();
                player.add_argent(-listearme2[3].getprix(), player);
                if (a>-1){
                    player.SetGun(listearme2[3]); }
                else {
                    sleep(1000);
                }
                Acheter(player);
            System.out.println("");    
	    break;
            
            case 4:
             System.out.println("");  
             a = player.getArgent()-listearme2[4].getprix();
                player.add_argent(-listearme2[4].getprix(), player);
                if (a>-1){
                    player.SetGun(listearme2[4]); }
                else {
                    sleep(1000);
                }
                Acheter(player);
            System.out.println("");    
	    break;
            
            case 5:
             System.out.println("");   
             a = player.getArgent()-listearme2[5].getprix();
                player.add_argent(listearme2[5].getprix(), player);
                if (a>-1){
                    player.SetGun(listearme2[5]); }
                else {
                    sleep(1000);
                }
                Acheter(player);
            System.out.println("");    
	    break;
            
            case 6:
             System.out.println("");
             a = player.getArgent()-listearme2[6].getprix();
                player.add_argent(-listearme2[6].getprix(), player);
                if (a>-1){
                    player.SetGun(listearme2[6]); }
                else {
                    sleep(1000);
                }
                Acheter(player);
            System.out.println("");    
	    break;
            
            case 7:
             System.out.println("");  
             a = player.getArgent()-listearme2[7].getprix();
                player.add_argent(-listearme2[7].getprix(), player);
                if (a>-1){
                    player.SetGun(listearme2[7]); }
                else {
                    sleep(1000);
                }
                Acheter(player);
            System.out.println("");    
	    break;
            
            case 8:
             System.out.println("");   
             a = player.getArgent()-listearme2[8].getprix();
                player.add_argent(-listearme2[8].getprix(), player);
                if (a>-1){ 
                    player.SetGun(listearme2[8]); }
                else {
                    sleep(1000);
                }
                Acheter(player);
            System.out.println("");    
	    break;
            
            case 9:
             System.out.println("");
             a = player.getArgent()-listearme2[9].getprix();
                player.add_argent(-listearme2[9].getprix(), player);
                if (a>-1){
                    player.SetGun(listearme2[9]); }
                else {
                    sleep(1000);
                }
                Acheter(player);
            System.out.println("");    
	    break;
            
            case 10:
             System.out.println(""); 
             a = player.getArgent()-listearme2[10].getprix();
                player.add_argent(-listearme2[10].getprix(), player);
                if (a>-1){
                    player.SetGun(listearme2[10]); }
                else {
                    sleep(1000);
                }
                Acheter(player);
            System.out.println("");    
	    break;
            
            case 11:
             System.out.println("");  
             a = player.getArgent()-listearme2[11].getprix();
                player.add_argent(-listearme2[11].getprix(), player);
                if (a>-1){
                    player.SetGun(listearme2[11]); }
                else {
                    sleep(1000);
                }
                Acheter(player);
            System.out.println("");    
	    break;
            
            case 12:
             System.out.println("");   
             a = player.getArgent()-listearme2[12].getprix();
                player.add_argent(-listearme2[12].getprix(), player);
                if (a>-1){
                    player.SetGun(listearme2[12]); }
                else {
                    sleep(1000);
                }
                Acheter(player);
            System.out.println("");    
	    break;
            
            case 13:
             System.out.println("");  
             a = player.getArgent()-listearme2[13].getprix();
                player.add_argent(-listearme2[13].getprix(), player);
                if (a>-1){
                    player.SetGun(listearme2[13]); }
                else {
                    sleep(1000);
                }
                Acheter(player);
            System.out.println("");    
	    break;
            
            case 14:
             System.out.println("");  
             a = player.getArgent()-listearme2[14].getprix();
                player.add_argent(-listearme2[14].getprix(), player);
                if (a>-1){
                    player.SetGun(listearme2[14]); }
                else {
                    sleep(1000);
                }
                Acheter(player);
            System.out.println("");    
	    break;
           
            case 15: 
              clearScreen(1);  
              System.out.println(ANSI_BLUE+"TRI PAR PRIX "+ANSI_RESET);     
              clearScreen(1);  
              Arrays.sort(listearme2,new Armecomparator());
              clearScreen(2);
              printList(listearme2);
                
             break;
             case 16: 
              clearScreen(1);  
              System.out.println(ANSI_BLUE+"TRI PAR ACCURACY "+ANSI_RESET);     
              tri=2;
             break;
             
             case 17: 
              clearScreen(1);  
              System.out.println(ANSI_BLUE+"TRI PAR ACCURACY "+ANSI_RESET);  
              tri=3;
             break;
             
             case 18: 
              clearScreen(1);  
              System.out.println(ANSI_BLUE+"TRI PAR ACCURACY "+ANSI_RESET);    
              tri=4;
             break;
  
             case 19:
            Menu(player);
            System.out.println(" ");
	    break;
            default:
            questionAcheterArme(player,1);
            System.out.println();
	    System.err.println ( "Erreur" );
	    break;
      
	}
        questionAcheterArme(player,tri);
    }
   
    
    /* Méthode qui permet d'afficher un nombre d'espace voulu */
      private static void taille(String mot,int max){
        int taillemot=mot.length();
        for (int i = 0; i < max-taillemot; ++i) 
            System.out.print(" ");
    }

      
    /* Méthode pour passer à la ligne j fois*/
    public static void clearScreen(int j) {  
        for (int i = 0; i < j; ++i) System.out.println("");

    }

    /* Méthode pour demander à l'utilisateur d'appuyer sur entrer */
    public static void pressenter(){
        Scanner readinput = new Scanner(System.in);
        String enterkey = "appuyer sur entrer...";
        System.out.print(enterkey);
        enterkey = readinput.nextLine();
        System.out.print(enterkey);
    
    }
    
    /* Méthode affichant le menu */
    public void display_menu() 
    {
	System.out.println("1) Acheter  \n2) Vendre \n3) Quitter");
    }
 
    /* Méthode affichant la localisation*/
     public void display_location()
    {
        System.out.println("1) Saloon  \n2) Banque \n3) Prison \n4) Eglise \n5) Extérieur \n6) Rester");
	
    }
    
     /* Override d'interfance location pour changer le player d'endroit*/
    @Override
    public void changelocation(Player player) {
        
        System.out.println("Ou voulez-vous aller ?");
        Saloon le7iemeciel = new Saloon("Le 7 ième ciel",10,"NULL");
        Banque Banque_Populaire = new Banque("Banque Populaire",0,0);
        Eglise SantaMaria = new Eglise("SantaMaria",10);
        Prison Lockcity = new Prison("Lockcity",50,"NULL");
        FarWest Farwest = new FarWest("Farwest", 0);
        
        display_location();
        int q = Test.test();
        switch (q) 
	{
   
	    case 1:
                System.out.println(); 
                System.out.println("Vous entrez dans le Saloon.");    
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
                System.out.println("Vous entrez dans la Prison");
                player.SetLocation(Lockcity);
                Lockcity.Menu(player);
                break;
            case 4:
                System.out.println(); 
                System.out.println("Vous entrez dans l'Eglsise");
                player.SetLocation(SantaMaria);
                SantaMaria.Menu(player);               
                break;
            
            case 5:
                System.out.println("");
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
        
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
     /* Override d'interfance Menu pour faire un choix à l'utilisateur*/
    @Override
    public void Menu(Player player) {
        
        System.out.println();
	System.out.println(ANSI_GREEN_BACKGROUND+ ANSI_WHITE+"Vous êtes dans l'armurie !"+ ANSI_RESET);
	System.out.println("Que voulez vous faire ?");

        display_menu();
        int q = Test.test();
	switch (q) 
	{
   
  
	    case 1:
            System.out.println();    
	    System.out.println ("Achetons une nouvelle arme !" );
            Acheter(player);
	    break;
  
	    case 2:
            System.out.println();
	    System.out.println ( "Vendons notre arme..." );
	    Vendre(player);
	    break;
            case 3:
                System.out.println("Quitter");
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
