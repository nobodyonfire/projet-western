package projet.java.western;
import java.util.Random;
import java.util.Scanner; 
import static projet.java.western.ProjetJavaWestern.listearme;
import static projet.java.western.ProjetJavaWestern.clearScreen;
import static projet.java.western.ProjetJavaWestern.duel;
import static projet.java.western.ProjetJavaWestern.sleep;
import static projet.java.western.Saloon.ANSI_GREEN_BACKGROUND;
import static projet.java.western.Saloon.ANSI_RESET;
import static projet.java.western.Saloon.ANSI_WHITE;

/* Classe FarWest qui est une location */
public class FarWest extends Location implements Move_Location, Menu{
    
    /* Initialisation des variables */
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public static final String ANSI_BLUE = "\u001B[34m";
    
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    private static final FarWest FarWest = new FarWest("Far West",0);
    
    int Stocke;
    
    /* Constructeur */
    public FarWest(String Nom,int Danger){
        super(Nom,Danger);

    }

    /* Méthode permettant de commmencer l'exploration */
    public void Explorer (Player player){
        
        clearScreen(50);
        
        int curseur = 50;
        int[] profondeur = {50,0,0,0,0,0,0,0,0,0};
        int niveau= 0;
        int random=1;
        
        System.out.println("");
        System.out.println(ANSI_BLUE+"Vous allez entrer dans le Far West "+ANSI_RESET);
        System.out.println("");
        System.out.println(ANSI_GREEN+"O"+ANSI_RESET+" : Votre position");
        System.out.println(ANSI_RED+"X"+ANSI_RESET+" : Du bruit !");
        System.out.println("");
        map.printchemin(curseur,random);
        System.out.println("");
        pressenter();
        explorercarte2(player,niveau,profondeur,curseur,random);
        
        sleep(50000);
        
    }
   
    /* Méthode qui permet d'afficher la carte actuelle + la carte visité + effectuer une action si l'endroit vaut le lieu */
    public void explorercarte2(Player player,int niveau,int[] profondeur,int curseur,int random){
        
        if (profondeur[8]!=0){
            
            System.out.println(ANSI_BLUE+"Vous vous êtes égaré.."+ANSI_RESET);
            player.soin(-10, player);
            Explorer(player);
            
        }

        random= getRandomNumberInRange(1,3);
        
        printcarteactuelle(profondeur,niveau,curseur,random);
   
        System.out.println("");
        System.out.println(ANSI_BLUE+"Vous avez actuellement :"+ player.getHP()+" HP"+ANSI_RESET);
        System.out.println("");
        System.out.println("1) Gauche \n2) Milieu \n3) Droite \n4) Revenir en arrière \n5) Quitter");
        System.out.println("");
        System.out.println("Où voulez-vous aller ?");
        int q = Test.test();  
        switch (q) 
	{
	    case 1:
                niveau=niveau+1; 
                curseur=curseur-5;
                profondeur[niveau]=curseur;
                
                if (random==1){
                    actionexplorer(player);
                    pressenter();
                }
                explorercarte2(player,niveau,profondeur,curseur,random);
       
            break;
            
            case 2:
                niveau=niveau+1; 
                profondeur[niveau]=curseur;
                
                if (random==2){
                    actionexplorer(player);
                    pressenter();
                }
                explorercarte2(player,niveau,profondeur,curseur,random);
       
            break;
            case 3:
                niveau=niveau+1; 
                curseur=curseur+5;
                profondeur[niveau]=curseur;

                if (random==3){
                    actionexplorer(player);
                    pressenter();
                }
                explorercarte2(player,niveau,profondeur,curseur,random);
       
            break;
            
            case 4:
                if (niveau<1){      
                    explorercarte2(player,niveau,profondeur,curseur,random);
                }
                niveau=niveau-1;
                curseur=profondeur[niveau];
                explorercarte2(player,niveau,profondeur,curseur,random);
                break;  
                
            case 778899:
                /* EASTER EGG / CHEAT CODE  ( pour ajouter de la profondeur au jeu ) */
                player.soin(20, player);
                explorercarte2(player,niveau,profondeur,curseur,random);
                break;  
                
            case 5:
                Menu(player);
                break;
  
            default:
                explorercarte2(player,niveau,profondeur,curseur,random);
            break;
            
        }
        
    }
    
    /* Méthode pour afficher la carte actuelle */
    public void printcarteactuelle(int[] profondeur,int niveau,int curseur,int random){
        clearScreen(50);
        for (int i = 0; i < niveau; ++i) {
             map.printpartchemin(profondeur[i]);
        }    
        profondeur[niveau]=curseur;
        map.printchemin(curseur,random-1);
    }
    
    /* Méthode qui permet d'effectuer une action aléatoire en cas de rencontre avec un bruit */
    public void actionexplorer(Player player){
        
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

     

             int brigandrd = 0;
             if (player.getquetedone()==false){
                 brigandrd=getRandomNumberInRange(0,2); 
             }
             else{
                 brigandrd = 1;
             }

             
             if (brigandrd!=0){

                Brigand brigand = Brigand.createBrigand(1,FarWest, listearme().get(getRandomNumberInRange(0, listearme().size()-1)), player);
                
                if (duel(player,brigand)==true){
                    System.out.println("");
                    System.out.println(ANSI_BLUE+"Vous l'avez terrassé !"+ANSI_RESET);
                    player.soin(10, player);
                    player.add_argent(20, player);
                }
                    
                Menu(player);

             }
             
             
             else {
                Brigand brigand = player.getBrigand();
                System.out.println("");
                System.out.println(ANSI_BLUE+"Le brigand de la quête !"+ANSI_RESET);
                System.out.println("");
                duel(player,brigand);
                player.setquetedone(true);
                System.out.println("");
                System.out.println(ANSI_BLUE+"Vous avez complété la quête du sherif !"+ANSI_RESET);
                System.out.println(ANSI_BLUE+"Voici votre première récompense !"+ANSI_RESET);
                System.out.println(ANSI_BLUE+"Retournez voir le Sherif pour réclamer votre prime !"+ANSI_RESET);
             
                player.add_argent(200, player);
                pressenter();
                Menu(player);


            }
        }  
    }
   
        
    /* Méthode qui permet d'avoir un nom entre min et max */
    private static int getRandomNumberInRange(int min, int max) {
	if (min >= max) {
		throw new IllegalArgumentException("MAX > MIN");
	}
	Random r = new Random();
	return r.nextInt((max - min) + 1) + min;
    }
    
    /* Méthode pour afficher le nom des actions */
    public void display_menu(){
        System.out.println("");
        System.out.println("Sélection: ");
        System.out.println("1) Explorer  \n4) Partir");
    }
    
    /* Méthode pour afficher les locations possibles */
    public void display_location(){
        
        System.out.println("Sélection: ");
        System.out.println("1) Saloon  \n2) Armurerie \n3) Prison \n4) Eglise \n5) Banque \n6) Rester");
    }

     /* Override d'interfance Menu pour faire un choix à l'utilisateur*/
    @Override
    public void changelocation(Player player) {
        
        Prison Lockcity = new Prison("Lockcity",50,"NULL");
        Armurie Bangout = new Armurie("Bangout",10,"NULL");
        Eglise SantaMaria = new Eglise("SantaMaria",10);
        Saloon le7iemeciel = new Saloon("le7iemeciel", 10, "NULL");
        Banque Banque_Populaire = new Banque("Banque Populaire", 10, 0);
        
        System.out.println("Où voulez-vous aller ?");

        
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
              
            default:
                System.out.println("");
                System.err.println ( "Erreur" );
                changelocation(player);
	    break;
	}
        throw new UnsupportedOperationException("Erreur"); 
    }
    
     /* Override d'interfance Menu pour faire un choix à l'utilisateur*/
    @Override
    public void Menu(Player player) {
        System.out.println();
        System.out.println(ANSI_GREEN_BACKGROUND+ ANSI_WHITE+"Vous êtes au FarWest !"+ ANSI_RESET);
        System.out.println();

        display_menu();
        int q = Test.test();
        switch (q) 
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
                System.err.println ( "Erreur" );
                break;
              
	}
        
        throw new UnsupportedOperationException("Erreur"); 
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
    
}