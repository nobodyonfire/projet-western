package projet.java.western;

import java.util.Random;
import java.util.Scanner;
import projet.java.western.Sherif;
import static projet.java.western.ProjetJavaWestern.listearme;
import static projet.java.western.Personnages.ANSI_RESET;
import static projet.java.western.ProjetJavaWestern.duel;
import static projet.java.western.Saloon.ANSI_GREEN_BACKGROUND;
import static projet.java.western.Saloon.ANSI_WHITE;

/* Classe prison qui est une location */
public class Prison extends Location{
    
    /* Initialisation des variables */
    public static final FarWest Farwest = new FarWest("Farwest", 0);
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public static final String ANSI_BLUE = "\u001B[34m";
    
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    

    
    /* Constructeurs */
    public Prison(String Nom,int Danger){
        super(Nom,Danger);
    }
    
    public int getDanger(){
        return this.Danger;
    }
    
    /* Méthode pour la rencontre avec le shérif */
    public void Sherif(Player player){  
        
        System.out.println("");
        System.out.println(ANSI_GREEN+"Sherif : Salut mon petit , tu veux une quête ?"+ANSI_RESET);
        System.out.println("");
        System.out.println("1) oui");
        System.out.println("2) non");
        System.out.println("");
        int q = Test.test();
        switch (q) 
	{
	    case 1:
                Sherifquete(player);
                break;
  
	    case 2:
                Menu(player);
                break;
  
        
        }  
    }
    
    /* Méthode qui permet de recevoir la quete */
    public void Sherifquete(Player player){
        
        
        if (player.getNiveau() == 10 && finale == false){
            
            finale = true;
            System.out.println("");
            Sherif Robbert = new Sherif("Robbert",le7iemeciel, The_Lucky_Luck);
            Brigand Boss = new Brigand("Mike le M", Farwest, The_Lucky_Luck, false, 100, 10);
            player.setBrigand(Boss);
            Robbert.chefbrigand(player);
            System.out.println("");
            System.out.println("Partons à la recherche de '"+ Boss.getName()+"'");
            System.out.println("");
            System.out.println(ANSI_GREEN+"Sherif : Bon courage petit !"+ANSI_RESET);
            System.out.println("");
        }
        else{
            System.out.println("");
            Brigand brigandquete = Brigand.createBrigand(1,Farwest, listearme().get(getRandomNumberInRange(0, listearme().size()-1)), player);
            player.setBrigand(brigandquete);
            System.out.println("");
            System.out.println("Partons à la recherche de '"+ brigandquete.getName()+"'");
            System.out.println("");
            System.out.println(ANSI_GREEN+"Sherif : Bon courage petit !"+ANSI_RESET);
            System.out.println("");
        }
        pressenter();
        Menu(player);
    }
    
    /* Méthode pour réclamer la prime ( oui on a écrit recalmer au lieu de reclamer ) */
    public void recalmerprime(Player player){
        
        if (player.getquetedone()==true){
            
            if ("Mike le M".equals(player.getBrigand().getName())) {
                Robbert.fin(player);
                System.out.println("");
                player.niveau.add_xp(player, player.brigand.Drop_xp_curve(player.brigand));
                player.add_argent(3000, player);
                player.soin(300, player);  
                player.setBrigand(null);
                player.setquetedone(false);
            }
            System.out.println("");
            System.out.println(ANSI_GREEN+"Sherif : WOW ! tu as fait du bon boulot !"+ANSI_RESET);
            System.out.println(ANSI_GREEN+"Sherif : Voici ta récompense .."+ANSI_RESET);
            System.out.println("");
            player.niveau.add_xp(player, player.brigand.Drop_xp_curve(player.brigand));
            player.add_argent(500, player);
            player.soin(50, player);  
            player.setBrigand(null);
            player.setquetedone(false);
        }
        else {
            if (player.getquetedone()){
                System.out.println("Vous n'avez ramené le brigand !");
            }
            else {
                System.out.println("Vous n'avez aucune prime !");
            }
            
        }
        Menu(player); 
    }
    
    /* Méthode qui permet de faire un test d'évasion
    Il y a une chance que en arrivant dans la prison , un prisonier s'échape*/
    public void testevasion(Player player){
        int a=getRandomNumberInRange(0,10-getDanger());
        if (a==0){
            
        System.out.println(ANSI_GREEN+"Robert: Un prisonnier s'échappe !"+ANSI_RESET);
        pressenter(); System.out.println("");
        System.out.println(ANSI_GREEN+"Sherif : Eh " + player.getName() + " aide moi à le capturer  !"+ANSI_RESET);
        pressenter(); System.out.println("");
        System.out.println("");
        Brigand Jacob = Brigand.createBrigand(1,new Eglise("SantaMaria",10),new Arme("Pistolet de seconde main", 10, 1, 80, 10), player);
        duel(player, Jacob);
        recompense(player);
        }
    }
    
    /* Méthode qui permet de donner une récompense au joueur */
    public void recompense(Player player){
        player.add_argent(200, player);
    }
    
    
    /* Méthode qui permet d'avoir un nom entre min et max */
    @Override
    public int getRandomNumberInRange(int min, int max) {
	if (min >= max) {
		throw new IllegalArgumentException("MAX > MIN");
	}
	Random r = new Random();
	return r.nextInt((max - min) + 1) + min;
    }
    
    /* Méthode permettant d'afficher le menu */
    @Override
      public void display_menu() 
    {
	System.out.println("1) Parler au sherif \n2) Réclamer prime \n3) Partir");
    }
    
    /* Méthode permettant d'afficher la localisation */
    @Override
     public void display_location()
    {

        System.out.println("1) Saloon  \n2) Banque \n3) Armurerie \n4) Eglise \n5) Sortir de la ville \n6) Rester");
	
    }
    
    /* Méthode qui permet de changer de location */
    @Override
    public void changelocation(Player player) {
        
        System.out.println("Où voulez-vous aller ? ?");
        System.out.println("");

        
        display_location();
        int q = Test.test();
        switch (q) 
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
                System.out.println("Vous entrez dans le Far west. Faites attention! Le danger rôde.");
                player.SetLocation(Farwest);
                Farwest.Menu(player);
                break;
            
            case 6:
 
                System.out.println();
                System.err.println ( "Je vais rester. Peut-être qu'un prisonnier va s'échapper." );
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

    /* Méthode pour demander à l'utilisateur d'appuyer sur entrer */
    @Override
     public void pressenter(){
        Scanner readinput = new Scanner(System.in);
        String enterkey = "appuyer sur entrer...";
        System.out.print(enterkey);
        enterkey = readinput.nextLine();
        System.out.print(enterkey);
    
    }

     /* Override d'interfance Menu pour faire un choix à l'utilisateur*/
    @Override
    public void Menu(Player player) {
        
        System.out.println();
	System.out.println(ANSI_GREEN_BACKGROUND+ ANSI_WHITE+"Vous êtes dans la prison !"+ ANSI_RESET);
        testevasion(player);
	System.out.println("Que voulez-vous faire ?");

       
	
        display_menu();
        
        int q = Test.test();
	switch (q) 
	{
   
  
	    case 1:
                System.out.println("");    
                System.out.println ("Allons parler au sherif" );
                Sherif(player);
	    break;
  
	    case 2:
                System.out.println("");
                System.out.println ( "Réclamons notre prime !" );
                recalmerprime(player);
	    break;
            case 3:
                System.out.println("");
                System.out.println("Je pars d'ici !");
                changelocation(player);
	    default:
                Menu(player);
                System.out.println("");
                System.err.println ( "Erreur" );
	    break;
              
	}
    }
    
    Sherif Robbert = new Sherif("Robbert",Lockcity, The_Lucky_Luck);
    private static final Saloon le7iemeciel = new Saloon("Le 7 ième ciel",0);
    private static final Prison Lockcity = new Prison("Lockcity",6);
    private static final Armurie Bangout = new Armurie("Bangout",0);
    private static final Eglise SantaMaria = new Eglise("SantaMaria",0);
    private static final FarWest FarWest = new FarWest("Far West",0);
    private static final Banque Banque_Populaire = new Banque("Banque Populaire", 2, 0);
    private static final Arme The_Lucky_Luck = new Arme("The Lucky Luke", 200, 1, 50, 1500);
    private static boolean finale = false;
}